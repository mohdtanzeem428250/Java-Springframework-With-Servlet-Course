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
	String name=(String)request.getParameter("name");
	%>
	<%
		Cookie[] cookie=request.getCookies();
		boolean f=false;
		String name1="";
		if(cookie==null)
		{%>
			<h1>you are new user go to home page and submit your name</h1>
			return;
		<%}
		else
		{
			for(Cookie cookie1:cookie)
			{
				String temp=cookie1.getName();
				if(temp.equals("Username"))
				{
					f=true;
					name=cookie1.getValue();
				}
			}
		}
		if(f)
		{%>
			<h1>Hello, <%=name%> Welcome back to my website</h1>
			<h1>Thank You</h1>
		<%}
		else
		{%>
			<h1>you are new user go to home page and submit your name</h1>
		<%}%>
</body>
</html>