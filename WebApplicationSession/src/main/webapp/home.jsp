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
		String myname=(String) session.getAttribute("name_key");
	String mygender=(String) session.getAttribute("gender_key");
	%>
	<h3>Welcome : <%= myname %> <%= mygender %></h3>
	<a href="profile.jsp">Profile</a>&nbsp;&nbsp;
	<a href="about.us.jsp">About Us</a>
</body>
</html>