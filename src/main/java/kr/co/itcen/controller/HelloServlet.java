package kr.co.itcen.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String no=request.getParameter("no");//반드시 쿼리로 넘어오는 값은 String
		System.out.println(name+":"+email+":"+no);
		//response
		response.setContentType("text/html; charset=utf-8");//밑에다 쓰게 될 경우  
		PrintWriter out = response.getWriter();//바디 내용을 쓴다는 뜻이기 떄문에 동작x
		out.println("<h1>안녕 세상~~</h1>");//contents타입을 몰라서 깨진다.
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
