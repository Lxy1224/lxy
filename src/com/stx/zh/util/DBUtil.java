package com.stx.zh.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	static Connection conn=null;
	static Statement sta = null;
	static ResultSet rs=null;
	public static Statement getConnection()
	{
		try {		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "system","stx");	
			sta=conn.createStatement();
		}catch (SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return sta;
	}
	public static void closeAll() 
	{
		
		try{
			if(rs!=null)
			{
				rs.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try {
			if (sta != null) {

				sta.close();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try{
			if (conn != null) {

				conn.close();
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	
}
