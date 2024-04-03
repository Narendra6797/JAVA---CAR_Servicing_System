package com.nn.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nn.model.Car;

@SuppressWarnings("serial")
public class ServiceReqControler extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String serviceType = req.getParameter("servicetype"); 


		HttpSession session = req.getSession();
		String username = (String) session.getAttribute("susername");

		Car tempCar = new Car();

		tempCar.setUsername(username);
		tempCar.setServicetype(serviceType);

		int status = tempCar.seviceRequest();

		if(status ==0) {
			res.sendRedirect("/cars/sevicerequestfailure.jsp");
		}
		else {
			res.sendRedirect("/cars/sevicerequestsuccess.jsp");
		}

	}

}

