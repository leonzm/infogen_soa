package com.infogen.tracking;

/**
 * 用于调用链传递时的key
 * 
 * @author larry/larrylv@outlook.com/创建时间 2015年6月8日 下午2:34:47
 * @since 1.0
 * @version 1.0
 */
public enum HTTP_Header {
	x_track_id("x-track", "trackid"), //
	x_session_id("x-session", "session id"), //
	x_identify("x-iden", "identify"), //
	x_sequence("x-seq", "sequence"), //
	x_referer("x-ref", "referer"), //
	Referer("Referer", "Referer"), //
	x_referer_ip("x-ref-ip", "referer_ip");

	public String key;
	public String note;

	private HTTP_Header(String key, String note) {
		this.key = key;
		this.note = note;
	}
}
