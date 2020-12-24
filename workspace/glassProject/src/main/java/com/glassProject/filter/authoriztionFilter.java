package com.glassProject.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.glassProject.constant.SystemConstant;
import com.glassProject.model.userModel;
import com.glassProject.utils.sessionUtils;

public class authoriztionFilter implements Filter {
	
	private ServletContext context;

	public void init(FilterConfig filterConfig) throws ServletException {
		this.context = filterConfig.getServletContext();
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String url = req.getRequestURI();
		if (url.startsWith(req.getContextPath()+"/admin")) {
			userModel userModel = (com.glassProject.model.userModel) sessionUtils.getInstance().getValue(req, SystemConstant.USERMODEL);
			if (userModel != null && userModel.getRole().getCode() != null) {
				if (userModel.getRole().getCode().equals(SystemConstant.ADMIN)) {
					chain.doFilter(request, response);
				} else if (userModel.getRole().getCode().equals(SystemConstant.USER)) {
					sessionUtils.getInstance().removeValue(req, SystemConstant.USERMODEL);
					resp.sendRedirect(req.getContextPath()+"/dang-nhap?action=login&message=no_permission&alert=danger");
				}
			} else {
				resp.sendRedirect(req.getContextPath()+"/dang-nhap?action=login&message=no_login&alert=danger");
			}
		} else {
			chain.doFilter(request, response);
		}
		
	}

	public void destroy() {
		
	}

}
