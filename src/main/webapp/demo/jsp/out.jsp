<%@ page contentType="text/html; charset=gb2312"  %>
<%
response.setContentType("text/html");
out.println("ѧϰʹ��out����<br><hr>");
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
