package day1.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/number")
public class 문제6 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//12
		//
		
		
		PrintWriter out = resp.getWriter();
		int [] su2 = new int[20];
		int index = 0;
		
		String su1 = req.getParameter("su");
		int su = Integer.parseInt(su1);
		
		for(int i=1;i<=su;i++) {
			if(su%i==0) {
				su2[index]=i;
				index++;
			}			
		}

		//0  1    2   3   4   5 
		//1  2    3   4   6   12 
		
		// su2배열에 약수
		
		String str="";
		for( int i=0; i<index; i++) {
			str =  str+ su2[i] +"  ";
		}
		
		out.print(str);
		
	}
}
