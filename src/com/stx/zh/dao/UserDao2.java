package com.stx.zh.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import com.stx.zh.model.User2;
import com.stx.zh.util.DBUtil;


public class UserDao2 {
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	DBUtil du = new DBUtil();
	public int insert(User2 u2) {
		st = du.getConnection();
		int i = 0;
		try {
			i = st.executeUpdate("insert into zh_user values('"+u2.getUsername()+"','"+u2.getPassword()+"','"+u2.getPhone()+"','"+u2.getEmail()+"','"+u2.getYouji()+"','"+u2.getState()+"')");
		} catch (Exception e) {
		}
		du.closeAll();
		return i;
	}
	public boolean login_user(String username, String password) {
		boolean bool = false;
		st = du.getConnection();
		try {
			rs = st.executeQuery("select * from zh_user where username='" + username + "' and password='" + password + "'");
			bool = rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		du.closeAll();
		return bool;
	}
	public String selectstate(String username) {
		String state = null;
		st = du.getConnection();
		try {
			rs = st.executeQuery("select * from zh_user where username='" + username + "'");
			if(rs.next()) {
				state=rs.getString("state");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		du.closeAll();
		return state;
	}
	public boolean selectname(String username) {
		String name = null;
		boolean b = false;
		st = du.getConnection();
		try {
			rs = st.executeQuery("select * from zh_user where username='" + username + "'");
			if(rs.next()) {
				
				b=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		du.closeAll();
		return b;
	}
	public ArrayList selectall(String username) {
		ArrayList list = new ArrayList();
		st = du.getConnection();
		try {
			rs = st.executeQuery("select * from zh_user where username='" + username + "'");
			if(rs.next()) {
				User2 u2 = new User2();
				u2.setUsername(rs.getString("username"));
				u2.setPhone(rs.getString("phone"));
				u2.setEmail(rs.getString("email"));
				u2.setYouji(rs.getString("youji"));
				list.add(u2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		du.closeAll();
		return list;
	}
	
}
