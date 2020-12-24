package com.glassProject.controller.web;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.glassProject.constant.SystemConstant;
import com.glassProject.loger.ILoger;
import com.glassProject.loger.logger;
import com.glassProject.model.userModel;
import com.glassProject.service.IUserService;
import com.glassProject.utils.formUtils;
import com.glassProject.utils.sessionUtils;

@WebServlet(urlPatterns = { "/trang-chu", "/dang-nhap" , "/dang-xuat"})
public class homeController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2496425046122152053L;
	
	@Inject private IUserService userService;
	
	ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if (action != null && action.equals("login")) {
			String message = req.getParameter("message");
			String alert = req.getParameter("alert");
			if (message != null && alert != null) {
				req.setAttribute("MESSAGE", resourceBundle.getString(message));
				req.setAttribute("ALERT", alert);
			}
			RequestDispatcher rq = req.getRequestDispatcher("/views/login/login.jsp");
			rq.forward(req, resp);
		} else if (action != null && action.equals("logout")) {
			sessionUtils.getInstance().removeValue(req, SystemConstant.USERMODEL);
			resp.sendRedirect(req.getContextPath()+"/trang-chu");
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
			rd.forward(req, resp);
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if (action != null && action.equals("login")) {
			userModel userModel = formUtils.toModel(userModel.class, req);
			ILoger iLoger = new logger(userModel.getUserName(), userModel.getPassword(), true);
			userModel = userService.findByUserNameAndPasswordAndStatus(iLoger);
			if (userModel != null && userModel.getRole().getCode() != null) {
				sessionUtils.getInstance().putValue(req, SystemConstant.USERMODEL, userModel);
				if (userModel.getRole().getCode().equals(SystemConstant.USER)) {
					resp.sendRedirect(req.getContextPath()+"/trang-chu");
				} else if(userModel.getRole().getCode().equals(SystemConstant.ADMIN)) {
					resp.sendRedirect(req.getContextPath()+"/admin-home");
				} 
			} else {
				resp.sendRedirect(req.getContextPath()+"/dang-nhap?action=login&message=userName_Password_invalid&alert=danger");
			}
		}
		
	}

}
