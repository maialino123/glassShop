package com.glassProject.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.glassProject.model.newModel;

public class newsMapper implements rowMapper<newModel> {

	public newModel maprow(ResultSet rs) {
		try {
			newModel newModel = new newModel();
			newModel.setNewId(rs.getLong("newId"));
			newModel.setTitle(rs.getString("title"));
			newModel.setMetaTile(rs.getString("metaTitle"));
			newModel.setDescription(rs.getString("description"));
			newModel.setNewImage(rs.getString("newImage"));
			newModel.setNewCategoryId(rs.getLong("newCategoryId"));
			newModel.setDetal(rs.getString("detail"));
			newModel.setCreatedDate(rs.getTimestamp("createdDate"));
			newModel.setCreatedBy(rs.getString("createdBy"));
			if (rs.getTimestamp("modifiedDate") != null) {
				newModel.setModifiedDate(rs.getTimestamp("modifiedDate"));
			}
			if (rs.getString("modifiedBy") != null) {
				newModel.setModifiedBy(rs.getString("modifiedBy"));
			}
			newModel.setMetaKeywords(rs.getString("metaKeywords"));
			newModel.setMetaDescription(rs.getString("metaDescriptions"));
			newModel.setStatus(rs.getBoolean("status"));
			newModel.setTopHot(rs.getTimestamp("topHot"));
			newModel.setViewCount(rs.getInt("viewCount"));
			newModel.setTagId(rs.getString("tagId"));
			return newModel;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
