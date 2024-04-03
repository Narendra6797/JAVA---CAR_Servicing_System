package com.nn.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nn.model.Customer;

@SuppressWarnings("serial")
public class ChangePasswordControl extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException { 
		HttpSession session = req.getSession(); 
		String newPassword = req.getParameter("newconfirmpassword"); 
		
		String username = (String) session.getAttribute("susername");
		
		Customer tempPasswordChange = new Customer();
		
		tempPasswordChange.setUsername(username); 
		tempPasswordChange.setPassword(newPassword); 


		int status = tempPasswordChange.passwordChange();

		if(status == 0) {
			res.sendRedirect("/cars/PasswordChangeRequestFailure.jsp");
		}
		else{
			res.sendRedirect("/cars/PasswordChangeRequestSuccess.jsp");
		}
	}
}