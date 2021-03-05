<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/3
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title:退出系统</title>
</head>
<body>
    模拟退出系统
    <%
        session.removeAttribute("name");
    %>
</body>
</html>
