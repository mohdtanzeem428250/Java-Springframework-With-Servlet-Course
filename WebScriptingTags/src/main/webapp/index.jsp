<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		int a=10;
		String name="Tanzeem";
											//Declaration Tag
		public int square()
		{
			return a*a;
		}
	%>
	<%
		out.println("a : "+a);
	 	out.println("Name : "+name);
	 	out.println(square());
	 	
	 	int age=20;
	 	if(age>=18)
	 	{
	 		out.println("Voating is Allowed");
	 	}
	 	else
	 	{
	 		out.println("Voating does not Allowed");
	 	}
	 	
	 	for(int i=1;i<=8;i++)
	 	{
	 		out.println(i);
	 	}
	%>
	<%=a%>
	<%=name%>
	<%=square()%>
	<%=Math.floor(Math.random()*100) %>
</body>
</html>