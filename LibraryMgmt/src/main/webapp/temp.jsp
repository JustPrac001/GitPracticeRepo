<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
int id = (int)request.getAttribute("id");
  String bn = (String)request.getAttribute("bn");
	int ba = (int)request.getAttribute("ba");
		 String an = (String)request.getAttribute("an");
	     
	%>    
	   
	    <form action='edit' method='post'>

	   <label hidden for='bookid'>BookId:</label>

	     <input hidden type='text' id='bookid' name='bookid' value=<%=id %>><br><br>

	     <label for='bookname'>BookName:</label>

	  <input type='text' id='bookname' name='bookname' value=<%=bn %> maxlength='20'><br><br>

	     <label for='bookamount'>BookAmount:</label>

     <input type='number' id='bookamount' name='bookamount' value=<%=ba %> maxlength='20'><br><br>

	    <label for='authorname'>AuthorName:</label>

	  <input type='text' id='authorname' name='authorname' value=<%=an %> maxlength='20'><br><br>

	    <input type='submit' value='Submit'>

	  </form>	
	     </body>
	   </head>
	     </html>

</body>
</html>