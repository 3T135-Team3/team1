<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fm:form method="post" commandName="u" >
错误是: <fm:errors path="uid" />
        <fm:errors path="uname" />
</fm:form>
</body>
</html>
