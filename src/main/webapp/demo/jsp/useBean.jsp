<%@ page contentType="text/html; charset=gb2312" %>
<jsp:useBean id="myBean" scope="page" class="demo.frank.wu.pack.MyBean" > 
	<jsp:setProperty name="myBean" property="price" value="9600.0f"/> 
	<jsp:setProperty name="myBean" property="computerName" value="T420S"/> 
</jsp:useBean>

computer������:
<jsp:getProperty name="myBean" property="computerName"/>
<br>
computer�ļ۸�<jsp:getProperty name="myBean" property="price"/>
