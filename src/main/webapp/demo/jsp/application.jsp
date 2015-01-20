<%@ page language="java" contentType="text/html; charset=UTF-8"%>
一个简单的计数器页面：
<br>
<%
	int counter = 1;
	int sessionCounter = 1;
	
	try {
		counter = Integer.parseInt((application.getAttribute("Count").toString()));
		sessionCounter = Integer.parseInt((session.getAttribute("Count").toString()));
	} catch (Exception e) {
		out.println(e.getMessage());
	}
	out.println("自从应用服务器启动后，此页面已经访问了" + counter + "次");
	out.println("<hr/>");
	out.println("自从建立会话后，此页面已经访问了" + sessionCounter + "次");
	
	counter++;
	sessionCounter++;
	
	application.setAttribute("Count", counter);
	session.setAttribute("Count", sessionCounter);
%>
