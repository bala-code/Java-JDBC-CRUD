package com.bala.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class UserDb {

	public static void main(String[] args)  {
		String url = "jdbc:mysql://localhost:3306/sampledb";
		String userName = "root";
		String password ="";
		
		Connection con;
		try {
			con = DriverManager.getConnection(url,userName,password);
			
			
			//#static data
			//String sql = " INSERT INTO users (username,password,fullname,email)" + "VALUES ('bala','krish','ram','krish@gmail.com')";
			//Statement statement = con.createStatement();
			//int tes = statement.executeUpdate(sql);
			
			//#dynamic data
			//String sql = " INSERT INTO users (username,password,fullname,email)" + "VALUES (?,?,?,?)";
			//java.sql.PreparedStatement statement = con.prepareStatement(sql);
			//statement.setString(1,"bala");
			//statement.setString(2, "krish");
			//statement.setString(3,"ramesh");
			//statement.setString(4, "krsi@gmail.com");
			//int tes = statement.executeUpdate();
			
			
			//#retrive data from database
			//String sql = "SELECT * FROM users";
			//Statement statement = con.createStatement();
			//ResultSet result = statement.executeQuery(sql);
			
			//while(result.next()) {
			//	int userId = result.getInt("user_id");
			//	String username = result.getString(2);
			//	String pass = result.getString(3);
			//	String fullname = result.getString(4);
			//	String email = result.getString(5);
			//	System.out.println(userId + ":"+username +"," + fullname  );
			//	}
			
			
			//#update db.
			//String sql ="UPDATE users SET password='welcome' WHERE username='bala'";
			//Statement statement = con.createStatement();
			//int rows = statement.executeUpdate(sql);
			
			
			//#update using dynamic 
			String sql ="UPDATE users SET password=? WHERE username=?";
			java.sql.PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1,"rama");
			statement.setString(2, "bala");
			int tes = statement.executeUpdate();
			
			
			//# delete db
			String sqldel = "DELETE FROM users WHERE user_id = 1";
			java.sql.PreparedStatement statementdel = con.prepareStatement(sqldel);
			statementdel.executeUpdate();
			
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
		
	}

}
