package com.glassProject.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.glassProject.model.roleModel;
import com.glassProject.model.userModel;

public class userMapper implements rowMapper<userModel> {

	public userModel maprow(ResultSet rs) {
		try {
			userModel userModel = new userModel();
			userModel.setUserId(rs.getLong("userId"));
			userModel.setUserName(rs.getString("userName"));
			userModel.setPassword(rs.getString("password"));
			userModel.setFirstName(rs.getString("firstName"));
			userModel.setLastName(rs.getString("lastName"));
			userModel.setAddress(rs.getString("address"));
			userModel.setEmail(rs.getString("email"));
			userModel.setRoleId(rs.getLong("roleId"));
			userModel.setCreatedDate(rs.getTimestamp("createdDate"));
			userModel.setCreatedBy(rs.getString("createdBy"));
			if (rs.getTimestamp("modifiedDate") != null) {
				userModel.setModifiedDate(rs.getTimestamp("modifiedDate"));
			}
			if (rs.getString("modifiedBy") != null) {
				userModel.setModifiedBy(rs.getString("modifiedBy"));
			}
			userModel.setMetaKeyword(rs.getString("metaKeywords"));
			userModel.setMetaDescription(rs.getString("metaDescriptions"));
			userModel.setStatus(rs.getBoolean("status"));
			try {
				roleModel role = new roleModel();
				role.setRoleName(rs.getString("roleName"));
				role.setCode(rs.getString("code"));
				userModel.setRole(role);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			return userModel;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
