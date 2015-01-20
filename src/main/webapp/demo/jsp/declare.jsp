<%@ page language="java" contentType="text/html; charset=gb2312"%>

<%
	String source = "I am Chinese!";
	for (int i = 0; i < counter; i++) {
		out.println(toUpperCase(source));
		out.println("<br>");
	}
%>

<%!String toUpperCase(String source) {
		return source.toUpperCase();
	}%>
<%!int counter = 5;%>

