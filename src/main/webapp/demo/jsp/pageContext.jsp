<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ page language="java" contentType="text/html; charset=gb2312"%> 

<%
ServletRequest req=pageContext.getRequest();
String test=req.getParameter("test");
out.println("test="+test);
pageContext.setAttribute("aaa",test);
out.println("get:"+pageContext.getAttribute("aaa"));
out.println("find:"+pageContext.findAttribute("aaa"));
pageContext.removeAttribute("aaa");
out.println("get2:"+pageContext.getAttribute("aaa"));
out.println("find2:"+pageContext.findAttribute("aaa"));

%>
