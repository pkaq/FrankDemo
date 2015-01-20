<%@ page contentType="text/html; charset=gb2312" language="java" isErrorPage="true" %>
<html>
<head>
<title>出错了！</title>
</head>
<body>
发生了以下的错误或者异常，请返回重新试一遍，如果错误一样存在，请报告<a href="mailto:webmaster@mycompany.com">管理员</a>。谢谢。
<br><hr><font color=red>
<%=exception.getMessage()%>
</font>
</body>
</html>
