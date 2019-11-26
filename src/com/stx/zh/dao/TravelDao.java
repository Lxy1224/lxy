package com.stx.zh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.stx.zh.model.Article;
import com.stx.zh.model.Story;
import com.stx.zh.model.Travel;
import com.stx.zh.util.DBUtil;

public class TravelDao {
	/**
	 * 根据编号返回文章的所有信息
	 * @param story_title
	 * @return
	 */
	public Travel find_one(int t_no){
		
		ResultSet rs=null;
		Travel travel=null;
		Statement sta=DBUtil.getConnection();
		String sql="select * from travel_table where t_no='"+t_no+"'";
		try {
			rs=sta.executeQuery(sql);
			while(rs.next())
			{
				String t_label=rs.getString("t_label");
				String t_title=rs.getString("t_title");
				String t_picture1=rs.getString("t_picture1");
				String t_content=rs.getString("t_content");
				int t_comnum=rs.getInt("t_comnum");
				int u_id=rs.getInt("u_id");
				travel=new Travel(t_no, t_label, t_title, t_picture1, t_content, t_comnum, u_id);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeAll();
		}
		return travel;	
	}
	/**
	 * 返回游记的所有信息
	 * @param story
	 * @return
	 */
public ArrayList find_all(){
		
		ResultSet rs=null;
		Travel travel=null;
		ArrayList travels=new ArrayList();
		Statement sta=DBUtil.getConnection();
		String sql="select * from travel_table";
		try {
			rs=sta.executeQuery(sql);
			while(rs.next())
			{
				int t_no=rs.getInt("t_no");
				String t_label=rs.getString("t_label");
				String t_title=rs.getString("t_title");
				String t_picture1=rs.getString("t_picture1");
				String t_content=rs.getString("t_content");
				int t_comnum=rs.getInt("t_comnum");
				int u_id=rs.getInt("u_id");
				travel=new Travel(t_no, t_label, t_title, t_picture1, t_content, t_comnum, u_id);
				travels.add(travel);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeAll();
		}
		return travels;	
	}
	
	/**
	 * 管理员：添加游记
	 */
	/**
	 * 添加文章
	 */
	public boolean add_travel(Travel travel)
	{
		Statement sta = DBUtil.getConnection();
		String sql = "insert into travel_table(t_no,t_label,t_title,t_picture1,t_content,t_comnum) values ("+travel.getT_no()+",'"+travel.getT_label()+"','"+travel.getT_title()+"','"+travel.getT_picture1()+"','"+travel.getT_content()+"',"+travel.getT_comnum()+")";
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
	public boolean del_Travel(int t_no)
	{
		Statement sta = DBUtil.getConnection();
		String sql = "delete from travel_table where t_no="+t_no+"";
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
	public boolean up_Travel(Travel travel)
	{
		Statement sta = DBUtil.getConnection();
		String sql = "update travel_table set t_label='"+travel.getT_label()+"',t_title='"+travel.getT_title()+"',t_picture1='"+travel.getT_picture1()+"',t_content='"+travel.getT_content()+"',t_comnum="+travel.getT_comnum()+" where t_no="+travel.getT_no()+"";
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
