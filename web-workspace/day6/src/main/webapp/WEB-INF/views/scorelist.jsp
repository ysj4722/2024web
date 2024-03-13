<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="day6.Score" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.wrap{
	width:600px;
	display:flex;
	border:1px solid black;
	margin:0 auto;
}
.wrap div{
	border:1px solid black;
	width:33%;
}
h4{
	text-align: center;
}
</style>
</head>
<body>
<% Score s = (Score)request.getAttribute("s"); %>
<div class="wrap">
	<h4>학생 정보</h4>
	<div><%=s.getName()%></div>
	<div><%=s.getKor()%></div>
	<div><%=s.getMath()%></div>
	<div><%=s.getEng()%></div>
</div>
</body>
</html>