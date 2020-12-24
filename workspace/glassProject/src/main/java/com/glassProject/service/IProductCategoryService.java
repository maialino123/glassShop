package com.glassProject.service;

import java.util.List;

import com.glassProject.model.productCategoryModel;
import com.glassProject.paging.pageble;

public interface IProductCategoryService {
   List<productCategoryModel> findAll(pageble pageble);
   productCategoryModel add(productCategoryModel categoryModel);
   productCategoryModel edit(productCategoryModel categoryModel);
   void delete(String[] names);
   Integer getTotalItem();
}
