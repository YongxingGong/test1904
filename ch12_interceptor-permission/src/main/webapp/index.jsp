<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" +request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title：springmvc 拦截器</title>
    <base href="<%=basePath%>">
</head>
<body>
    <p>无效页面</p>
    <form action="user/interceptor.do" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交表单">
    </form><br/><br/>

</body>
</html>
