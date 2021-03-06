package com.glassProject.DAO.impl;

import java.util.List;

import com.glassProject.DAO.IProductCategoryDAO;
import com.glassProject.Mapper.productCategoryMapper;
import com.glassProject.model.productCategoryModel;
import com.glassProject.paging.pageble;

public class productCategoryDAO extends abstractDAO<productCategoryModel> implements IProductCategoryDAO {

	public List<productCategoryModel> findAll(pageble pageble) {
		StringBuilder sql = new StringBuilder("SELECT * FROM productcategorys");
		if (pageble.getSorter().getSortName() != null && pageble.getSorter().getSortBy() != null) {
			sql.append(" order by "+pageble.getSorter().getSortName()+" "+pageble.getSorter().getSortBy()+" ");
		}
		if (pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" limit "+pageble.getOffset()+","+pageble.getLimit());
		}
		return query(sql.toString(), new productCategoryMapper());
	}

	public productCategoryModel findOne(Long id) {
		String sql = "select * from productCategorys where categoryId = ?";
		List<productCategoryModel> data = query(sql.toString(), new productCategoryMapper(), id);
		return data.isEmpty() ? null : data.get(0);
	}

	public Long add(productCategoryModel categoryModel) {
		StringBuilder sql = new StringBuilder("insert into ProductCategorys");
		sql.append(
				"(name,metaTitle,parentId,displayOrder,seoTitle,createdDate,createdBy,metaKeywords,metaDescriptions,");
		sql.append("status,showOnHome) values (?,?,?,?,?,?,?,?,?,?,?)");
		return insert(sql.toString(), categoryModel.getName(),categoryModel.getMetaTitle(),categoryModel.getParentId(),
				categoryModel.getDisplayOrder(),categoryModel.getSeoTitle(),categoryModel.getCreatedDate(),categoryModel.getCreatedBy(),
				categoryModel.getMetaKeywords(),categoryModel.getMetaDescription(),categoryModel.isStatus(),categoryModel.isShowOnHome()
				);
	}

	public void edit(productCategoryModel categoryModel) {
		StringBuilder sql = new StringBuilder(
				"update productCategorys set name = ? , metaTitle = ? , parentId = ? , displayOrder = ?,");
		sql.append(
				"seoTitle = ? , createdDate = ? , createdBy = ? , modifiedDate = ? , modifiedBy = ? , metaKeywords = ? , metaDescriptions = ?,");
		sql.append("status = ? , showOnHome = ? where categoryId = ?");

		update(sql.toString(), categoryModel.getName(), categoryModel.getMetaTitle(), categoryModel.getParentId(),
				categoryModel.getDisplayOrder(), categoryModel.getSeoTitle(), categoryModel.getCreatedDate(),
				categoryModel.getCreatedBy(), categoryModel.getModifiedDate(), categoryModel.getModifiedBy(),
				categoryModel.getMetaKeywords(), categoryModel.getMetaDescription(), categoryModel.isStatus(),
				categoryModel.isShowOnHome(), categoryModel.getCategoryId());

	}

	public void delete(String name) {
		String sql = "delete from productCategorys where name = ?";
		update(sql.toString(), name);

	}

	public Integer getCount() {
		String sql = "select count(*) from productcategorys";
		return queryCount(sql.toString());
	}

}
