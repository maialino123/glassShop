package com.glassProject.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.glassProject.DAO.InewDAO;
import com.glassProject.model.newModel;
import com.glassProject.paging.pageble;
import com.glassProject.service.INewService;

public class newService implements INewService {
	
	@Inject private InewDAO newDAO;

	public List<newModel> findAll(pageble pageble) {
		return newDAO.findAll(pageble);
	}

	public newModel add(newModel newModel) {
		newModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		newModel.setTopHot(new Timestamp(System.currentTimeMillis()));
		Long newId = newDAO.add(newModel);
		return newDAO.findOne(newId);
	}

	public newModel edit(newModel newModel) {
		newModel oldNews = newDAO.findOne(newModel.getNewId());
		newModel.setCreatedDate(oldNews.getCreatedDate());
		newModel.setCreatedBy(oldNews.getCreatedBy());
		newModel.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		newDAO.update(newModel);
		return newDAO.findOne(newModel.getNewId());
	}

	public Integer getCount() {
		return newDAO.getCount();
	}

}
