package com.mytest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class CustomerDetails {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
	Class.forName("com.mysql.cj.jdbc.Driver"); //step 1			
	//step 2
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/umittest", "root", "root");
	
//step 3
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from customer");
	int salary;
	String name ,desig, dept,id;
	System.out.println("Customer Details");
	System.out.println("================");
	while(rs.next())
	{
		   id=rs.getString(1);
		   name=rs.getString(2);
		   desig=rs.getString(3);
		   dept=rs.getString(4);
		  salary= rs.getInt(5);
		System.out.println(id+" | "+name+" | "+desig+" | "+dept+" | "+salary );
		
	}
	con.close();

	}
}
