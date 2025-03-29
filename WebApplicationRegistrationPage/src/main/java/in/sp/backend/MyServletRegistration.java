package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/RegistrationForm")
public class MyServletRegistration extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		String name1=request.getParameter("name2");
		String email1=request.getParameter("email2");
		String password1=request.getParameter("password2");
		String gender1=request.getParameter("gender2");
		String city1=request.getParameter("city2");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/webApplicationJava","root","tanzeem");
			PreparedStatement ps=connection.prepareStatement("insert into register values(?,?,?,?,?)");
			ps.setString(1, name1);
			ps.setString(2, email1);
			ps.setString(3,password1);
			ps.setString(4, gender1);
			ps.setString(5, city1);
			
			int count=ps.executeUpdate();
			if(count>0)
			{
				response.setContentType("text/html");
				out.println("<h1 style='color:green'>User Registered Successfully</h1>");
				RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
				rd.include(request, response);
			}
			else
			{
				response.setContentType("text/html");
				out.println("<h1 style='color:red'>User Not Registered Due To Some Error</h1>");
				RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
				rd.include(request, response);
			}
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
			
			response.setContentType("text/html");
			out.println("<h1 style='color:red'>"+exception.getMessage()+"</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
			rd.include(request, response);
		}
	}
}
