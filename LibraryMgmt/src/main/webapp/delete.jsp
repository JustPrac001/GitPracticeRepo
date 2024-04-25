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
<%-- 
	int id = Integer.parseInt(request.getParameter("id"));
		
		 bookobj.setId(id);
		 boolean val = connection.delete(bookobj);
		 if(val==true) {
			 out.print("delete called thorugh jsp");
			 RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
				rd.forward(request,response);
		 }else {
			 out.println("<html><body><b>Deletion Not successful"
                     + "</b></body></html>");
		 }
		 --%>

</body>
</html>