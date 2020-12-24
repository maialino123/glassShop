package com.glassProject.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.glassProject.model.productModel;

public class productMapper implements rowMapper<productModel> {

	public productModel maprow(ResultSet rs) {
		try {
			productModel productModel = new productModel();
			productModel.setProductId(rs.getLong("productId"));
			productModel.setProductCode(rs.getString("productCode"));
			productModel.setProductName(rs.getString("productName"));
			productModel.setMetaTile(rs.getString("metaTitle"));
			productModel.setDescription(rs.getString("description"));
			productModel.setProductImage(rs.getString("productImage"));
			productModel.setPrice(rs.getFloat("price"));
			productModel.setPromotionPrice(rs.getFloat("promotionPrice"));
			productModel.setIncludeVAT(rs.getBoolean("includeVAT"));
			productModel.setQuantity(rs.getInt("quantity"));
			productModel.setCategoryId(rs.getLong("categoryId"));
			productModel.setDetail(rs.getString("detail"));
			productModel.setWarranty(rs.getInt("warranty"));
			productModel.setCreatedDate(rs.getTimestamp("createdDate"));
			productModel.setCreatedBy(rs.getString("createdBy"));
			productModel.setMetaKeywords(rs.getString("metaKeywords"));
			productModel.setMetaDescription(rs.getString("metaDescriptions"));
			productModel.setStatus(rs.getBoolean("status"));
			productModel.setViewCounts(rs.getInt("viewCounts"));
			if (rs.getTimestamp("modifiedDate") != null) {
				productModel.setModifiedDate(rs.getTimestamp("modifiedDate"));
			}
			if (rs.getString("modifiedBy") != null) {
				productModel.setModifiedBy(rs.getString("modifiedBy"));
			}
			return productModel;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
