package com.nn.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.nn.model.Admin;

@SuppressWarnings("serial")
public class AdminControl extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String adminname = req.getParameter("adminname"); 
		String password = req.getParameter("password");

		Admin tempAdmin = new Admin();
		tempAdmin.setAdminname(adminname);
		tempAdmin.setPassword(password);

		int status = tempAdmin.loginAdmin();
		
		if(status == 1) {
			res.sendRedirect("/cars/AdminLoginSuccess.jsp");
		}
		else if(status == -1) {
			res.sendRedirect("/cars/InvalidAdminName.jsp");
		}
		else {
			res.sendRedirect("/cars/InvalidAdminPassword.jsp");
		}

	}
}

