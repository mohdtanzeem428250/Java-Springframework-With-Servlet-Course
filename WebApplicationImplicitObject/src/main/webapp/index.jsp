<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name="Tanzeem";
		out.print(name);
	%>
	<%
		session.setAttribute("Name","Mohd Tanzeem");
	%>
	<form action="output.jsp" method="get">
		<input type="text" name="name" placeholder="Enter Name"/>
		<input type="submit" value="Click Me!"/>
	</form>
</body>
</html>