<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<%@ page info="a JSP example"%>

<html>
<%-- JSP的注释 --%>
<!-- HTML/XML 的注释 -->

<!-- 
	1.常用字符编码:ISO-8859-1/GB2312/GBK/UTF-8

	2.JAVA代码块的写法	
	
	3.变量引用写法
	
	4.JSP内置对象 request/response/session/out/page/application/exception/pageContext/config
	request客户端的请求信息被封装在request对象中，通过它才能了解到客户的需求，然后做出响应。它是HttpServletRequest类的实例。 
	response对象包含了响应客户请求的有关信息，但在JSP中很少直接用到它。它是HttpServletResponse类的实例。 
	session对象指的是客户端与服务器的一次会话，从客户端连到服务器的一个WebApplication开始，直到客户端与服务器断开连接为止。它是HttpSession类的实例. 
　	out对象是JspWriter类的实例,是向客户端输出内容常用的对象 
	page对象就是指向当前JSP页面本身，有点象类中的this指针，它是java.lang.Object类的实例 
	application对象实现了用户间数据的共享，可存放全局变量。它开始于服务器的启动，直到服务器的关闭，在此期间，此对象将一直存在；这样在用户的前后连接或不同用户之间的连接中，可以对此对象的同一属性进行操作；在任何地方对此对象属性的操作，都将影响到其他用户对此的访问。服务器的启动和关闭决定了application对象的生命。它是ServletContext类的实例。 
	exception对象是一个例外对象，当一个页面在运行过程中发生了例外，就产生这个对象。如果一个JSP页面要应用此对象，就必须把isErrorPage设为true，否则无法编译。他实际上是java.lang.Throwable的对象
	pageContext对象提供了对JSP页面内所有的对象及命名空间的访问，也就是说他可以访问到本页所在的SESSION，也可以取本页面所在的application的某一属性值，他相当于页面中所有功能的集大成者，它的本类名也叫pageContext。 
	config对象是在一个Servlet初始化时，JSP引擎向它传递信息用的，此信息包括Servlet初始化时所要用到的参数（通过属性名和属性值构成）以及服务器的有关信息（通过传递一个ServletContext对象） 
	
	5.JSP作用范围
 -->
<head>
<title>第一个JSP</title>
</head>
<body>
	<div align="center">
		<!-- 表达式引用 -->
		<h3><%=hw%></h3>
		<%
			out.print("a");
			out.print("b");

			out.println("1");
			out.println("2");
		%>
		<table border=1>
			<tr bgcolor="cccccc">
				<td>时间</td>
				<td>id</td>
			</tr>
			<%
				int i;
				String color1 = "#cc99cc";
				String color2 = "#88cc33";
				for (i = 1; i <= 10; i++) {
					String color = "";
					if (i % 2 == 0)
						color = color1;
					else
						color = color2;
					
					out.println("<tr bgcolor=" + color + ">");
					out.println("<td>" + new java.util.Date().toLocaleString() + "</td>");
					out.println("<td>" + i + "</td>");
					out.println("</tr>");
				}
			%>
		</table>
	</div>
	<!-- 声明变量 -->
	<%!String hw = "Hello World...";%>

</body>
</html>

