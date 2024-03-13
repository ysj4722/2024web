package day6;

import java.util.ArrayList;

public class ScoreArray {
	
	public ArrayList<Score> getScoreList(){
		
		ArrayList<Score> list = new ArrayList<>();
		list.add(new Score("김길동",86,64,72));
		list.add(new Score("이길동",66,74,82));
		list.add(new Score("박길동",73,74,67));
		return list;
	}
}
