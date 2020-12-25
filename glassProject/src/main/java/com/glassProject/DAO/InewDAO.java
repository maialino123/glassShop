package com.glassProject.DAO;

import java.util.List;

import com.glassProject.model.newModel;
import com.glassProject.paging.pageble;

public interface InewDAO {
   List<newModel> findAll(pageble pageble);
   newModel findOne(Long newId);
   Long add(newModel newModel);
   void update(newModel newModel);
   Integer getCount();
}
