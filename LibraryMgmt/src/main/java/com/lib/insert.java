package com.lib;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lib.connection;
import libpojo.book;

/**
 * Servlet implementation class library
 */
//@WebServlet("/insert")
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insert() {
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
		// TODO Auto-generated method stub
//
		 PrintWriter out = response.getWriter();
		try {
			

			String bookname = request.getParameter("bookname");
			int bookamount = Integer.parseInt(request.getParameter("bookamount"));
			String authorname = request.getParameter("authorname");
			
			book b = new book();
			b.setBookname(bookname);
			b.setBookamount(bookamount);
			b.setAuthor(authorname);
			int st = connection.insert(b);
			
			if(st==1) {
//				request.getAttribute("rs",);
				System.out.println("checking insert flow");
//				RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
//				rd.forward(request,response);
//				ResultSet rs = connection.display();
//				request.setAttribute("rs", rs);
				response.sendRedirect("display.html");
			}else {
				out.println("<html><body><b>Not successful"
                        + "</b></body></html>");
			}
	  
	    
	             
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
