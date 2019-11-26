package com.stx.zh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.zh.dao.RouteDao;
import com.stx.zh.dao.TravelDao;
import com.stx.zh.model.Route;
import com.stx.zh.model.Travel;

/**
 * Servlet implementation class findRouteServlet
 */
@WebServlet("/findRouteServlet")
public class findRouteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public findRouteServlet() {
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
		int r_no=Integer.parseInt(request.getParameter("r_no"));
		RouteDao rd=new RouteDao();
		Route route=rd.find_one(r_no);
		request.setAttribute("route1",route);
		request.getRequestDispatcher("/ad/update_route.jsp").forward(request,response);

	}

}
