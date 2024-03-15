package day8;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/simple")
public class SimpleServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		//입력
		
		//
		SimpleService service = new SimpleService();
		String simpleMsg=service.getSimple();
		
		request.setAttribute("msg", simpleMsg);
		
		//응답
		request.getRequestDispatcher("WEB-INF/views/simple.jsp").forward(request, response);
	}
}
