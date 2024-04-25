package displaypack;
//import deletepack.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lib.connection;

/**
 * Servlet implementation class display
 */
//@WebServlet("/display")
public class display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public display() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		ResultSet rs = connection.display();
		List dlist = connection.display();
//		request.setAttribute("rs", rs);
		request.setAttribute("dlist", dlist);
		
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request,response);
	}
//
//		 PrintWriter out = response.getWriter();
//		 out.println("<table border=1 width=50% height=50%>");  
//         out.println("<tr><th>Book Id</th><th>Book name</th><th>Book amount</th><th>Author name</th><tr>");
//         
//         try {
//        	 
//			while (rs.next()) 
//			 {  
//			     int id = rs.getInt("id");  
//			     String bn = rs.getString("bookname");  
//			     int amt = rs.getInt("bookamount");
//			     String an = rs.getString("authorname"); 
//			     System.out.println(id);
//			   
//			     out.println("<tr><td>" + id + "</td><td>" + bn + "</td><td>" + amt + "</td><td>" + an +"</td><td><a href='update?id="+id+"'\">Edit</a></td></tr>"+ "</td><td><a href='delete?id="+id+"'\">Delete</a></td></tr>");   
//			 }
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  
//         out.println("</table>");
//
//         out.println("<a href=\"insert.html\">Insert</a>");
//         out.println("</html></body>"); 
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
