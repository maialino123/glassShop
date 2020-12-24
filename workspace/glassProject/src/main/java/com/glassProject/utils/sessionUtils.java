package com.glassProject.utils;

import javax.servlet.http.HttpServletRequest;

public class sessionUtils {
	public static sessionUtils instance = null;

	public static sessionUtils getInstance() {
		if (instance == null) {
			instance = new sessionUtils();
		}
		return instance;
	}

	public void putValue(HttpServletRequest req, String key, Object value) {
		req.getSession().setAttribute(key, value);
	}

	public Object getValue(HttpServletRequest req, String key) {
		return req.getSession().getAttribute(key);
	}

	public void removeValue(HttpServletRequest req, String key) {
		req.getSession().removeAttribute(key);
	}
}
