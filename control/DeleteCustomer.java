package com.nn.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.nn.model.Customer;

@SuppressWarnings("serial")
public class DeleteCustomer extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String username = req.getParameter("id");  
		
		Customer tempCustomer = new Customer();
		
		tempCustomer.setUsername(username);
	
		
		int status = (int) tempCustomer.DeleteCustomer();

		if(status == 0) {
			res.sendRedirect("/cars/CustomerFailedToDelete.jsp");
		}
		else {
			res.sendRedirect("/cars/CustomerSuccessfullyDeleted.jsp");
		}
		
	}
}
