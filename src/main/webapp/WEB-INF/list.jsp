<%--
  Created by IntelliJ IDEA.
  User: ulotrix
  Date: 08.08.2015
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title></title>
</head>
<body>
<ul>

    <c:forEach items="${todos}" var="todo">

    <c:if test="${todo.done}">
        <li>
            <del>${todo.name}</del>
        </li>
    </c:if>

    <form action="list" method="post">
        <c:if test="${!todo.done}">
            <tr><input type="checkbox" name="id" value="${todo.id}">
            <li>${todo.name}</li></tr>
        </c:if>
        </c:forEach>
        <button>Check done</button>
    </form>

</ul>
</body>
</html>
