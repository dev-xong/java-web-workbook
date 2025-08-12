<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Todo List</title>
</head>
<body>
    <h1>Todo List</h1>

    <ul>
        <c:forEach items="${dtoList}" var="dto">
            <li>${dto}</li>
        </c:forEach>
    </ul>

    <h2>${loginInfo}</h2>
    <h2>${loginInfo.mname}</h2>

    <form action="${pageContext.request.contextPath}/logout" method="post">
        <button>LOGOUT</button>
    </form>
</body>
</html>
