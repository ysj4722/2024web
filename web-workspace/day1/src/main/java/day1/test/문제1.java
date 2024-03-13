package day1.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/math")
public class 문제1 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		int a=  Integer.parseInt(request.getParameter("a"));
		
		int b=  Integer.parseInt(request.getParameter("b"));
		
		int sum = a+b;
		PrintWriter out = response.getWriter();
		out.println(sum);
		/*out.println();
		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		int option = sc.nextInt();
		System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈");
		switch(option) {
		case 1: 
			out.println(su1+su2);
			break;
		case 2: 
			out.println(su1-su2);
			break;
		case 3: 
			out.println(su1*su2);
			break;
		case 4: 
			out.println(su1/su2);
			break;
		}
		
		*/
		
		
		
		   
		
		
			
	}
}
