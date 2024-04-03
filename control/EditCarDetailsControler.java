package com.nn.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nn.model.Car;

@SuppressWarnings("serial")
public class EditCarDetailsControler extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		String  username = (String) session.getAttribute("susername"); 
		
		String carType = req.getParameter("cartype");  
		String carModel = req.getParameter("carmodel");  
		String carRegno = req.getParameter("carregno");
		
		Car tempCar = new Car();
		
		tempCar.setUsername(username);
		tempCar.setCartype(carType);
		tempCar.setCarmodel(carModel);
		tempCar.setCarregno(carRegno);
		
		int status = (int) tempCar.EditCarDetails();

		if(status == 0) {
			res.sendRedirect("/cars/addcardetailfailure.jsp");
		}
		else {
			res.sendRedirect("/cars/addcardetailSucces.jsp");
		}
		
	}
}
