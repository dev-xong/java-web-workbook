<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/calc/makeResult" method="post"> <!-- 주소와 전달 데이터를 분리 -->
        <input type="number" name="num1"/>
        <input type="number" name="num2"/>
        <button type="submit">SEND</button> <!-- 전송 -->
    </form>
</body>
</html>