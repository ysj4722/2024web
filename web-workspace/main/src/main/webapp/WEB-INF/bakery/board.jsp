<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@  page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
header{
 border:1px solid black;
 padding :20px;
}
nav{
	
	 border:1px solid black;
	 padding :10px;
}

a{
	text-decoration:none;
	color:black;
}
nav span{
   padding-right: 5px;
}


section {
 
 padding:10px;
}


footer{
  border:1px solid black;
  display: flex;
  padding:10px;
  
}

footer  > div{
 
}


footer > div:nth-child(1) {	 
	 width:20%;
}



footer > div:nth-child(2) {	 
	 width:60%;
}



footer > div:nth-child(3) {
	 
	 width:20%;
}

table{
	 width:400px;
	 border:1px solid black;
	 margin:0 auto;
	 border-collapse: collapse;
}

td{
 border:1px solid black;
 text-align: center;
}
.nav_1{
  width: 300px;
  height: 70px;
  margin: 0 auto;
}
.nav_1 img{
  position: relative;
  margin: 0 auto;
}
.nav_1 input{
  position: relative;
    left: 450px;
    width: 70px;
    height: auto;
    bottom: 50px;
    border: 1px solid rgb(223, 223, 223); 
    background-color: rgb(250,232,245);
}
.nav_2{ /*메뉴바 영역*/
  margin: 0 auto;
  position: relative;
  text-align: center;
  line-height: 40px;
}
.menu1{
  width: 200px;
}
.menu1 a{
  color: purple;
  font-weight: bolder;
}
.sub1{
  position: absolute;
  top: -9999px;
  z-index: 9999;
  width: 158px; /* 테두리 너비 얼추 맞추기 */
  background-color: pink;  
  border: 1px solid purple;
}
.sub1 li{
  position: relative;
}
.sub1 a{
  display: block;
  font-size: 20px;
  line-height: 40px;
  padding-right: 20px;
  margin: 0 auto;
}
.sub1 a:hover{
  color: #ffffff;
  background: pink;
}
.nav_2 li{ /*메뉴바 */
  list-style: none;
  display: inline-block;
  font-size: 20px;
  position: relative;
}
.menu1:hover{/*메뉴바에 마우스 갖다댔을때*/
  background-color: rgb(248, 223, 227);
  z-index: 9999;
}
.menu1:hover .sub1{
  right: 0;
  top: 40px;
}
</style>
</head>
<body>
        <header>
            <nav class="nav_main">
                <nav class="nav_1">
                <a href="main.jsp"><img src="/main/imgs/logo.png" width="300px" style="left: 00px;"></a>
                <input type="submit" value="로그인" onclick="document.location.href='/main/login'">
                <input type="button" value="회원가입" onclick="document.location.href='/main/agreement'">
                </nav>
                <nav class="nav_2">
                    <ul>
                        <li class="menu1"><a href="">CAKE</a>
                            <ul class="sub1">
                                <li><a href="">생크림</a></li>
                            </ul>
                        </li>
                        <li class="menu1"><a href="">COOKIE</a>
                            <ul class="sub1">
                                <li><a href="">마들렌</a></li>
                                <li><a href="">휘낭시에</a></li>
                                <li><a href="">MORE</a></li>
                            </ul>
                        </li>
                        <li class="menu1"><a href="">CLASS</a>
                            <ul class="sub1">
                                <li><a href="">수업문의</a></li>
                            </ul>
                        </li>
                        <li class="menu1"><a href="">ORDER</a>
                            <ul class="sub1">
                                <li><a href="">상품주문</a></li>
                            </ul>
                        </li>
                        <li class="menu1"><a href="">Q&A</a>
                            <ul class="sub1">
                                <li><a href="board.jsp">게시판</a></li>
                            </ul>
                        </li>
                    </ul>
                </nav>
        </header>

<nav>
	<span> <a href="#">  메뉴1</a></span>
	<span> <a href="#">  메뉴2</a></span>
	<span> <a href="#">  메뉴3</a></span>
	<span> <a href="#">  메뉴4</a></span>
</nav>

<section>
  
  <table>
  <caption>  글목록 </caption>
  <!--  제목줄 -->
  	<tr>
  	  <td>번호 </td>
  	  <td>제목</td>
 	  <td>작성자</td> 
 	  <td>작성일</td>
 	  <td>조회수</td>
 	  <td>수정/삭제</td>  	     	  
  	</tr>  
  
  <%
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";	
	
			
	try {
		//1. 드라이버 로드 (객체생성)
		Class.forName(driver);			
		//2. 데이터베이스 연결
		Connection  con = DriverManager.getConnection(url, user, password);
		
		//3. 문장얻어오기 
		  
		String sql  ="select * from  게시판";
		PreparedStatement  pst =con.prepareStatement(sql);
	 
		//5.실행 ( executeQuery()-조회,  executeUpdate()- 나머지 등록, 변경, 삭제)
		ResultSet  rs =pst.executeQuery();	
		
		//
		while( rs.next()) {		
  %>	

  	<tr>
  	  <td> <%= rs.getString(1) %> </td>
  	  <td> <%= rs.getString(2) %></td>
 	  <td> <%= rs.getString(3) %></td>  
 	  <td> <%= rs.getString(4) %></td>
 	  <td> <%= rs.getString(5) %></td> 
 	   <td>
 	    <a href="updateForm.jsp?id=<%= rs.getString(1) %>">수정</a>
 	   /
 	    <a href="deleteAction.jsp?id=<%= rs.getString(1)%>">삭제</a></td>  	  	     	  
  	</tr> 
  	
  	<%
		} 			
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch 
	(SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
  	
  	
  	%>
  </table>
 
</section>

<footer>
	<div>ACORN</div>
	<div>회사소개인재채용제휴제안이용약관개인정보처리방침청소년보호정책네이버 정책고객센터ⓒ NAVER Corp.</div>
	<div>기업 사이트</div>
</footer>

</body>
</html>