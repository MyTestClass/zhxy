package com.xiaochen.common.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * TODO:将对象转换为JSON字符串
 * @author:KangYong 下午9:44:39
 */
public class JsonUtils {
	private static final ThreadLocal<ObjectMapper> INCLUDE_NULL_MAPPER = new ThreadLocal<ObjectMapper>();

	private static ObjectMapper getMapper() {
		ThreadLocal<ObjectMapper> tl = INCLUDE_NULL_MAPPER;
		if (null == tl.get()) {
			ObjectMapper mapper = new ObjectMapper();
			mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
			tl.set(mapper);
		}
		return tl.get();
	}
	public static String toJsonString(Object obj) throws IOException {
		return getMapper().writeValueAsString(obj);
	}

}
