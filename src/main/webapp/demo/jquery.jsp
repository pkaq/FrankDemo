<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<title>Insert title here</title>

</head>
<body>
	<input type="text" id="test" value="Hello "/>
	<div id="div" style="height: 300px;width: 400px;background: red;" ></div>
</body>

</html>
<script type="text/javascript">
var a = document.getElementById("test").value;
var d = $("#test").val("A");
	console.info(a);
	alert("a");
	$("#div").hide();
	alert("b");
	$("#div").show();
</script>
