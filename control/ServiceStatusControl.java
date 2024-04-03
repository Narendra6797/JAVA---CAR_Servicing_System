package com.nn.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nn.model.Car;

public class ServiceStatusControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession  session = req.getSession();
		String username = (String) session.getAttribute("susername");

		Car tempcar = new Car();
		tempcar.setUsername(username);
		String servicestatus = tempcar.serviceStatus();

		if(servicestatus.equals("in Progress")) {
			res.sendRedirect("/cars/serviceStatusInprogess.jsp");
		}
		else if(servicestatus.equals("completed")) {
			res.sendRedirect("/cars/serviceStatusSuccess.jsp");
		}
		else {
			res.sendRedirect("/cars/serviceStatusNull.jsp");

		}
	}

}
