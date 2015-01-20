<%@ page errorPage="error.jsp"%>
<%
	try {
		Integer.parseInt("7.0f");
	} catch (Exception e) {
		out.println(e);
	}
%>

