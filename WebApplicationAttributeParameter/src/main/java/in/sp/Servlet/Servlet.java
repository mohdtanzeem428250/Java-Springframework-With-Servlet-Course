package in.sp.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class Servlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter writer=response.getWriter();
		String first1=request.getParameter("first");
//		String second1=request.getParameter("second");
		writer.println("Name :- "+first1);
		request.setAttribute("first", first1);
		RequestDispatcher rd=request.getRequestDispatcher("/home.jsp");
		rd.forward(request, response);
	}
}
