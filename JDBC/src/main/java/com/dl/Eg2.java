package com.dl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Eg2 {

	public static void main(String[] args) throws SQLException {

		// JDBC: Java Database Connectivity
		// Step1: Load the driver
		// Step2: Get the connection
		// Step3: Create PreparedStatement Object
		// Step4: Write Query
		// Step5: Execute Statement

		// loading the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava16_jdbc", "root","root");

			PreparedStatement pst = con.prepareStatement("insert into emp values(?, ?, ?, ?, ?)");

			//xxx methods
			pst.setInt(1, 201);
			pst.setString(2, "Sai");
			pst.setString(3, "Kumar");
			pst.setString(4, "Hyd");
			pst.setDouble(5, 20000.00);
			pst.addBatch();
			
			pst.setInt(1, 202);
			pst.setString(2, "Sai");
			pst.setString(3, "Kumar");
			pst.setString(4, "Hyd");
			pst.setDouble(5, 20000.00);
			pst.addBatch();
			
			pst.setInt(1, 203);
			pst.setString(2, "Sai");
			pst.setString(3, "Vamsi");
			pst.setString(4, "Hyd");
			pst.setDouble(5, 20000.00);
			pst.addBatch();
			
			int[] executeBatch = pst.executeBatch();
			
			for (int i : executeBatch) {
				System.out.println("Data Inserted: " + i);
			}
			

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}
}
