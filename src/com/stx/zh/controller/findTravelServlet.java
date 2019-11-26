package com.stx.zh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.zh.dao.ArticleDao;
import com.stx.zh.dao.TravelDao;
import com.stx.zh.model.Article;
import com.stx.zh.model.Travel;

/**
 * Servlet implementation class findTravelServlet
 */
@WebServlet("/findTravelServlet")
public class findTravelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public findTravelServlet() {
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
		Travel	travel=td.find_one(t_no);
		request.setAttribute("travel1",travel);
		 request.getRequestDispatcher("/ad/update_travel.jsp").forward(request,response);
	}

}
