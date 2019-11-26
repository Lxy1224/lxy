package com.stx.zh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.stx.zh.dao.UserDao2;
import com.stx.zh.model.User2;

/**
 * Servlet implementation class LoginServlet2
 */
@WebServlet("/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet2() {
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
		String username=request.getParameter("user3");
		String password=request.getParameter("password3");
		UserDao2 ud=new UserDao2();
		boolean i=ud.login_user(username, password);
		String state=ud.selectstate(username);
		if(i) {
			if(state.equals("0")) {
				response.getWriter().append("{\"result\":\"01\"}");
			}
			else {
				response.getWriter().append("{\"result\":\"02\"}");
				HttpSession session=request.getSession();
				session.setAttribute("adname",username);
			}
			
		}else {
			response.getWriter().append("{\"result\":\"03\"}");
		}	
	}
}
