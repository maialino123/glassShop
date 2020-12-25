package com.glassProject.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.glassProject.constant.SystemConstant;
import com.glassProject.model.productCategoryModel;
import com.glassProject.model.userModel;
import com.glassProject.service.IProductCategoryService;
import com.glassProject.utils.httpUtils;
import com.glassProject.utils.sessionUtils;

@WebServlet(urlPatterns = "/api-admin-productCategory")
public class productCategoryAPI extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2931840430385040655L;

	@Inject
	IProductCategoryService productCategoryService;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		productCategoryModel categoryModel = httpUtils.of(req.getReader()).toModel(productCategoryModel.class);
		categoryModel.setCreatedBy(
				((userModel) sessionUtils.getInstance().getValue(req, SystemConstant.USERMODEL)).getUserName());
		categoryModel = productCategoryService.add(categoryModel);
		mapper.writeValue(resp.getOutputStream(), categoryModel);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		productCategoryModel productCategoryModel = httpUtils.of(req.getReader()).toModel(productCategoryModel.class);
		productCategoryModel.setModifiedBy(((userModel)sessionUtils.getInstance().getValue(req, SystemConstant.USERMODEL)).getUserName());
		productCategoryModel = productCategoryService.edit(productCategoryModel);
		mapper.writeValue(resp.getOutputStream(), productCategoryModel);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		productCategoryModel productCategoryModel = httpUtils.of(req.getReader()).toModel(productCategoryModel.class);
		productCategoryService.delete(productCategoryModel.getNames());
		mapper.writeValue(resp.getOutputStream(), "{}");
	}

}
