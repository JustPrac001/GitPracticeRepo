package editupdatepack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lib.connection;
import libpojo.book;

/**
 * Servlet implementation class edit
 */
//@WebServlet("/edit")
public class edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		
		PrintWriter out = response.getWriter();

		
		int id = Integer.parseInt(request.getParameter("bookid"));
		String bn = request.getParameter("bookname");
		int amt = Integer.parseInt(request.getParameter("bookamount"));
		String an = request.getParameter("authorname");

		book b = new book();
		b.setId(id);
		b.setBookname(bn);
		b.setBookamount(amt);
		b.setAuthor(an);
		
		
		 int val = connection.update(b);
		 if(val==1) {
			 RequestDispatcher rd = request.getRequestDispatcher("display.html");
				rd.forward(request,response);
		 }else {
			 out.println("<html><body><b>Updation Not successful"
                     + "</b></body></html>");
		 }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
