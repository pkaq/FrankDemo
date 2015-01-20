<%@ page contentType="text/html; charset=gb2312" %>
<jsp:useBean id="myBean" scope="page" class="demo.frank.wu.pack.MyBean" > 
	<jsp:setProperty name="myBean" property="price" value="9600.0f"/> 
	<jsp:setProperty name="myBean" property="computerName" value="T420S"/> 
</jsp:useBean>

computer的名字:
<jsp:getProperty name="myBean" property="computerName"/>
<br>
computer的价格：<jsp:getProperty name="myBean" property="price"/>
