<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.lib.connection"%>
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

int st = connection.insert(bookobj);
out.println(st);


if(st==1){
	out.print("Insertion Sucessful! :");
	out.print(bookobj.getId()+"----------");
	out.print(bookobj.getBookname()+"----------");
	out.print(bookobj.getAuthor()+"----------");
	out.print(bookobj.getBookamount()+"----------");
	
	RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
	rd.forward(request,response);
	
	
}else{
	out.print("Registration Unsucessful!");
}

%>
</body>
</html>