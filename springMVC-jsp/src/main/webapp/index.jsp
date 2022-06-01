<%--
  Created by IntelliJ IDEA.
  User: 樱花不及阿晓
  Date: 2022/5/24
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>首页</h1>
<%--jsp里面会自动更新，thymeleaf不会--%>
<a href="${pageContext.request.contextPath}/success">访问success.jsp</a>
</body>
</html>
