<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.line{
	width:300px;
	boder:1px solid black;
	padding:5px;
}
</style>
</head>
<body>
<h2>구구단</h2>
<%
	for(int i=1;i<=9;i++){
		out.println(3*i +"<br>");
	}
%>
<h2></h2>
<%
	for(int i=1;i<=9;i++){
%>	
    <div>  <%=3*i %></div>

<%} %>
</body>
</html>