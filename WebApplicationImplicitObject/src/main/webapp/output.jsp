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
		String name1=request.getParameter("name");
		out.print(name1);
	%>
	<%
		String name2=(String)session.getAttribute("Name");
		out.print(name2);
	%>
</body>
</html>