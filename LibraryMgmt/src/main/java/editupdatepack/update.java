package editupdatepack;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class update
 */
//@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//
////		
		PrintWriter out = response.getWriter();
////		
		int id = Integer.parseInt(request.getParameter("id"));
		 book b = new book();
//		 ResultSet rs = connection.getEmpById(id);
		 book b1 = connection.getEmpById(id);
		 
		
			
			
////		 
////
////		 
	     String bookname = null;
	     int bookamt = 0;
	     String authorname = null;
		try {
//			while(rs.next()) {
//				
//				bookname = rs.getString("bookname");
//				bookamt = rs.getInt("bookamount");
//			    authorname = rs.getString("authorname");
//			    System.out.println(bookname);
//			    System.out.println(bookamt);
//			    System.out.println(authorname);
//			}
			bookname = b1.getBookname();
			bookamt = b1.getBookamount();
		    authorname = b1.getAuthor();
			
////			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		request.setAttribute("id", id);
		 request.setAttribute("bn", bookname);
		 request.setAttribute("ba", bookamt);
		 request.setAttribute("an", authorname);
		 
		 
		 RequestDispatcher rd = request.getRequestDispatcher("temp.jsp");
			rd.forward(request,response);
	     
//	     out.println("<html>");
//	     out.println("<head>");
//	     out.println("<title>Insert title here</title>");
//	     out.println("<body>");
//	     out.println("<form action='edit' method='post'>");
//
//	     out.println("<label hidden for='bookid'>BookId:</label>");
//
//	     out.println("<input hidden type='text' id='bookid' name='bookid' value="+id+"><br><br>");
//
//	     out.println("<label for='bookname'>BookName:</label>");
//
//	     out.println("<input type='text' id='bookname' name='bookname' value=\""+bookname+"\" maxlength='20'><br><br>");
//
//	     out.println("<label for='bookamount'>BookAmount:</label>");
//
//     out.println("<input type='text' id='bookamount' name='bookamount' value=\""+bookamt+"\" maxlength='20'><br><br>");
//
//	     out.println("<label for='authorname'>AuthorName:</label>");
//
//	     out.println("<input type='text' id='authorname' name='authorname' value=\""+authorname+"\" maxlength='20'><br><br>");
//
//	     out.println("<input type='submit' value='Submit'>");
//
//	     out.println("</form>");	
//	     out.println("</body>");
//	     out.println("</head>");
//	     out.println("</html>");
		 
	 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		

			

		
	}

}
