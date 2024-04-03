package com.nn.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nn.model.Car;

@SuppressWarnings("serial")
public class ViewServiceRequestsControl extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Car tempCar = new Car();
		ArrayList<Car> carDetails = tempCar.viewServiceRequests();
		
		HttpSession session = req.getSession();
		session.setAttribute("sCarDetails", carDetails);
		
		res.sendRedirect("/cars/viewServiceRequestSuccess.jsp");
	}
}
