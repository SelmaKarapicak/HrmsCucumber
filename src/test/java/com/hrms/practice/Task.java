package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Task {
	
	// hw get the resultset metadata store it in the arraylist and retrieve it from arraylist
    // also get column type name get the table names
	
	String dbname= "syntax_hrm";
	String dbPassword= "syntaxhrm123";
	
	// jdbc:driver type:hostname:port/db name
	String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	
	@Test
	public void ResultSetMetadata() throws SQLException {
		Connection conn=DriverManager.getConnection(dbUrl, dbname, dbPassword);
		System.out.println("Connection is successful");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from hs_hr_emp_skill");
		ResultSetMetaData rsMetadata=rs.getMetaData();
		
		String name=rsMetadata.getTableName(1);
		int colNums=rsMetadata.getColumnCount();
		String colName=rsMetadata.getColumnName(1);
		int colType=rsMetadata.getColumnType(1);
		String colTypeName=rsMetadata.getColumnTypeName(colType);
		
		System.out.println(name);
		System.out.println(colNums);
		System.out.println(colName);
		System.out.println(colType);
		System.out.println(colTypeName);
		
		List <String> metaData=new ArrayList<>();
		while(rs.next()) {
		metaData.add(rs.getObject("skill_id").toString());
		}
		for (String md : metaData) {
			System.out.println(md);
		}
		
		rs.close();
		st.close();
		conn.close();
	}
	

}
