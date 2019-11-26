package com.stx.zh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.stx.zh.model.Route;
import com.stx.zh.model.Travel;
import com.stx.zh.util.DBUtil;

public class RouteDao {
	/**
	 * 根据编号返回路线的所有信息
	 * @param story_title
	 * @return
	 */
	public Route find_one(int r_no){
		
		ResultSet rs=null;
		Route route=null;
		Statement sta=DBUtil.getConnection();
		String sql="select * from route_table where r_no="+r_no+"";
		try {
			rs=sta.executeQuery(sql);
			if(rs.next())
			{
				String r_label=rs.getString("r_label");
				String r_title=rs.getString("r_title");
				String r_picture1=rs.getString("r_picture1");
				String r_content=rs.getString("r_content");
				
				int u_id=rs.getInt("u_id");
				route=new Route(r_no, r_label, r_title, r_picture1, r_content, u_id);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeAll();
		}
		return route;	
	}
	/**
	 * 返回游记的所有信息
	 * @param story
	 * @return
	 */
	public ArrayList find_all(){
		ResultSet rs=null;
		ArrayList routes=new ArrayList();
		Route route=null;
		Statement sta=DBUtil.getConnection();
		String sql="select * from route_table ";
		try {
			rs=sta.executeQuery(sql);
			while(rs.next())
			{
				int r_no=rs.getInt("r_no");
				String r_label=rs.getString("r_label");
				String r_title=rs.getString("r_title");
				String r_picture1=rs.getString("r_picture1");
				String r_content=rs.getString("r_content");
				
				int u_id=rs.getInt("u_id");
				route=new Route(r_no, r_label, r_title, r_picture1, r_content, u_id);
				routes.add(route);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeAll();
		}
		return routes;	
	}
	
	/**
	 * 管理员：添加游记
	 */
	/**
	 * 添加文章
	 */
	public boolean add_route(Route route)
	{
		Statement sta = DBUtil.getConnection();
		String sql = "insert into route_table(r_no,r_label,r_title,r_picture1,r_content) values ("+route.getR_no()+",'"+route.getR_label()+"','"+route.getR_title()+"','"+route.getR_picture1()+"','"+route.getR_content()+"')";
		int n=0;
		try {
			n = sta.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (n > 0) {
			return true;
		} 
		DBUtil.closeAll();
		return false;
	}
	/**
	 * 删除文章
	 */
	public boolean del_route(int r_no)
	{
		Statement sta = DBUtil.getConnection();
		String sql = "delete from route_table where r_no='"+r_no+"'";
		int n=0;
		try {
			n = sta.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (n > 0) {
			return true;
		} 
		DBUtil.closeAll();
		return false;
	}
	/**
	 * 修改文章内容（可能不写）
	 * 
	 */
	public boolean up_route(Route route)
	{
		Statement sta = DBUtil.getConnection();
		String sql = "update route_table set r_title='"+route.getR_title()+"',r_label='"+route.getR_label()+"',r_picture1='"+route.getR_picture1()+"',r_content='"+route.getR_content()+"' where r_no="+route.getR_no()+"";
		int n=0;
		try {
			n = sta.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (n > 0) {
			return true;
		} 
		DBUtil.closeAll();
		return false;
		
	}
	
}
