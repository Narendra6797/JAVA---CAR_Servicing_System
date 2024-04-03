package com.nn.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nn.model.Customer;

@SuppressWarnings("serial")
public class loginCusControl extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username"); 
		String password = req.getParameter("password");

		Customer tempCustomer = new Customer();
		tempCustomer.setUsername(username);
		tempCustomer.setPassword(password);

		int status = tempCustomer.loginCustomer();
		
		if(status == 1) {
			String name = tempCustomer.getName();
			HttpSession session = req.getSession(true);
//			System.out.println(name+"control");
			
			session.setAttribute("sname",name);
			session.setAttribute("susername",username);
			res.sendRedirect("/cars/loginsuccesscustomer.jsp");
		}
		else if(status == -1) {
			res.sendRedirect("/cars/invalidCuserName.jsp");
		}
		else {
			res.sendRedirect("/cars/invalidCpass.jsp");
		}

	}
}

