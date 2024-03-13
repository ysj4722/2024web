package test1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test.sum")
public class SecondServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum=sum+i;
		}
		
		//합계 응답하기
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println(sum);
		out.println("</html>");
	}
}
