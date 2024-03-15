<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인창</title>
    <link rel="stylesheet" href="style.css" type="text/css">
    <style>
        body{
            text-align: center;
            background-color: #ffffff;
            /*공통 스타일시트->파일로 불러오기
            2. 특정페이지에서 사용하는 경우->style태그를 사용해서 적용시키기
            */
        }
        table{
            /*
            border:1px solid black; 영역을 잡아줄 테두리를 보여주기 위함
            margin-left:230px;
            */
            margin: 0 auto;
        }
    .div_main{
  background-color: white;
  border:1px solid #aaaaaa; 
	width:1200px; 
	height:592px; 
	margin:0 auto;
}
            .ft1{
  clear: both;
  position: relative;
  width:1200px; 
	height:auto; 
  border:1px solid #aaaaaa; 
  margin: 0 auto;
  right: 1px;
  z-index: 8;
  top: 364px;
}
.nv3 > ul{
  position: relative;
  list-style: none;
  margin: 0 auto;
  top: 20px;
  height: 20px;
  width: 300px;
}
.nv3 > ul >li{
  float: left;
  margin-left: 4.3%;
  font-family: fantasy;
}
.nv3 ul li a{
  text-decoration: none;
}
.nv4 ul{
  position: relative;
  height: 100px;
  top: 50px;
  margin: 0 auto;
}
.nv4 > ul >li{
  position: relative;
  list-style: none;
  float: left;
  width: 20%;
  font-family: fantasy;
  font-size: 10px;
  
}
    </style>
    <script src="script.js">
    </script>
    <!--
        window.onload=function(){
            document.login.mem_id.focus();
        }
    -->
</head>
<body onload="document.login.mem_id.focus()">
<div class="div_main">
    <!--
    디자인=>table+input box(form)
        table>tr*4>td*2
    -->
    <!--<center>-->
     <a href="main.jsp"><img src="/main/imgs/logo.png" width="300px" style="left: 00px;"></a>
        <table><!--form:post-->
            <form name="login" action="LoginProc.jsp" method="post">
            <tr><!--로그인 타이틀명-->
                <td align="center" colspan="2"><h4>로그인</h4></td>
            </tr>
            <tr><!--아이디 input:text
            label 태그를 사용해서 레이블명과 입력박스를 연결시키는 방법
            형식) <label label for="연결시킬 id값">레이블명</label>
            -->
                <td><label for="id">아이디</label></td>
                <td><input type="text" name="mem_id" id="id"></td>
            </tr>
            <tr>
                <td>비밀번호</td><!--비번 input:text-->
                <td><input type="password" name="mem_pwd"></td>
            </tr>
            <tr><!--정가운데 버튼 2개 배치input:button 나머지 td영역까지 포함해서 가운데 배치-->
                <td align="center" colspan="2">
                    <input type="button" value="로그인" onclick="loginCheck()">&nbsp;
                    <input type="button" value="회원가입" onclick="document.location.href='agreement.jsp'">
                </td>
                <!--<td align="center"><input type="button" value="회원가입"></td>-->
            </tr>
            </form>
        </table>

    <!--</center>-->
          <footer class="ft1">
            <nav class="nv3">
                <ul>
                    <li><a href="#">HOME</a></li>
                    <li><a href="|1">|</a></li>
                    <li><a href="">TERMS</a></li>
                    <li><a href="|1">|</a></li>
                    <li><a href="">BAKERY</a></li>
                </ul>
            </nav>
            <nav class="nv4">
                <ul>
                    <li>OWNER: Sweet Devils Baking</li>
                    <li>E-mail:happyhome@sweet.kr</li>
                    <li>TELL:032-345-6789</li>
                    <li>ADDRESS:인천광역시 00구 00동</li>
                    <li>BUSINESS LICENSE:2719619328</li>
                </ul>
            </nav>
        </footer>
        </div>
</body>
</html>