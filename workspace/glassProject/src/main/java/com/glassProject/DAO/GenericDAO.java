package com.glassProject.DAO;

import java.util.List;

import com.glassProject.Mapper.rowMapper;

public interface GenericDAO<T> {
	<T> List<T> query(String sql, rowMapper<T> rowMapper, Object... parameters);
	Long insert(String sql , Object... parameters);
	void update(String sql , Object... parameters);
	Integer queryCount(String sql , Object... parameters);
}
