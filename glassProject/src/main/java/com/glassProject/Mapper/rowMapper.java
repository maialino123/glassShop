package com.glassProject.Mapper;

import java.sql.ResultSet;

public interface rowMapper<T> {
	T maprow(ResultSet rs);
}
