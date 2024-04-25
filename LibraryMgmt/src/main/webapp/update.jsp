<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="com.lib.connection" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="bookobj" class="libpojo.book" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="bookobj"/>



<%--
int id = Integer.parseInt(request.getParameter("id"));
System.out.println("printing ids from update:");
System.out.println(id);
 
 ResultSet rs = connection.getEmpById(id);
 

 
 String bookname = null;
 int bookamt = 0;
 String authorname = null;
try {
	while(rs.next()) {
		bookname = rs.getString("bookname");
		bookamt = rs.getInt("bookamount");
	    authorname = rs.getString("authorname");
	    System.out.println(bookname);
	    System.out.println(bookamt);
	    System.out.println(authorname);
	}
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}  
  
 
 
 out.println("<html>");
 out.println("<head>");
 out.println("<title>Insert title here</title>");
 out.println("<body>");
 out.println("<form action='edit.jsp' method='post'>");

 out.println("<label hidden for='bookid'>BookId:</label>");

 out.println("<input hidden type='text' id='bookid' name='bookid' value="+id+"><br><br>");

 out.println("<label for='bookname'>BookName:</label>");

 out.println("<input type='text' id='bookname' name='bookname' value=\""+bookname+"\" maxlength='20'><br><br>");

			

 out.println("<label for='bookamount'>BookAmount:</label>");

 out.println("<input type='text' id='bookamount' name='bookamount' value=\""+bookamt+"\" maxlength='20'><br><br>");

			

 out.println("<label for='authorname'>AuthorName:</label>");

 out.println("<input type='text' id='authorname' name='authorname' value=\""+authorname+"\" maxlength='20'><br><br>");

			

			

 out.println("<input type='submit' value='Submit'>");

 out.println("</form>");	
 out.println("</body>");
 out.println("</head>");
 out.println("</html>");
 
 --%>




</body>
</html>