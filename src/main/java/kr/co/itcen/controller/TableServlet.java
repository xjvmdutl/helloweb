package kr.co.itcen.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/table")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Col=request.getParameter("c");
		String Row=request.getParameter("r");
		int nCol=Integer.parseInt(Col);
		int nRow=Integer.parseInt(Row);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out=response.getWriter();
		for(int i=0;i<nRow;++i) {
			out.println("<tr>");
			for(int j=0;j<nCol;++j) {
				out.println("<td>cell("+i+","+j+")");
			}
			out.println("<tr>");
		}
		out.println("</table>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
