package com.stx.zh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.stx.zh.dao.UserDao2;
import com.stx.zh.model.User2;

/**
 * Servlet implementation class LoginServlet2
 */
@WebServlet("/ZhuceServlet2")
public class ZhuceServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ZhuceServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User2 u2=new User2();
		u2.setUsername(request.getParameter("user3"));
		u2.setPassword(request.getParameter("password3"));
		u2.setPhone(request.getParameter("phone3"));
		u2.setEmail(request.getParameter("email3"));
		u2.setYouji("good");
		u2.setState("0");
		UserDao2 ud=new UserDao2();
		int i=ud.insert(u2);
		if(i>0) {
			response.getWriter().append("{\"result\":\"00\"}");
		}
	}

}
