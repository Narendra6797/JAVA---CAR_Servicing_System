package com.nn.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Admin {
	private String admin;
	private String password;

	public String getAdminname() {
		return admin;
	}
	public void setAdminname(String username) {
		this.admin = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(String username, String password) {
		super();
		this.admin = username;
		this.password = password;
	}
	public Admin() {
		super();
	}

	public int loginAdmin() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "root");

			String sql2 = "select * from Admin where admin=?";
			PreparedStatement pstmt = con.prepareStatement(sql2);
			pstmt.setString(1, admin);
			ResultSet res1 = pstmt.executeQuery();
			if (res1.next()) {
				if (password.equals(res1.getString(2))) {
					admin = res1.getString(1);
					return 1;
				}
				else {
					return 0;// invalid password
				}
			} else {
				return -1;// invalid Admin-name
			}
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
}