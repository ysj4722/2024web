<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>   
<%@ page import="day6.Score" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
	border:1px solid black;
	border-collapse:collapse;
	width:500px;
	margin:0 auto;
}
td{
	border:1px solid black;
}
</style>
</head>
<body>
<% ArrayList<Score> list = (ArrayList<Score>) request.getAttribute("list"); %>
<table>
	<tr>
		<td>이름</td>
		<td>국어</td>
		<td>수학</td>
		<td>영어</td>
	</tr>
	<% for(int i=0;i<list.size();i++){
		Score s = list.get(i);
	%>
	<tr>
		<td><%=s.getName() %></td>
		<td><%=s.getKor() %></td>
		<td><%=s.getMath() %></td>
		<td><%=s.getEng() %></td>
	</tr>
	<% } %>
</body>
</html>