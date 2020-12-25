package com.glassProject.DAO;

import java.util.List;

import com.glassProject.model.productCategoryModel;
import com.glassProject.paging.pageble;

public interface IProductCategoryDAO {
  List<productCategoryModel> findAll(pageble pageble);
  productCategoryModel findOne(Long id);
  Long add(productCategoryModel categoryModel);
  void edit(productCategoryModel categoryModel);
  void delete(String name);
  Integer getCount();
}
