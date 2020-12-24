package com.glassProject.service;

import java.util.List;

import com.glassProject.model.productModel;
import com.glassProject.paging.pageble;

public interface IProductService {
   List<productModel> findAll(pageble pageble);
   productModel add(productModel productModel);
   productModel edit(productModel productModel);
   void delete(Long[] id);
   Integer getCount();

}
