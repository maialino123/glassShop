package com.glassProject.DAO.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.glassProject.DAO.GenericDAO;
import com.glassProject.Mapper.rowMapper;

public class abstractDAO<T> implements GenericDAO<T> {
	
	ResourceBundle resourceBundle = ResourceBundle.getBundle("db");

	private Connection getConnection() {
		try {
			Class.forName(resourceBundle.getString("driverName"));
			String url = resourceBundle.getString("url");
			String user = resourceBundle.getString("user");
			String password = resourceBundle.getString("password");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	public <T> List<T> query(String sql, rowMapper<T> rowMapper, Object... parameters) {
		List<T> list = new ArrayList<T>();
		Connection conn = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			stm = conn.prepareStatement(sql);
			setParameter(stm, parameters);
			rs = stm.executeQuery();
			while (rs.next()) {
				list.add(rowMapper.maprow(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
				return null;
			}
		}

	}

	private void setParameter(PreparedStatement stm, Object[] parameters) {
		try {
			for (int i = 0; i < parameters.length; i++) {
				Object parameter = parameters[i];
				int index = i + 1;
				if (parameter instanceof Long) {
					stm.setLong(index, (Long) parameter);
				} else if (parameter instanceof String) {
					stm.setString(index, (String) parameter);
				} else if (parameter instanceof Integer) {
					stm.setInt(index, (Integer) parameter);
				} else if (parameter instanceof Boolean) {
					stm.setBoolean(index, (Boolean) parameter);
				} else if (parameter instanceof Timestamp) {
					stm.setTimestamp(index, (Timestamp) parameter);
				} else if (parameter instanceof Float) {
					stm.setFloat(index, (Float) parameter);
				} else if (parameter instanceof Double) {
					stm.setDouble(index, (Double) parameter);
				} else if (parameter instanceof Date) {
					stm.setDate(index, (Date) parameter);
				} else if (parameter instanceof Short) {
					stm.setShort(index, (Short) parameter);
				} else if (parameter instanceof Byte) {
					stm.setByte(index, (Byte) parameter);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("static-access")
	public Long insert(String sql, Object... parameters) {
		Connection conn = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		Long id = null;
		try {
		    conn = getConnection();
		    conn.setAutoCommit(false);
		    stm = conn.prepareStatement(sql, stm.RETURN_GENERATED_KEYS);
		    setParameter(stm, parameters);
		    stm.executeUpdate();
		    rs = stm.getGeneratedKeys();
		    if (rs.next()) {
				id = rs.getLong(1);
			}
		    conn.commit();
		    return id;
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
				return null;
			}
			return null;
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
				return null;
			}
		}

	}

	public void update(String sql, Object... parameters) {
		Connection conn = null;
		PreparedStatement stm = null;
		try {
			conn = getConnection();
			conn.setAutoCommit(false);
			stm = conn.prepareStatement(sql);
			setParameter(stm, parameters);
			stm.executeUpdate();
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stm != null) {
					stm.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

	}

	public Integer queryCount(String sql, Object... parameters) {
		Connection conn = null;
		PreparedStatement stm = null;
        ResultSet rs = null;
        Integer count = 0;
        try {
			conn = getConnection();
			stm = conn.prepareStatement(sql);
			setParameter(stm, parameters);
			rs = stm.executeQuery();
			if (rs.next()) {
				count = rs.getInt("count(*)");
			}
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
				return 0;
			}
		}
		
	}

}
