package com.stx.zh.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stx.zh.dao.UserDao2;
import com.stx.zh.model.User2;

/**
 * Servlet implementation class XinxiServlet
 */
@WebServlet("/XinxiServlet")
public class XinxiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XinxiServlet() {
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("111");
		String user=request.getParameter("loginname");
		UserDao2 ud=new UserDao2();
		ArrayList list =ud.selectall(user);
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(list);
		response.getWriter().print(json);
	
	
		
		
	}
}
