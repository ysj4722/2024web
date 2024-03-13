package day3;

import java.sql.*;

public class DBTEST3 {

	public static void main(String[] args) {
		
		
		//DB연결정보
		//driver
		//url
		//사용자, 비밀번호
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		
		
		 
			
			try {
				//1.드라이버 로드(객체생성)
				Class.forName(driver);
				//2.데이터베이스 연결
				Connection con = DriverManager.getConnection(url, user, password);
				
				//3.문장얻어오기
				String name="김예원";
				String sql = "select * from acorntbl where name=?";			 
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, name);		 
				
			 
				ResultSet rs = pst.executeQuery();
				
				while(rs.next()) {
					System.out.print(rs.getString(1));
					System.out.print(rs.getString(2));
					System.out.print(rs.getString(3));
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//2.데이터베이스 연결
		
	 

	}

}
