package day1.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/number2")
public class 문제6_2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//12
		//
		resp.setCharacterEncoding("utf-8");
		 resp.setContentType("text/html;charset=utf-8");
		
		
		PrintWriter out = resp.getWriter();

		
		String su1 = req.getParameter("su");
		int su = Integer.parseInt(su1);
		
		int cnt = 0;
		for(int i=1;i<=su;i++) {
			if(su%i==0) {
				cnt++;
			}			
		}
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.print(su+"의 약수: "+cnt+"개");
		out.println("</body>");
		out.println("</html>");
		
	}
}
