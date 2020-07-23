package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class StoringDataFromDB {
	
	String dbname= "syntax_hrm";
	String dbPassword= "syntaxhrm123";
	String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	
	@Test
	public void getAndStoreData() throws SQLException {
		Connection conn=DriverManager.getConnection(dbUrl, dbname, dbPassword);
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select id, name, country_code from ohrm_location;"); //select * from ohrm_location da yazsan yine 3 tanesini verir asagidaki
		
		List<Map<String, String>> listData=new ArrayList<>();
		
		while(rs.next()) {
			
			Map<String, String> map=new LinkedHashMap<>();
			map.put("id", rs.getObject("id").toString());
			map.put("name", rs.getObject("name").toString());
			map.put("country_code", rs.getObject("country_code").toString());
			
			listData.add(map);
		}
		System.out.println(listData);

}
	
	@Test
	public void getAndStoreDataEnhanced() throws SQLException {
		Connection conn=DriverManager.getConnection(dbUrl, dbname, dbPassword);
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from ohrm_location;"); 
		ResultSetMetaData rsetMetaData=rs.getMetaData();
	
	// instead of hard coding making code more dynamic
		List<Map<String, String>> listData= new ArrayList<>();
		Map<String, String> rowMap;
		
		while(rs.next()) {
			rowMap=new LinkedHashMap();
		
		for(int i=1; i<=rsetMetaData.getColumnCount(); i++) {
			rowMap.put(rsetMetaData.getColumnName(i), rs.getObject(i).toString());
		}
		
	 listData.add(rowMap);
		}
		System.out.println(listData);
	}	
	
}
