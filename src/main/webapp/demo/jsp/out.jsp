<%@ page contentType="text/html; charset=gb2312"  %>
<%
response.setContentType("text/html");
out.println("学习使用out对象：<br><hr>");
out.println("<br>out.println(boolean):");
out.println(true);
out.newLine();
out.println("<br>out.getBufferSize():");
out.println(out.getBufferSize());
out.println("<br>out.getRemaining():");
out.println(out.getRemaining());
out.println("<br>out.isAutoFlush():");
out.println(out.isAutoFlush());
%>
