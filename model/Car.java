package com.nn.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class Car {
	private String username;
	private String cartype;
	private String carmodel;
	private String carregno;
	private String servicetype;
	private String servicestatus;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public String getCarregno() {
		return carregno;
	}

	public void setCarregno(String carregno) {
		this.carregno = carregno;
	}

	public String getServicetype() {
		return servicetype;
	}

	public void setServicetype(String servicetype) {
		this.servicetype = servicetype;
	}
	public String getServicestatus() {
		return servicestatus;
	}

	public void setServicestatus(String servicestatus) {
		this.servicestatus = servicestatus;
	}



	public Car(String username, String cartype, String carmodel, String carregno, String servicetype,
			String sevicestatus) {
		super();
		this.username = username;
		this.cartype = cartype;
		this.carmodel = carmodel;
		this.carregno = carregno;
		this.servicetype = servicetype;
		this.servicestatus = sevicestatus;
	}
	public Car() {
		super();
	}
	
	@Override
	public String toString() {
		return "Car [username=" + username + ", cartype=" + cartype + ", carmodel=" + carmodel + ", carregno="
				+ carregno + ", servicetype=" + servicetype + ", servicestatus=" + servicestatus + "]";
	}

	public int AddCarDetails() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "root");

			String sql = "insert into cars values(?,?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, username);
			pstmt.setString(2, cartype);
			pstmt.setString(3, carmodel);
			pstmt.setString(4, carregno);
			pstmt.setString(5, null);
			pstmt.setString(6, null);
			pstmt.setString(7, "Original");

			int rows = pstmt.executeUpdate();
			return rows;

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int seviceRequest() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "root");

			String sql = "update cars set servicetype=?, servicestatus=? , edited=? where username=?";
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, servicetype);
			pstmt.setString(2, "in Progress");
			pstmt.setString(3, "original");
			pstmt.setString(4, username);

			int rows = pstmt.executeUpdate();
			return rows;


		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public String serviceStatus() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "root");

			String sql = "select * from cars where username = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, username);
			ResultSet res = pstmt.executeQuery();

			if(res.next()) {
				servicestatus=res.getString(6);
			}
			return servicestatus;


		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public Object EditCarDetails() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "root");

			String sql = "update cars set cartype=?, carmodel=?, carregno=?, edited=? where username=?";
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, cartype);
			pstmt.setString(2, carmodel);
			pstmt.setString(3, carregno);
			pstmt.setString(4, "it's Modified");
			pstmt.setString(5, username);

			int rows = pstmt.executeUpdate();
			return rows;

		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;

	}
	public ArrayList<Car> viewServiceRequests() {
		try {
			List<Car> carDetails = new ArrayList<Car>();
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "root");
			
			String sql = "select * from cars where servicestatus=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "in progress");
			ResultSet res = pstmt.executeQuery();
			
			while(res.next()) {
				username = res.getString(1);
				cartype = res.getString(2);
				carmodel = res.getString(3);
				carregno = res.getString(4);
				servicetype = res.getString(5);
				servicestatus = res.getString(6);
				
				carDetails.add(new Car(username, cartype, carmodel, carregno, servicetype, servicestatus));
			}
			return (ArrayList<Car>) carDetails;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	public int updateServiceStatus() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "root");
			
			String sql = "update cars set servicestatus=? where username=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "completed");
			pstmt.setString(2, username);
			int rows = pstmt.executeUpdate();
			return rows;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
		
	}

}
