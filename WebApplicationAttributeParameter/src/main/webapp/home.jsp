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
		String first1=request.getParameter("first");
		String second1=request.getParameter("second");
		String s1=(String)request.getAttribute("first");
	%>
	<h1>Welcome  <%=s1%><%=second1%></h1>
</body>
</html>