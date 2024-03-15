package test1;

public class Movie {
	String title;
	String manager;
	String actor;
	String time;
	String grade;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Movie(String title, String manager, String actor, String time, String grade) {
		super();
		this.title = title;
		this.manager = manager;
		this.actor = actor;
		this.time = time;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", manager=" + manager + ", actor=" + actor + ", time=" + time + ", grade="
				+ grade + "]";
	}
}
