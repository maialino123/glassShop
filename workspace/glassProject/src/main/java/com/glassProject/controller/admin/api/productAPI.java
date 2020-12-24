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
import com.glassProject.model.productModel;
import com.glassProject.model.userModel;
import com.glassProject.service.IProductService;
import com.glassProject.utils.httpUtils;
import com.glassProject.utils.sessionUtils;

@WebServlet(urlPatterns = "/api-admin-product")
public class productAPI extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3582842753914313666L;
	
	@Inject private IProductService productService;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper ob = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		productModel productModel = httpUtils.of(req.getReader()).toModel(productModel.class);
		productModel.setCreatedBy(((userModel) sessionUtils.getInstance().getValue(req, SystemConstant.USERMODEL)).getUserName());
		productModel = productService.add(productModel);
		ob.writeValue(resp.getOutputStream(), productModel);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		productModel productModel = httpUtils.of(req.getReader()).toModel(productModel.class);
		productModel.setModifiedBy(((userModel) sessionUtils.getInstance().getValue(req, SystemConstant.USERMODEL)).getUserName());
		productModel = productService.edit(productModel);
		mapper.writeValue(resp.getOutputStream(), productModel);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		productModel productModel = httpUtils.of(req.getReader()).toModel(productModel.class);
		productService.delete(productModel.getIds());
		mapper.writeValue(resp.getOutputStream(), "{}");
	}
	
	
	

}
