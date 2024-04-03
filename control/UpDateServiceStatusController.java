package com.nn.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nn.model.Car;

@SuppressWarnings("serial")
public class UpDateServiceStatusController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");

		Car tempCar = new Car();
		tempCar.setUsername(username);
		int status = tempCar.updateServiceStatus();

		if(status==0) {
			res.sendRedirect("/cars/updateServiceStatusFailure.jsp");
		}
		else {
			res.sendRedirect("/cars/updateServiceStatusSuccess.jsp");
		}
	}
}
