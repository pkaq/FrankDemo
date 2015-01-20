<html>
<head>
<title>jspCookie.jsp</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();//服务器从用户硬盘上获取cookie
		for (int i = 0; i < cookies.length; i++) {
	%>
	<p>
		<b>Cookie name:</b>
		<%=cookies[i].getName()%>

		<b>Cookie value:</b>
		<%=cookies[i].getValue()%>
	</p>
	<p>
		<b>Old max age in seconds:</b>
		<%=cookies[i].getMaxAge()%>
		<%
			cookies[i].setMaxAge(60);
		%>
		<b>New max age in seconds:</b>
		<%=cookies[i].getMaxAge()%>
	</p>
	<%
		}
	%>
	
	<%!int count1 = 0,count2 = 0;%>
	<%
		response.addCookie(new Cookie("cookieName" + count1++,"cookieValue" + ++count2));
	%>
	

</body>
</html>