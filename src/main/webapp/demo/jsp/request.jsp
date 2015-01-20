<%@ page import="java.io.*"%>
request Object examples:
<hr>  
<%
out.println("<br> getMethod:");
out.println(request.getMethod()); 
out.println("<br>getParameter:");
out.println(request.getParameter("name"));
out.println("<br>getLocale:");
out.println(request.getLocale());
out.println("<br>getProtocol:");
out.println(request.getProtocol());
out.println("<br>getRemoteAddr:");
out.println(request.getRemoteAddr());
out.println("<br>getRemoteHost:");
out.println(request.getRemoteHost());
out.println("<br>getRemoteUser:");
out.println(request.getRemoteUser());
out.println("<br>getServerName:");
out.println(request.getServerName());
out.println("<br>getServerPort:");
out.println(request.getServerPort());
%>
