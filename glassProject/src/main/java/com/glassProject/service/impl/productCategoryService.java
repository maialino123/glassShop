package com.glassProject.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.glassProject.DAO.IProductCategoryDAO;
import com.glassProject.model.productCategoryModel;
import com.glassProject.paging.pageble;
import com.glassProject.service.IProductCategoryService;

public class productCategoryService implements IProductCategoryService {
	
	@Inject private IProductCategoryDAO proCategoryDAO;

	public List<productCategoryModel> findAll(pageble pageble) {
		return proCategoryDAO.findAll(pageble);
	}

	public productCategoryModel add(productCategoryModel categoryModel) {
		categoryModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		Long id = proCategoryDAO.add(categoryModel);
		return proCategoryDAO.findOne(id);
	}

	public productCategoryModel edit(productCategoryModel categoryModel) {
		productCategoryModel oldcategory = proCategoryDAO.findOne(categoryModel.getCategoryId());
		categoryModel.setCreatedDate(oldcategory.getCreatedDate());
		categoryModel.setCreatedBy(oldcategory.getCreatedBy());
		categoryModel.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		proCategoryDAO.edit(categoryModel);
		return proCategoryDAO.findOne(categoryModel.getCategoryId());
	}

	public void delete(String[] names) {
	for (String str : names) {
			proCategoryDAO.delete(str);
		}
	}

	public Integer getTotalItem() {
		return proCategoryDAO.getCount();
	}
 
}
