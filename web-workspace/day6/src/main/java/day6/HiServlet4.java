package day6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi4")
public class HiServlet4 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HiService2 s = new HiService2();
		String m = s.gethello();
		
		request.setAttribute("m", m);
		request.getRequestDispatcher("WEB-INF/views/hellojsp.jsp").forward(request, response);
	}
}
