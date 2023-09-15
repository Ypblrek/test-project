<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 26.05.2023
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
   long summa(int a, int b){
       return a+b;
   }
%>
<html>
<head>
    <title>My JSP</title>
</head>
<body>
<h1>Привет ${name}</h1>
<%new Date();%>
<%=new Date()%>
<!--есть скрытые обьекты request,response-->
<%=request.getParameter("name")%>
<h1>summa 5+2 = <%=summa(5,2)%></h1>
</body>
</html>
