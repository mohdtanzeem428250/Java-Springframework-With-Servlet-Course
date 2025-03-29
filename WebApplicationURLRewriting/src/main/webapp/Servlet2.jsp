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
		String name1=request.getParameter("user");
	%>
	<h1>Welcome Back <%=name1%></h1>
</body>
</html>