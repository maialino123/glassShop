package com.glassProject.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.glassProject.model.productCategoryModel;

public class productCategoryMapper implements rowMapper<productCategoryModel> {

	public productCategoryModel maprow(ResultSet rs) {
		try {
			productCategoryModel categoryModel = new productCategoryModel();
			categoryModel.setCategoryId(rs.getLong("categoryId"));
			categoryModel.setName(rs.getString("name"));
			categoryModel.setMetaTitle(rs.getString("metaTitle"));
			categoryModel.setParentId(rs.getLong("parentId"));
			categoryModel.setDisplayOrder(rs.getInt("displayOrder"));
			categoryModel.setSeoTitle(rs.getString("seoTitle"));
			categoryModel.setCreatedDate(rs.getTimestamp("createdDate"));
			categoryModel.setCreatedBy(rs.getString("createdBy"));
			categoryModel.setMetaKeywords(rs.getString("metaKeywords"));
			categoryModel.setMetaDescription(rs.getString("metaDescriptions"));
			categoryModel.setStatus(rs.getBoolean("status"));
			categoryModel.setShowOnHome(rs.getBoolean("showOnHome"));
			if (rs.getTimestamp("modifiedDate") != null) {
				categoryModel.setModifiedDate(rs.getTimestamp("modifiedDate"));
			}
			if (rs.getString("modifiedBy") != null) {
				categoryModel.setModifiedBy(rs.getString("modifiedBy"));
			}
			return categoryModel;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
