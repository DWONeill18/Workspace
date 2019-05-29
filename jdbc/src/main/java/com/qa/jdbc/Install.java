package com.qa.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Install {
	
	public static void main(String[]args) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Lidl", "root", "password");
		
		Statement stmt = conn.createStatement();
//		String sql = "insert into stores values ('manc')";
//		String sql = "insert into stores values ('salford')";
//		stmt.execute(sql);
		
		String sql = "select * from stores";
		ResultSet rs = stmt.executeQuery(sql);
		
		
		while (rs.next()) {
		
			System.out.println(rs.getString("name"));
		}
		conn.close();


	}
}
