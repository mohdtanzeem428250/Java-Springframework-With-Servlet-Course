package in.sp.Servlet;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServleatResponse;
@WebServlet("/ServletFirst")
public class ServletFirst extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String number1=request.getParameter("first");
//		String number2=request.getParameter("second");
//		System.out.println(sum);
		request.setAttribute("sum",number1);
		RequestDispatcher rd=request.getRequestDispatcher("ServletSecond");
		rd.forward(request, response);
	}
}
