package in.sp.backend;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/SubmitForm")
public class MyServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name=request.getParameter("name");	
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("Password : "+password);
		
		PrintWriter out=response.getWriter();
		out.print("Name : "+name);
		out.print("Email : "+email);
		out.print("Password : "+password);
	}
}
