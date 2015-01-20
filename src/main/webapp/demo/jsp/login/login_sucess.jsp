<%@ page contentType="text/html; charset=gb2312" %>

<%

String name = request.getParameter("name");

out.println("Name:"+name);

System.out.println("Name:"+name);
%>
=======µÇÂ¼³É¹¦======
<br>
»¶Ó­Äã£¬
<%=request.getParameter("name")%>
