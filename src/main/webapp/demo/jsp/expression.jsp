<%@ page contentType="text/html; charset=gb2312"%>
<%!private int test = 10;

	public int getValue() {
		return test;
	}%>
<html>
<body>
	��һ�����ʽ��value��ֵ��<%=test%><br>
	<!-- ע����ʽ��ʹ�÷���-->
	�ڶ������ʽ��value��ֵ��<%=getValue()%><br> 
	���������ʽ��value��1��ֵ��<%=test + 1%><br>
	���ĸ����ʽ��<%="���ڵ�ʱ���ǣ�" + new java.util.Date().toString()%><br>
	��������ʽ��һ��String��<%="hello!"%><br>
</body>
</html>

