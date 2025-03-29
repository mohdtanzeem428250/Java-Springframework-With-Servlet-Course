package in.sp.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletSecond extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter writer=response.getWriter();
		String second=request.getParameter("second");
		String sum=(String)request.getAttribute("sum");
		writer.println("First Name :- "+sum+":"+"Second Name :- "+second);
		
	}
}
