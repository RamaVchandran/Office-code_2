package org.test.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {

	public static void main(String[] args) {
		Connection con = null;
		//load driver
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		//connect db	
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
			//write query
			String sql ="select*from employees";
			//prepare statement
			PreparedStatement ps = con.prepareStatement(sql);
			//execute query
		ResultSet rs =	ps.executeQuery();
		
		//iterate table
		while(rs.next()){
			String firstname = rs.getString("first_name");
			int managerid = rs.getInt("Manager_id");
			System.out.println(firstname);
			System.out.println(managerid);
		}
				
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
