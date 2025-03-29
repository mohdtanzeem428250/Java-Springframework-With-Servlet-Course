package in.sp.Servlet;

import java.io.PrintWriter;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class Servlet1 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter writer=response.getWriter();
		String name=(String)request.getParameter("name");
		writer.println("<h1>Hello, "+name+" Welcome to my website</h1>");
		writer.println("<a href='Servlet2.jsp'>Go to Servlet 2</a>");
		Cookie c=new Cookie("Username",name);
		response.addCookie(c);
		
	}
}
