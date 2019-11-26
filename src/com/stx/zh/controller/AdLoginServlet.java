package com.stx.zh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.stx.zh.dao.AdminDao;

/**
 * Servlet implementation class AdLoginServlet
 */
@WebServlet("/AdLoginServlet")
public class AdLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String adname=request.getParameter("adname");
		
		System.out.println(adname);
		HttpSession session=request.getSession();
		session.setAttribute("adname",adname);
		request.getRequestDispatcher("/ad/ad_all.jsp").forward(request, response);
		
		
		
		
		
		
		
//		String password=request.getParameter("password");
//		AdminDao ad=new AdminDao();
//		boolean bo=ad.login_ad(adname, password);
//		if(bo)
//		{
//			HttpSession session=request.getSession();
//			session.setAttribute("adname",adname);
//			//resp.sendRedirect("/Zh_1024/success.jsp");
//			request.getRequestDispatcher("/ad/ad_all.jsp").forward(request, response);
//		}else{
//			//resp.sendRedirect("/Zh_1024/login.jsp");
//			request.getRequestDispatcher("/ad_login.jsp").forward(request, response);
//		}
	}

}
