<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="uploadImg.html" method="post" enctype="multipart/form-data">
        用户名: <input type="text" name="uname" /> <br/>
        文件: <input type="file" name="imgFile" /> <br/>
        <input type="submit" value="上传" />
    </form>
</body>
</html>
