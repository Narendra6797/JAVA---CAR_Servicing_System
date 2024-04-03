package com.nn.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nn.model.Customer;


@SuppressWarnings("serial")
public class EditCustomerControl extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");  
		String username = req.getParameter("username");  
		String email = req.getParameter("email");  


		Customer tempCustomer = new Customer();

		tempCustomer.setName(name);
		tempCustomer.setUsername(username);
		tempCustomer.setEmail(email);
		tempCustomer.setUsername(username);


		int status = (int) tempCustomer.EditCustomer();

		if(status == 0) {
			res.sendRedirect("/cars/EditCustomerFaild.jsp");
		}
		else {
			res.sendRedirect("/cars/EditCustomerSuccess.jsp");
		}

	}


}

