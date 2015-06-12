/**
 * 
 */
package com.infogen;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.apache.thrift.TException;

import com.infogen.cache.InfoGen_Cache_Server;
import com.infogen.http.callback.Http_Callback;
import com.infogen.server.model.NativeNode;
import com.infogen.server.model.NativeNode.NetType;
import com.infogen.server.model.NativeNode.RequestType;
import com.infogen.server.model.NativeServer;
import com.infogen.util.BasicNameValuePair;
import com.infogen.util.CODE;
import com.infogen.util.Return;

/**
 * 调用服务的封装 实现调度,错误重试,同步异步处理等
 * 
 * @author larry
 * @email larrylv@outlook.com
 * @version 创建时间 2014年10月30日 下午1:48:19
 */
public class Service {
	public static final Logger logger = Logger.getLogger(Service.class.getName());
	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static InfoGen instance = InfoGen.getInstance();
	private String server_name;
	private ConcurrentHashMap<String, NativeServer> depend_server = InfoGen_Cache_Server.getInstance().depend_server;
	private NetType net_type = NetType.LOCAL;

	public static Service create(String server_name) {
		return new Service(server_name);
	}

	public static Service create(String server_name, NetType net_type) {
		return new Service(server_name, net_type);
	}

	public Service(String server_name) {
		this.server_name = server_name;
		// 初始化
		instance.get_server(server_name);
	}

	/**
	 * 指定网络类型是内网还是外网
	 * 
	 * @param server_name
	 * @param net_type
	 */
	public Service(String server_name, NetType net_type) {
		this.net_type = net_type;
		this.server_name = server_name;
		// 初始化
		instance.get_server(server_name);
	}

	// ///////////////////////////////////////////////////NODE/////////////////////////////////////////////////////
	public NativeNode get_node() {
		NativeServer server = depend_server.get(server_name);
		return server.random_node();
	}

	public void disabled_node(NativeNode node) {
		NativeServer server = depend_server.get(server_name);
		server.disabled(node);
	}

	// //////////////////////////////////////////////////RPC////////////////////////////////////////////////////////////////////////
	@Deprecated
	public Return blocking_rpc(String method, Map<String, String> name_value_pair) {
		NativeServer server = depend_server.get(server_name);
		if (server == null) {
			return Return.FAIL(CODE._402);
		}
		NativeNode node = null;
		// 调用出错重试3次
		for (int i = 0; i < 3; i++) {
			try {
				node = server.random_node();
				if (node == null) {
					return Return.FAIL(CODE._403);
				}
				return node.call_once("", method, name_value_pair);
			} catch (TException e) {
				logger.error("调用失败".concat(e.getMessage()));
				server.disabled(node);
				continue;
			}
		}
		return Return.FAIL(CODE._500);
	}

	// //////////////////////////////////////////////////HTTP///////////////////////////////////////////////////////////////////////
	private Map<String, String> pair_to_map(List<BasicNameValuePair> name_value_pair) {
		Map<String, String> map = new HashMap<>();
		name_value_pair.forEach(pair -> {
			map.put(pair.getName(), pair.getValue());
		});
		return map;
	}

	/**
	 * 同步get调用
	 * 
	 * @param url
	 * @param map
	 * @return
	 */
	public Return get(String url, Map<String, String> name_value_pair) {
		return blocking_http(url, name_value_pair, RequestType.GET, net_type);
	}

	@Deprecated
	public Return get(String url, List<BasicNameValuePair> name_value_pair) {
		return blocking_http(url, pair_to_map(name_value_pair), RequestType.GET, net_type);
	}

	/**
	 * 同步post调用
	 * 
	 * @param url
	 * @param map
	 * @return
	 */
	public Return post(String url, Map<String, String> name_value_pair) {
		return blocking_http(url, name_value_pair, RequestType.POST, net_type);
	}

	@Deprecated
	public Return post(String url, List<BasicNameValuePair> name_value_pair) {
		return blocking_http(url, pair_to_map(name_value_pair), RequestType.POST, net_type);
	}

	/**
	 * 异步get调用
	 * 
	 * @param url
	 * @param map
	 * @return
	 */
	public Http_Callback async_get(String url, Map<String, String> name_value_pair) {
		return async_http(url, name_value_pair, RequestType.GET, net_type);
	}

	/**
	 * 异步post调用
	 * 
	 * @param url
	 * @param map
	 * @return
	 */
	public Http_Callback async_post(String url, Map<String, String> name_value_pair) {
		return async_http(url, name_value_pair, RequestType.POST, net_type);
	}

	/**
	 * 同步http调用
	 * 
	 * @param method
	 * @param name_value_pair
	 * @param request_type
	 * @param net_type
	 * @return
	 */
	private Return blocking_http(String method, Map<String, String> name_value_pair, RequestType request_type, NetType net_type) {
		NativeServer server = depend_server.get(server_name);
		if (server == null) {
			return Return.FAIL(CODE._402);
		}
		NativeNode node = null;
		// 调用出错重试3次
		for (int i = 0; i < 3; i++) {
			try {
				node = server.random_node();
				if (node == null) {
					return Return.FAIL(CODE._403);
				}
				String http = node.http(method, name_value_pair, request_type, net_type);
				return Return.create(http);
			} catch (IOException e) {
				logger.error("调用失败".concat(e.getMessage()));
				server.disabled(node);
				continue;
			}
		}
		return Return.FAIL(CODE._500);
	}

	/**
	 * 异步http调用
	 * 
	 * @param method
	 * @param name_value_pair
	 * @param request_type
	 * @param net_type
	 * @return
	 */
	private Http_Callback async_http(String method, Map<String, String> name_value_pair, RequestType request_type, NetType net_type) {
		Http_Callback callback = new Http_Callback();

		NativeServer server = depend_server.get(server_name);
		if (server == null) {
			callback.add(Return.FAIL(CODE._402).toJson());
			return callback;
		}
		NativeNode node = null;
		// 调用出错重试3次
		for (int i = 0; i < 3; i++) {
			node = server.random_node();
			if (node == null) {
				callback.add(Return.FAIL(CODE._403).toJson());
				return callback;
			}
			try {
				return node.async_http(method, name_value_pair, request_type, net_type);
			} catch (IOException e) {
				logger.error("调用失败", e);
				server.disabled(node);
				continue;
			}
		}
		callback.add(Return.FAIL(CODE._500).toJson());
		return callback;
	}

}
