package in.sp.backend;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
@WebServlet("/login")
public class Login extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String email1=request.getParameter("email");
		String password1=request.getParameter("password");
		
		if(email1.equals("mtanzeem115@gmail.com") && password1.equals("tanzeem@#123"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/Profile.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			rd.forward(request, response);
		}
	}
}
