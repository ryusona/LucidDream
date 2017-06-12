<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오전 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <div class="header clearfix">
        <nav>
            <ul class="nav nav-pills pull-right">
                <li role="presentation" class="active"><a href="#">Home</a></li>
                <li role="presentation"><a href="#">About</a></li>
                <li role="presentation"><a href="#">Contact</a></li>
            </ul>
        </nav>
        <h3 class="text-muted">글쓰기 화면입니다.</h3>
    </div>

    <div class="jumbotron">
        <form action="/amigo/regist/" method="post">
            <div class="input-group input-group-lg" >
                <span class="input-group-addon">친구 이름</span>
                <input type="text" name="amigoName" class="form-control" placeholder="친구 이름">
            </div>
            <div class="input-group input-group-lg">
                <span class="input-group-addon">핸드폰</span>
                <input type="text" name="amigoPhone" class="form-control" placeholder="핸드폰">
            </div>
            <div class="input-group input-group-lg">
                <span class="input-group-addon">이메일</span>
                <input type="text" name="amigoEmail" class="form-control" placeholder="이메일">
            </div>


            <p><input type="submit" value="친구등록" class="btn btn-lg btn-success"></input></p>
        </form>
    </div>

</div> <!-- /container -->

</body>
</html>
