<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page info="一个典型的JSP"%>
<!--这是一个典型的JSP，用于演示JSP的语法。-->
<%!
	String getDate() {
		return new java.util.Date().toLocaleString();
	}

	int count = 9;
%>
<html>
<head>
<title>一个典型的JSP-乘法口诀</title>
</head>
<body>
	<!--指令元素-->
	<%@include file="header.jsp" %>
	<div align="center">
		<%-- 下面是scriptlets--%>
		<%
			int i;
			int j = 1;
			for (i = 1; i <= count; i++) {
				out.println("<div align=left>");
				for (int k = 1; k <= j; k++){
					out.println(k +"*"+ j+"="+k*j);
				}
				j++;
				out.println("</div>");
			}
			
		%>
		<hr>
		当前的时间是：
		<%-- 下面是使用表达式的例子--%>
		<%=getDate()%>
		<!-- 动作元素-->
		<jsp:include page="f.jsp" />
	</div>
</body>
</html>
