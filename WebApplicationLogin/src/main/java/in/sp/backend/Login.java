package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/Login")
public class Login extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name1=request.getParameter("email");
		String password1=request.getParameter("password");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/webApplicationJava","root","tanzeem");
			PreparedStatement ps=connection.prepareStatement("select *from register where Email=? and Password=?");
			ps.setString(1, name1);
			ps.setString(2, password1);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				HttpSession session=request.getSession();
				session.setAttribute("name_session", rs.getString("name"));
				RequestDispatcher rd=request.getRequestDispatcher("/profile.jsp");
				rd.include(request, response);
			}
			else
			{
				out.println("<h1 style='color:red'>Email Id And Password Did'nt Match</h1>");
				RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
				rd.include(request, response);
			}
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
			out.println("<h1 style='color:red'>"+exception.getMessage()+"</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
			rd.include(request, response);
		}
	}
}
