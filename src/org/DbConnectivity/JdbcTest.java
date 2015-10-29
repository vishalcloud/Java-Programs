package org.DbConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) throws ClassNotFoundException {

	
	try{
		
		//connecting to db
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishal","root","root");
		System.out.println("Connection success");
		
		//creation of table
		Statement s = con.createStatement();
		String str = "CREATE TABLE sqlconn("
				+ "name varchar(20),"
				+"id int)";
		s.execute(str);
		System.out.println("Creation Success");
		
		//inserting values
		String str1 = "INSERT INTO sqlconn " +
                "VALUES ('Vishal', 10)";
		s.executeUpdate(str1);
		String str2 = "INSERT INTO sqlconn " +
                "VALUES ('ABC', 40)";
		s.executeUpdate(str2);
		String str3 = "INSERT INTO sqlconn " +
                "VALUES ('ZXC', 20)";
		s.executeUpdate(str3);

		System.out.println("Insertion Success");
		System.out.println("TABLE CONTENTS \n NAME \t ID \n______________");
		// Retrieving data from db
		ResultSet rs = s.executeQuery("select * from sqlconn");
		while(rs.next())  
			System.out.println(rs.getString(1)+" \t "+rs.getInt(2));  
			 
		//Dropping Table 
		String d = "drop table sqlconn";
		s.execute(d);
		System.out.println("Table Dropped");
		
		con.close();
	
	}	
	catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		return;
		
		}
	}
}
	

/* Output
Connection success
Creation Success
Insertion Success
TABLE CONTENTS 
 NAME 	 ID 
______________
Vishal 	 10
ABC 	 40
ZXC 	 20
Table Dropped
*/