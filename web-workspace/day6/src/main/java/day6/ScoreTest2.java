package day6;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/score2")
public class ScoreTest2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ScoreArray s = new ScoreArray();
		ArrayList<Score> list = s.getScoreList();
		
		System.out.println(list.size());
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("WEB-INF/views/scoretest.jsp").forward(request, response);
	}
}