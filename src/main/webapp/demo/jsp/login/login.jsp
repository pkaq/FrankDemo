<%@ page contentType="text/html; charset=gb2312" %>
<html>
<body>
<%--���е�½���--%>
<%
   String name=request.getParameter("name");
   String password=request.getParameter("password");
   
   //request response session page application
   //page request session  application
   
   //�����֤ͨ����ת����login_sucess.jsp
   //�����֤ʧ�ܣ�ת����login.html
   
	if(name.equalsIgnoreCase("test") && password.equals("test")){
	%> 
	<jsp:forward page="login_sucess.jsp">
		<jsp:param name="userName" value="<%=name%>"/>
	</jsp:forward>
	<%
	 }else{
		response.sendRedirect("login_error.jsp");
	 }
	 %>
</body>
</html>
