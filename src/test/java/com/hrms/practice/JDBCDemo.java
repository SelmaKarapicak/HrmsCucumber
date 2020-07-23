package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JDBCDemo {
	
	String dbUsername= "syntax_hrm";
	String dbPassword= "syntaxhrm123";
	
	           // jdbc:driver type:hostname:port/db name
	String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";   // mysqlden anasayfaya git setting isareti olan yerde syntax db sine git ordan bilgileri al
	
	@Test
	public void abc() throws SQLException {
		Connection conn=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		System.out.println("DB connection is successful");
		Statement st= conn.createStatement();
		ResultSet rs=st.executeQuery("select * from hs_hr_employees");
		
		rs.next();
		String firstname= rs.getString("emp_firstname");
		System.out.println(firstname);
		
		rs.next();
		String firstname2= rs.getObject("emp_firstname").toString();
		System.out.println(firstname2);
		
		String allData;
		while(rs.next()) {
			allData= rs.getObject("emp_firstname").toString();
			System.out.println(allData);
		}
		rs.close();
		st.close();
		conn.close();
	}
	
	// retrieve all the job titles and store them in arraylist and show it in
	// console it from arraylist
	
	@Test
	public void task() throws SQLException {
	
	Connection conn=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	System.out.println("Connection is successful");
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery("select * from ohrm_job_title");
	List<String> jobTitles=new ArrayList<>();
	while(rs.next()) {
		jobTitles.add(rs.getObject("job_title").toString());
	}
	System.out.println(jobTitles); // sadece bunu da yapabilirsin ya da for loop asagidaki gibi
	for(String jt:jobTitles) {
		System.out.println(jt);
	}
	
	}
	
	
	@Test
	public void myexercise() throws SQLException {
		Connection conn=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		System.out.println("Connection is successful");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from ohrm_nationality");
		
		rs.next();
		String name=rs.getObject("name").toString();
		System.out.println(name);
		
		
		while(rs.next()) {
			String alldata=rs.getObject("name").toString();
			System.out.println(alldata);
		}	
	}
	
	@Test
	public void exerciseList() throws SQLException {
		Connection conn=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		System.out.println("Connection is successful");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from ohrm_language");
		
		List<String> language=new ArrayList();
		while(rs.next()) {
			language.add(rs.getObject("name").toString());	
		}
		System.out.println(language);
		for(String ln:language) {
		System.out.println(ln);
	}
	}
	
	

}
