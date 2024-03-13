package day1.test;

public class Score {
	String name;
	int kor;
	int eng;
	int sum;
	double avg;
	char grade;
	
	public Score() {
	}
	
	public Score(String name, int kor, int eng) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.sum=kor+eng;
		this.avg=sum/2;
		this.grade = CalcGrade();
	}
	
	public char CalcGrade() {
		if(avg>=90) {
			return 'A';
		}else if(avg>=80) {
			return 'B';
		}else if(avg>=70) {
			return 'C';
		}else if(avg>=60) {
			return 'D';
		}else {
			return 'F';
		}
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", sum=" + sum + ", avg=" + avg + ", grade="
				+ grade + "]";
	}
	
	
}
