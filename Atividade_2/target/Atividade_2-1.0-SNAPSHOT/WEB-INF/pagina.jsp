<%--
  Created by IntelliJ IDEA.
  User: lab
  Date: 17/04/2023
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Boolean isLoggedin = (Boolean) session.getAttribute("is_logged_in");
    if( isLoggedin == null || isLoggedin == false) {
        response.sendRedirect("http://localhost:8080/login/index.jsp");
    }

%>


<html>
<head>
</head>
<body>
<h1> Bem Vindo <% session.getAttribute("user"); %> </h1>

<a> href="ttp://localhost:8080/login/login""> </a>
</body>
</html>
