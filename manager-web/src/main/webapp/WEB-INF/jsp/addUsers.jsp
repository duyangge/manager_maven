<%--
  Created by IntelliJ IDEA.
  User: 23801
  Date: 2020/7/8
  Time: 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="/users/addUsers" method="post">
            用户名：<input type="text" name="username"><br>
            年龄:<input type="text" name="userage"><br>
            <input type="submit" value="提交">
        </form>
</body>
</html>
