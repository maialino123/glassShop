package com.glassProject.utils;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class formUtils {
	@SuppressWarnings("unchecked")
	public static final <T> T toModel(Class<T> clazz, HttpServletRequest req) {
		T object = null;
		try {
			object = clazz.newInstance();
			BeanUtils.populate(object, req.getParameterMap());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		return object;

	}
}
