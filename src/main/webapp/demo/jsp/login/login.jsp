<%@ page contentType="text/html; charset=gb2312" %>
<html>
<body>
<%--进行登陆检查--%>
<%
   String name=request.getParameter("name");
   String password=request.getParameter("password");
   
   //request response session page application
   //page request session  application
   
   //如果验证通过，转发到login_sucess.jsp
   //如果验证失败，转发到login.html
   
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
