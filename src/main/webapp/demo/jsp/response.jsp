<%@ page import="java.util.Date" contentType="text/html; charset=gb2312" %>
<html>
<head>
<%
response.setHeader("refresh","1");
%>
<title>定时刷新页面</title>
</head>
<body>
<br>

<b>当前时间为：</b>
<br>
<%= new Date()%>
</body>
</html>
