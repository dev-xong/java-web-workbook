<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yunaxong
  Date: 2025. 3. 25.
  Time: 오후 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>List Page</h1>

    <c:set var="target" value="5"></c:set>
    <ul>
        <c:forEach var="num" begin="1" end="10">
            <c:if test="${num == target}">
                num is target
            </c:if>
        </c:forEach>
    </ul>
</body>
</html>
