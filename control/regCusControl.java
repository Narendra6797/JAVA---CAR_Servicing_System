package com.nn.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nn.model.Customer;

@SuppressWarnings("serial")
public class regCusControl extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name"); 
		String username = req.getParameter("username"); 
		String password = req.getParameter("password"); 
		String confirmPassword = req.getParameter("confirmpassword"); 
		String email = req.getParameter("email");

		if(!password.equals(confirmPassword)){
			res.sendRedirect("/cars/PasswordMismatch.html");
		}
		else {
			Customer tempCustomer = new Customer();
			tempCustomer.setName(name);
			tempCustomer.setUsername(username);
			tempCustomer.setPassword(password);
			tempCustomer.setEmail(email);

			int status = tempCustomer.registerCustomer();

			if(status == -1) {
				res.sendRedirect("/cars/duplicateUsername.html");
			}
			else if(status == 1) {
				res.sendRedirect("/cars/registercustomersuccess.jsp");
			}
			else {
				res.sendRedirect("/cars/registercustomerfailure.jsp");
			}

		}

	}
}
