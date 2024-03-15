<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bakery Fondant</title>
    <link rel="stylesheet" href="/main/css/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script><!--jquery 라이브러리-->
      <script src="/main/script/main.js"></script>
      <script src="/main/script/jquery.cycle2.js"></script>
</head>
<body>
    <div class="div_main">
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
                                <li><a href="/main/board">게시판</a></li>
                            </ul>
                        </li>
                    </ul>
                </nav>
        </header>
        <div class="cycle-slideshow">
            <img src="/main/imgs/IMG_3037.jpg">
                <img src="/main/imgs/IMG_3030.jpg">
                <img src="/main/imgs/IMG_2980.jpg">
        </div>
        <div class="section">
            <nav class="main1">
                <img src="/main/imgs/IMG_2969.jpg">
                <img src="/main/imgs/IMG_3248.jpg">
                <img src="/main/imgs/IMG_3041.jpg">
                <img src="/main/imgs/IMG_3982.jpg">
                <img src="/main/imgs/IMG_4121.jpg">
            </nav>
            <nav class="main1">
                <img src="/main/imgs/IMG_2793.jpg">
                <img src="/main/imgs/IMG_3760.jpg">
                <img src="/main/imgs/IMG_3944.jpg">
                <img src="/main/imgs/IMG_4094.jpg">
                <img src="/main/imgs/IMG_4150.jpg">
            </nav>
        </div>
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