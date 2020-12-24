package com.glassProject.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.glassProject.constant.SystemConstant;
import com.glassProject.model.productCategoryModel;
import com.glassProject.paging.pageRequest;
import com.glassProject.paging.pageble;
import com.glassProject.service.IProductCategoryService;
import com.glassProject.sort.sorter;
import com.glassProject.utils.formUtils;

@WebServlet(urlPatterns = "/admin-category-list")
public class productCategoryController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5768647843671158355L;

	@Inject
	private IProductCategoryService productCategoryService;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		productCategoryModel model = formUtils.toModel(productCategoryModel.class, req);
		pageble pageble = new pageRequest(model.getPage(), model.getMaxPageItem(), new sorter(model.getSortName(), model.getSortBy()));
		model.setData(productCategoryService.findAll(pageble));
		model.setTotalItem(productCategoryService.getTotalItem());
		model.setTotalPage((int) Math.ceil((double)model.getTotalItem() / model.getMaxPageItem()));
		req.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher rd = req.getRequestDispatcher("/views/admin/productCategory/category.jsp");
		rd.forward(req, resp);
	}

}
