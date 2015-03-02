<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="zh-cn">
<head>
	<title>
		<sitemesh:write property='title' /> - CAS 统一认证平台
	</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <!-- Bootstrap -->
    <link href="<c:url value="/resources/common/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/common/css/style-metro.css"/>" rel="stylesheet" type="text/css" />
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="<c:url value="/resources/common/js/ltie/html5shiv.min.js"/>"></script>
      <script src="<c:url value="/resources/common/js/ltie/respond.min.js"/>"></script>
    <![endif]-->
    <!--[if IE 7]>
	<link rel="stylesheet" href="<c:url value="/resources/common/js/css/ltie/font-awesome-ie7.min.css"/>">
	<![endif]-->
	<sitemesh:write property='head' />
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top nav_header">
		<div class="container-fluid">
			<div class="row">
				<!-- 顶部左侧LOGO -->
	  			<div class="col-md-8 height-fit">
	 				<img src="<c:url value="/resources/sso/images/inner_logo.png"/>" class="img-responsive" alt="Responsive image">
	  			</div>
	  			<!-- 顶部右侧信息 -->
			</div>
		</div>
	</nav>
	 <sitemesh:write property='body'/>
	 <!-- 底部菜单 --> 
	<nav class="navbar navbar-default navbar-fixed-bottom text-center nav_footer" >
	    	Copyright &copy; 2015 Powered by BootStrap - WuF
	</nav>
</body>
</html>