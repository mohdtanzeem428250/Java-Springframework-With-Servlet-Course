package in.sp.backend;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class Login extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	{
		String name1=request.getParameter("name");
		String email1=request.getParameter("email");
		String password1=request.getParameter("password");
		PrintWriter out=response.getWriter();
		if(email1.equals("mtanzeem115@gmail.com") && password1.equals("tanzeem@#123"))
		{
//			request.setAttribute("name_key", "Tanzeem");
			HttpSession session=request.getSession();
			session.setAttribute("name_key",name1);
			session.setAttribute("gender_key", "Male");
			RequestDispatcher rd=request.getRequestDispatcher("/profile.jsp");
			rd.forward(request,response);
		}
		else
		{
			response.setContentType("text/html");
			out.print("<h1 style='color:red'>Email and Password did'nt match</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			rd.forward(request,response);
		}
	}
}
