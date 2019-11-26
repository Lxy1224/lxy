package com.stx.zh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.stx.zh.model.Story;
import com.stx.zh.util.DBUtil;

public class StoryDao {
	/**
	 * 根据编号返回精神的所有信息
	 * @param story_title
	 * @return
	 */
	public Story find_one(int s_no){
		
		ResultSet rs=null;
		Story story=null;
		Statement sta=DBUtil.getConnection();
		String sql="select * from story_table where s_no='"+s_no+"'";
		try {
			rs=sta.executeQuery(sql);
			if(rs.next())
			{
				int s_no1=rs.getInt("s_no");
				String s_label=rs.getString("s_label");
				String s_title=rs.getString("s_title");
				String s_picture1=rs.getString("s_picture1");
				String s_picture2=rs.getString("s_picture2");
				String s_picture3=rs.getString("s_picture3");
				String s_content=rs.getString("s_content");
				
				
				story=new Story(s_no1, s_title, s_label, s_picture1, s_picture2, s_picture3, s_content);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeAll();
		}
		return story;	
	}
	/**
	 * 返回精神的所有信息
	 * @param story
	 * @return
	 */
	public ArrayList find_all(){
		
		ResultSet rs=null;
		ArrayList storys=new ArrayList();
		Story story=null;
		Statement sta=DBUtil.getConnection();
		String sql="select * from story_table ";
		try {
			rs=sta.executeQuery(sql);
			while(rs.next())
			{
				int s_no1=rs.getInt("s_no");
				String s_label=rs.getString("s_label");
				String s_title=rs.getString("s_title");
				String s_picture1=rs.getString("s_picture1");
				String s_picture2=rs.getString("s_picture2");
				String s_picture3=rs.getString("s_picture3");
				String s_content=rs.getString("s_content");
			
				
				story=new Story(s_no1, s_title, s_label, s_picture1, s_picture2, s_picture3, s_content);
				storys.add(story);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeAll();
		}
		return storys;	
	}
	
	/**
	 * 管理员：添加红色精神
	 */
	/**
	 * 添加文章
	 */
	public boolean add_Stroy(Story story)
	{
		Statement sta = DBUtil.getConnection();
		String sql = "insert into story_table values ('"+story.getS_no()+"','"+story.getS_label()+"',"+story.getS_title()+"','"+story.getS_picture1()+"','"+story.getS_picture2()+"','"+story.getS_picture3()+"','"+story.getS_content()+"')";
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
	public boolean del_Story(int s_no)
	{
		Statement sta = DBUtil.getConnection();
		String sql = "delete from story_table where s_no='"+s_no+"'";
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
	public boolean up_Story(Story story)
	{
		Statement sta = DBUtil.getConnection();
		String sql = "update story_table set s_title='"+story.getS_title()+"',s_picture1='"+story.getS_picture1()+"',s_picture2='"+story.getS_picture2()+"',s_picture3='"+story.getS_picture3()+"',s_content='"+story.getS_content()+"'";
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
