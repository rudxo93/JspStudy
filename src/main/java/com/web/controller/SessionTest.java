package com.web.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest
 */
@WebServlet("/sessionTest")  // session 브라우저가 닫히면 날아간다. 단 브라우저가 열려있으면 유지
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("test", "test입니다.");
		request.getRequestDispatcher("/WEB-INF/views/session.jsp").forward(request, response);
		session.invalidate();  // 강제적으로 세션 소멸
		System.out.println(session.getId());
		
	
	}

}
