<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.lib.connection" import="java.sql.*" import="java.util.List" import="java.util.Iterator" import="libpojo.book"%>
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


out.println("<table border=1 width=50% height=50");  
        out.println("<tr><th>Book Id</th><th>Book name</th><th>Book amount</th><th>Author name</th><tr>");
        
     
        
        try {
      // 	 ResultSet rs = (ResultSet)request.getAttribute("rs");
      List dl = (List) request.getAttribute("dlist");
      Iterator it = dl.iterator();
			
			

			
			while(it.hasNext()) {
				book b = (book)it.next();
		//		System.out.println("Id: "+b.getId());
				
				 out.println("<tr><td>" + b.getId() + "</td><td>" + b.getBookname() + "</td><td>" + b.getBookamount() + "</td><td>" + b.getAuthor() +"</td><td><a href='update?id="+b.getId()+"'\">Edit</a></td></tr>"+ "</td><td><a href='delete?id="+b.getId()+"'\">Delete</a></td></tr>");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        out.println("</table>");

        out.println("<a href=\"insert.html\">Insert</a>");
        out.println("</html></body>"); 
	
        
%>

</body>
</html>