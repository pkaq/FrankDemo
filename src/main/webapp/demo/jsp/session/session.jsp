<%@ page contentType="text/html;charset=UTF-8" %>
<%
request.setAttribute("A", "TOM");
session.setAttribute("test","a test value in session");

response.sendRedirect("session2.jsp");
%>
