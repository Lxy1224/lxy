package com.stx.zh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.zh.dao.ArticleDao;
import com.stx.zh.dao.TravelDao;

/**
 * Servlet implementation class DelTravelServlet
 */
@WebServlet("/DelTravelServlet")
public class DelTravelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelTravelServlet() {
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
		int t_no=Integer.parseInt(request.getParameter("t_no"));
		TravelDao td=new TravelDao();
		boolean dela=td.del_Travel(t_no);
		if(dela)
		{
			System.out.println("删除成功");
			request.getRequestDispatcher("/ad/travel_table.jsp").forward(request, response);
		}else{
			System.out.println("删除失败");
			request.getRequestDispatcher("/ad/travel_table.jsp").forward(request, response);
		}
	}

}
