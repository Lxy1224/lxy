package com.stx.zh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.zh.dao.ArticleDao;
import com.stx.zh.model.Article;

/**
 * Servlet implementation class DelArticleServlet
 */
@WebServlet("/DelArticleServlet")
public class DelArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelArticleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int a_no=Integer.parseInt(request.getParameter("a_no"));
		ArticleDao ad=new ArticleDao();
		boolean dela=ad.del_Article(a_no);
		if(dela)
		{
			System.out.println("删除成功");
			request.getRequestDispatcher("/AllArticleServlet").forward(request, response);
		}else{
			System.out.println("删除失败");
			request.getRequestDispatcher("/AllArticleServlet").forward(request, response);
		}
	}

}
