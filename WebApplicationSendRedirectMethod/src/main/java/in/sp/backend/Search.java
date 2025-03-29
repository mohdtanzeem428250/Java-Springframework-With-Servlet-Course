package in.sp.backend;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submitForm")
public class Search extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.sendRedirect("https://www.google.com");
		String search2=request.getParameter("search1");
		response.sendRedirect("https://www.google.com/serach?q="+search2);
	}
}
