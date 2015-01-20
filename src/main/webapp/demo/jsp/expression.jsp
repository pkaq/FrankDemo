<%@ page contentType="text/html; charset=gb2312"%>
<%!private int test = 10;

	public int getValue() {
		return test;
	}%>
<html>
<body>
	第一个表达式，value的值是<%=test%><br>
	<!-- 注意表达式的使用方法-->
	第二个表达式，value的值是<%=getValue()%><br> 
	第三个表达式，value＋1的值是<%=test + 1%><br>
	第四个表达式，<%="现在的时间是：" + new java.util.Date().toString()%><br>
	第五个表达式，一个String：<%="hello!"%><br>
</body>
</html>

