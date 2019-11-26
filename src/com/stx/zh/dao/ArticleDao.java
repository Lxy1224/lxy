package com.stx.zh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.stx.zh.model.Article;
import com.stx.zh.util.DBUtil;

public class ArticleDao {
	/**
	 * 根据图片返回文章信息
	 * @param story_title
	 * @return
	 */
	public Article find_one(String a_picture1){
		
		ResultSet rs=null;
		Article article=null;
		Statement sta=DBUtil.getConnection();
		String sql="select * from article_table where a_picture1='"+a_picture1+"'";
		try {
			rs=sta.executeQuery(sql);
			if(rs.next())
			{
				int a_no=rs.getInt("a_no");
				String a_label=rs.getString("a_label");
				String a_title=rs.getString("a_title");
				String a_content=rs.getString("a_content");
				int a_comnum=rs.getInt("a_comnum");
				article=new Article(a_no, a_title, a_label, a_picture1, a_content, a_comnum);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeAll();
		}
		return article;	
	}
	/**
	 * 根据图片返回文章信息
	 * @param story_title
	 * @return
	 */
	public Article find_one(int a_no){
		
		ResultSet rs=null;
		Article article=null;
		Statement sta=DBUtil.getConnection();
		String sql="select * from article_table where a_no='"+a_no+"'";
		try {
			rs=sta.executeQuery(sql);
			if(rs.next())
			{
				
				String a_label=rs.getString("a_label");
				String a_title=rs.getString("a_title");
				String a_picture1=rs.getString("a_picture1");
				String a_content=rs.getString("a_content");
				int a_comnum=rs.getInt("a_comnum");
				article=new Article(a_no, a_title, a_label, a_picture1, a_content, a_comnum);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeAll();
		}
		return article;	
	}
	/**
	 * 返回文章的所有信息
	 * @param story
	 * @return
	 */
	public ArrayList find_all(){
		
		ResultSet rs=null;
		Article article=null;
		ArrayList articles=new ArrayList();
		Statement sta=DBUtil.getConnection();
		String sql="select * from article_table";
		try {
			rs=sta.executeQuery(sql);
			while(rs.next())
			{
				int a_no=rs.getInt("a_no");
				String a_label=rs.getString("a_label");
				String a_title=rs.getString("a_title");
				String a_picture1=rs.getString("a_picture1");
				String a_content=rs.getString("a_content");
				int a_comnum=rs.getInt("a_comnum");
				article=new Article(a_no, a_title, a_label, a_picture1, a_content, a_comnum);
				articles.add(article);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeAll();
		}
		return articles;	
	}
	
	/**
	 * 管理员：添加文章
	 */
	/**
	 * 添加文章
	 */
	public boolean add_Article(Article article)
	{
		Statement sta = DBUtil.getConnection();
		String sql = "insert into article_table(a_no,a_label,a_title,a_content,a_picture1,a_comnum) values ("+article.getA_no()+",'"+article.getA_label()+"','"+article.getA_title()+"','"+article.getA_content()+"','"+article.getA_picture1()+"',"+article.getA_comnum()+")";
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
	public boolean del_Article(int a_no)
	{
		Statement sta = DBUtil.getConnection();
		String sql = "delete from article_table where a_no='"+a_no+"'";
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
	public boolean up_Article(Article article)
	{
		Statement sta = DBUtil.getConnection();
		String sql = "update article_table set a_label='"+article.getA_label()+"',a_title='"+article.getA_title()+"',a_content='"+article.getA_content()+"',a_picture1='"+article.getA_picture1()+"' where a_no="+article.getA_no()+"";
		System.out.println("11111111111111");
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
	 * 更新图片
	 */
	public boolean up_photo(int a_no,String a_picture1)
	{
		
		Statement sta = DBUtil.getConnection();
		String sql = "update article_table set a_picture1='"+a_picture1+"'where a_no='"+a_no+"'";
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
