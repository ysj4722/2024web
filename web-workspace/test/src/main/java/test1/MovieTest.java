package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import test1.Movie;
import test1.MovieTest;

public class MovieTest {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";
	
	public Connection dbcon() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if(con != null) System.out.println("db ok");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public ArrayList<Movie> selectAll(){
		
		ArrayList<Movie> list = null;
		list = new ArrayList<>();
		
		Connection con = dbcon();
		
		try {
			String sql = "select * from movie";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
				String title = rs.getString(1);
				String manager = rs.getString(2);
				String actor = rs.getString(3);
				String time = rs.getString(4);
				String grade = rs.getString(5);
				Movie m = new Movie(title, manager, actor, time, grade);
				list.add(m);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//실행된 결과
		
		return list;
		
	}
	
	public void insertMember(Movie newMovie) {
		
		Connection con = dbcon();
		
		String sql = "insert into movie(title, manager, actor, time, grade) values(?,?,?,?,?) ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			
			pst.setString(1, newMovie.getTitle());
			pst.setString(2, newMovie.getManager());
			pst.setString(3, newMovie.getActor());
			pst.setString(4, newMovie.getTime());
			pst.setString(5, newMovie.getGrade());
			
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Movie selectOne(String title) {
		
		//연결
		Connection con = dbcon();
		
		//sql
		String sql="select * from acorntbl where id=?";
		
		Movie movie = null;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, title);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				//id 존재하면 
				String title_tmp = rs.getString(1);
				String manager = rs.getString(2);
				String actor = rs.getString(3);
				String time = rs.getString(4);
				String grade = rs.getString(5);
				movie = new Movie(title_tmp, manager, actor, time, grade);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return movie;
	}
	
	
	public void update(String title, String newManager) {
		dbcon();
		Connection con = dbcon();
		
		String sql = "update movie set title=? where manager=?";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, newManager);
			pst.setString(2, title);
			
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		MovieTest test = new MovieTest();
		//dao.dbcon();
		ArrayList<Movie> list = test.selectAll();
		for(Movie movie : list) {
			System.out.println(movie);
		}
//		Acorn acorn = new Acorn("zas","0002","이길동");
//		dao.insertMember(acorn);
		
		Movie a = test.selectOne("가오갤");
		System.out.println(a);
		
		test.update("가오갤","프랫");
		
	}
}
