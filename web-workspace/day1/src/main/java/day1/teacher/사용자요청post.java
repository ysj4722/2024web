package day1.teacher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿으로 등록함, 서블릿 이름 정의 :  이 이름을  클라이언트가   요청함
@WebServlet("/postreq")
public class 사용자요청post  extends HttpServlet{
	 
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		 System.out.println(" hello servlet");
	  
		 resp.setCharacterEncoding("utf-8");
		 resp.setContentType("text/html;charset=utf-8");
		 //응답을 보내기 위한 스트림 얻어오기		 
		 PrintWriter out  =  resp.getWriter();
		 
		  
		 //클라이언트는 어떻게 서버게 post 요청을 할 수 있는가?
		 //form태그에서 method="post"를 사용한다
		 
		 
		 //post요청 만들어보기
		 //post요청 찾아보기
		 
		 
		 
		 //post로 요청이 온 경우 클라이언트의 값 얻어오기
		 
		 
		 String su1_ =  req.getParameter("su1");
		 String su2_  = req.getParameter("su2");
		 
		 
		 int su1  = Integer.parseInt( su1_);
		 int su2 = Integer.parseInt( su2_);
		 
		 
		 int sum  = su1+ su2;
		 
		 System.out.println( sum );
		 
		 
		 
		 out.println( sum);
		 
		 
		 
	}

}
