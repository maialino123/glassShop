package com.glassProject.service;

import java.util.List;

import com.glassProject.model.newModel;
import com.glassProject.paging.pageble;

public interface INewService {
 List<newModel> findAll(pageble pageble);
 newModel add(newModel newModel);
 newModel edit(newModel newModel);
 Integer getCount();
}
