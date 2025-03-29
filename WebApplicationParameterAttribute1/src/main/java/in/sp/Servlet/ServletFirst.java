package in.sp.Servlet;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class ServletFirst extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String number1=request.getParameter("first");
		String number2=request.getParameter("second");
		request.setAttribute("sum",number1);
		System.out.println(number1);
		System.out.println(number2);
		RequestDispatcher rd=request.getRequestDispatcher("index.html");
		rd.forward(request, response);
	}
}
