<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="day6.Book" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
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
<body>

<% Book book = (Book)request.getAttribute("bookInfo"); %>

<div class="wrap">
	<h4>책 정보</h4>
	<div><img src="/day6/imgs/book.jpg"></div>
	<div><%=book.getTitle()%></div>
	<div><%=book.getAuthor()%></div>
	<div><%=book.getPrice()%></div>
</div>
</body>
</html>