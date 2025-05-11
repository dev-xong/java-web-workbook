<%--
  Created by IntelliJ IDEA.
  User: yunaxong
  Date: 2025. 3. 25.
  Time: 오후 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>등록화면</title>
</head>
<body>
    <p>Context Path: ${pageContext.request.contextPath}</p>
    <form action="${pageContext.request.contextPath}/todo/register" method="post">
        <button type="submit">등록처리</button>
    </form>
</body>
</html>
