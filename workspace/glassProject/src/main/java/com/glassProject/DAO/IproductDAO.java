package com.glassProject.DAO;

import java.util.List;

import com.glassProject.model.productModel;
import com.glassProject.paging.pageble;

public interface IproductDAO extends GenericDAO<productModel> {
   List<productModel> findAll(pageble pageble);
   Long add(productModel productModel);
   void edit(productModel productModel);
   productModel findOne(Long proId);
   void delete(Long id);
   Integer getCount();
}
