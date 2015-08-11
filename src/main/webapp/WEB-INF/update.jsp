<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ulotrix
  Date: 09.08.2015
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<form action="update" method="post">
    <input type="hidden" name="id" value="${todo.id}">
    <br>
    <input type="text" name="name" value="${todo.name}">
    <br>
    <input type="text" name="desc" value="${todo.desc}">
    <br>
    <input type="date" name="dueDate" value="${todo.getDate()}"><br>
    <br>
    <label>Is Done?</label>
    <input type="checkbox" name="done" <c:if test="${todo.done}">checked</c:if>>
    <br>
    <button>Update the Todo</button>
</form>

<p>${message}</p>

</body>
</html>
