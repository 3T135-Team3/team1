<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fm:form action="saveUser.html" method="post"  commandName="user" >
    <fm:errors path="uid" /><br/>
    <fm:errors path="uname" /><br/>
    ID:<fm:input path="uid" /><br/>
    用户名 :<fm:input path="uname" /><br/>
    <input type="submit" value="注册" />
</fm:form>
</body>
</html>
