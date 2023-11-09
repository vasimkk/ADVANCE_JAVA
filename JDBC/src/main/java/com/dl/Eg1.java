package com.dl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg1 {

	public static void main(String[] args) throws SQLException {
		
		//JDBC: Java Database Connectivity
		//Step1: Load the driver
		//Step2: Get the connection
		//Step3: Create Statement Object
		//Step4: Write Query
		//Step5: Execute Statement
		
		//loading the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava16_jdbc", "root", "root");
			
			Statement createStatement = con.createStatement();
			
			String create = "create table emp(eid int, fname varchar(40),lname varchar(40), address varchar(255), salary double)";
			String insert = "insert into emp values(101, 'Sai', 'Kiran', 'Hyd', 20000.00)";
			
			int executeUpdate = createStatement.executeUpdate(insert);
			
			System.out.println( "Table create"+executeUpdate);
			
		} catch (ClassNotFoundException e) {
			
			
			e.printStackTrace();
		}

	}

}
