package test1;

import java.util.ArrayList;

import test1.Movie;

public class MovieList {
	
	MovieTest test = new MovieTest();

	public ArrayList<Movie> getMemberListTemp(){
		ArrayList<Movie> list = new ArrayList<>();
		list.add(new Movie("어벤져스","루소형제","로다주","200분","A"));
		list.add(new Movie("캡틴아메리카","루소형제","에반스","120분","B"));
		list.add(new Movie("아이언맨","루소형제","로다주","120분","A"));
		list.add(new Movie("토르","루소형제","햄스워스","130분","C"));
		return list;
	}
	
	public ArrayList<Movie> getMemberListReal(){
		ArrayList<Movie> list = test.selectAll();
		return list;
	}
	public void registerMember(Movie movie) {
		test.insertMember(movie);
	}
}