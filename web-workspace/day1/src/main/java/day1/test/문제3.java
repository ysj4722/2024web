package day1.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/num")
public class 문제3 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String su_ = req.getParameter("su");
		int su = Integer.parseInt(su_);
		
		PrintWriter n = resp.getWriter();
		for(int j=1;j<=9;j++) {
			n.println(su+" * "+j+" = "+su*j);
		}
	}
}
