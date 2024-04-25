<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.lib.connection" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="bookobj" class="libpojo.book" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="bookobj"/>

<% 
	
		int id = Integer.parseInt(request.getParameter("bookid"));
		String bn = request.getParameter("bookname");
		int amt = Integer.parseInt(request.getParameter("bookamount"));
		String an = request.getParameter("authorname");

		
		bookobj.setId(id);
		bookobj.setBookname(bn);
		bookobj.setBookamount(amt);
		bookobj.setAuthor(an);
		
		
		 int val = connection.update(bookobj);
		 if(val==1) {
			 RequestDispatcher rd = request.getRequestDispatcher("display.html");
				rd.forward(request,response);
		 }else {
			 out.println("<html><body><b>Updation Not successful"
                     + "</b></body></html>");
		 }
		 
		 %>

</body>
</html>