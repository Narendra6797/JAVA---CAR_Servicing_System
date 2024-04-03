package com.nn.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nn.model.Customer;


@SuppressWarnings("serial")
public class viewRegisteredCustomberControler extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Customer tempCustomer = new Customer();
		 ArrayList<Customer> customerDetails = tempCustomer.viewRegisteredCustomers();
		 
		 HttpSession session = req.getSession();
		 
		 session.setAttribute("sCustomerDetails", customerDetails);
		 
		 res.sendRedirect("/cars/viewRegisterCustomerSuccess.jsp");
	}

}
