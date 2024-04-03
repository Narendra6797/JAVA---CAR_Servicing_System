package com.nn.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private String username;
	private String password;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer(String name, String username, String password, String email) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public Customer() {
		super();

	}


	public Customer(String name, String username, String email) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", username=" + username + ",email=" + email
				+ "]";
	}

	public int registerCustomer() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "root");

			String sql = "select * from customer where username=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			ResultSet res1 = pstmt.executeQuery();
			if (res1.next() == true) {
				return -1;// user already exists in the database
			} else {
				String sql1 = "insert into customer values(?,?,?,?)";
				PreparedStatement pstmt1 = con.prepareStatement(sql1);
				pstmt1.setString(1, name);
				pstmt1.setString(2, username);
				pstmt1.setString(3, password);
				pstmt1.setString(4, email);

				int rows = pstmt1.executeUpdate();
				/*
				 * rows will be 0-> if customer is not registered rows will be 1-> if customer
				 * is successfully registered
				 */
				return rows;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}

	public int loginCustomer() {
		try {

			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "root");

			String sql2 = "select * from customer where username=?";
			PreparedStatement pstmt = con.prepareStatement(sql2);
			pstmt.setString(1, username);
			ResultSet res1 = pstmt.executeQuery();
			if (res1.next()) {
				if (password.equals(res1.getString(3))) {
					name = res1.getString(1);
					//					System.out.println(name+"model");
					return 1;// user already exists in the database
				}

				else {
					return 0;// invalid password
				}
			} else {
				return -1; //invalid User-name
			}
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	public int passwordChange() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "root");

			String sql = "update customer set password=? where username=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setString(2, username);

			int rows = pstmt.executeUpdate();
			return rows;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	public ArrayList<Customer> viewRegisteredCustomers() {
		try {
			List<Customer> customerDetails = new ArrayList<Customer>();
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "root");

			String sql = "select * from customer";
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(sql);

			while(res.next()) {
				name = res.getString(1);
				username = res.getString(2);
				email = res.getString(4);

				customerDetails.add(new Customer(name, username, email));
			}
			return (ArrayList<Customer>) customerDetails;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public Object EditCustomer() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "root");

			String sql = "update customer set name=?, username=?, email=? where username=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, username);
			pstmt.setString(3, email);
			pstmt.setString(4, username);

			int rows = pstmt.executeUpdate();
			return rows;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	public Object DeleteCustomer(){
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "root");

			String sql = "delete from customer where username=? ";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, username);

			int rows = pstmt.executeUpdate();
			return rows;

		

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0 ;

	}
}



