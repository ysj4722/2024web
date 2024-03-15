package survey;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/survey2")
public class ServeyTwo extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String animal =	request.getParameter("animal");
		//세션
	
		HttpSession session = request.getSession();
		session.setAttribute("animal", animal);
		
		request.getRequestDispatcher("WEB-INF/views/survey2.jsp").forward(request, response);
		
	}
}
