package com.glassProject.DAO.impl;

import java.util.List;

import com.glassProject.DAO.IUserDAO;
import com.glassProject.Mapper.userMapper;
import com.glassProject.loger.ILoger;
import com.glassProject.model.userModel;

public class userDAO extends abstractDAO<userModel> implements IUserDAO {

	public userModel findByUserNameAndPasswordAndStatus(ILoger iLoger) {
		StringBuilder sql = new StringBuilder("SELECT * FROM users AS u ");
		sql.append("INNER JOIN role AS r ON r.roleId = u.roleId ");
		sql.append(" WHERE u.userName = ? AND u.password = ? AND u.status = ?");
		List<userModel> userModels = query(sql.toString(), new userMapper(), iLoger.getUserName(),iLoger.getPassWord(),iLoger.getStatus());
		return userModels.isEmpty() ? null : userModels.get(0);
	}

}
