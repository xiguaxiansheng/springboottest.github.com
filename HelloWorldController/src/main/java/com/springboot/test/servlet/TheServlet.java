package com.springboot.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/xs/servlet",description="Servlet的说明")
public class TheServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1330706435748729027L;
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>>>doGet()<<<<<<<<<");
		doPost(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>>>>doPost()<<<<<<<<<<");
		resp.setContentType("text/html;charset=utf-8");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		
		out.println("<head>");
		out.println("<title>Hello world</title>");
		out.println("</head>");
		
		out.println("<body>");
		out.println("<h1>注解注册Servlet....</h1>");
		out.println("</body>");
		
		out.println("</html>");
	}
	
	

}
