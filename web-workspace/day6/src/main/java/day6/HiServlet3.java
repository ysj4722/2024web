package day6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi3")
public class HiServlet3 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		HiService service = new HiService();
		String msg = service.gethello();
		System.out.println(msg);
		
		request.setAttribute("msg", msg);
		
		request.getRequestDispatcher("WEB-INF/views/hellomsg.jsp").forward(request, response);
	}
}
