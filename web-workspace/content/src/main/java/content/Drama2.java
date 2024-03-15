package content;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/drama2")
public class Drama2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		HttpSession session = request.getSession();
		
		session.setAttribute("name",name);
		
		if(name.equals("radio2")) {
			request.getRequestDispatcher("WEB-INF/views/yes.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("WEB-INF/views/no.jsp").forward(request, response);
		}
//		
	}
}
