package com.infogen.server.model;

import java.time.Clock;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.infogen.configuration.InfoGen_Configuration;

/**
 * 为本地调用处理扩展的节点属性
 * 
 * @author larry/larrylv@outlook.com/创建时间 2015年7月17日 下午5:30:01
 * @since 1.0
 * @version 1.0
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, setterVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class RemoteNode extends RegisterNode {
	private static final long serialVersionUID = 6574571562904280439L;
	@JsonIgnore
	public transient Long disabled_time = Clock.system(InfoGen_Configuration.zoneid).millis();
}
