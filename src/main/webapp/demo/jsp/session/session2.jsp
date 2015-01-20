<%@ page contentType="text/html;charset=UTF-8" %>

<%
out.println("REQUEST VALUE"+request.getAttribute("A"));
out.println();
out.println("SESSION VALUE :"+session.getAttribute("test"));
session.removeAttribute("test");
out.println("--->SESSION VALUE :"+session.getAttribute("test"));
%>

