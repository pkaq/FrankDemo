<%@ page contentType="text/html; charset=gb2312" %>

<%

String name = request.getParameter("name");

out.println("Name:"+name);

System.out.println("Name:"+name);
%>
=======��¼�ɹ�======
<br>
��ӭ�㣬
<%=request.getParameter("name")%>
