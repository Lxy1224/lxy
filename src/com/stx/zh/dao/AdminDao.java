package com.stx.zh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.stx.zh.util.DBUtil;

public class AdminDao {
	/**
	 * 管理员登录
	 * @param adname
	 * @param password
	 * @return
	 */
	public boolean login_ad(String adname,String password){
		Statement sta = null;
		ResultSet rs=null;
		try {
			sta=DBUtil.getConnection();
			String sql ="select * from ad_table where adname='"+adname+"' and password='"+password+"'";
			rs=sta.executeQuery(sql);
			if(rs.next())
			{
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeAll();	
		}
		return false;
	}
}
