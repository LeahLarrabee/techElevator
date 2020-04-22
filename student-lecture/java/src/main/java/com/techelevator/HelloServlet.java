package com.techelevator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		if (name == null) {

			name = "World";
		}



		out.println("<!DOCTYPE html>");
		response.getWriter().println("<html>");
		response.getWriter().println("<body>");
		response.getWriter().println("<head>");
		response.getWriter().println("<title>HelloServlet</title>");
		response.getWriter().println("</head>");
		response.getWriter().println("<h1>Hello, " + name + "!</h1>");
		response.getWriter().println("<h1>Our demo " + request.getParameter("demo") + "!</h1>");
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
}
