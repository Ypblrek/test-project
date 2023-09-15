<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 30.05.2023
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Egor</title>
</head>
<body>
Hello ${name}
<c:if test="${arrayUser != null}">
    <c:out value="arrayUser is not null"/>
</c:if>
<c:forEach var="user" items="${arrayUser}">
    <c:out value="${user}"/>
</c:forEach>

</body>
</html>
