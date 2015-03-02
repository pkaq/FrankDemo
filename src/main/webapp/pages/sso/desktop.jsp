<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>平台统一认证登陆系统</title>
    <!-- Bootstrap -->
    <link href="<c:url value="/resources/common/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/common/css/style-metro.css"/>" rel="stylesheet" type="text/css" />
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="<c:url value="/resources/common/js/ltie/html5shiv.min.js"/>"></script>
      <script src="<c:url value="/resources/common/js/ltie/respond.min.js"/>"></script>
    <![endif]-->
    <link rel="stylesheet" href="<c:url value="/resources/common/css/font-awesome.min.css"/>">
    <!--[if IE 7]>
	<link rel="stylesheet" href="<c:url value="/resources/common/js/css/ltie/font-awesome-ie7.min.css"/>">
	<![endif]-->
	 <link rel="stylesheet" href="<c:url value="/resources/common/css/unslider/style.css"/>">
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
  			<div class="col-md-4">
				<div class="row top-right">
				  	<!-- 右上登录人信息 -->
				  	<div class="col-md-12 text-center height-fit">
				  		<p class="text-center">
				  		当前登陆人:Admin  |  个人信息   |   在线人数(xxx)  |  2015-02-11 12:00:01  | 退出登陆
				  		</p>
				  	</div>
				  	<!-- 右下导航信息开始 -->
					<div class="col-md-12 text-right height-fit">
					  <ul class="nav nav-tabs nav-menus nav-tabs-border">
						  <li role="presentation" class="active nav-menus-active"><a href="#">首页</a></li>
						  <li role="presentation"><a href="#">基础管理</a></li>
						  <li role="presentation"><a href="#">关于</a></li>
					   </ul>
					</div>
					<!-- 右下导航信息结束 -->
			</div>
			<!-- END-顶部右侧信息 -->
  		</div>
	</div>
	</div>
</nav>
<!-- main content -->
<div id="slider"  class="container-fluid slidect" >
    <ul class="slider">
    	<!-- 每个li元素为一页 -->
        <li>
			<!-- 
				这里应该放置一个栅格 用以放置各单点系统的链接
				初期可以采用直接写死到页面的方式,固定栅格行列, 初期定义栅格为2行*4
				第二阶段提供设置功能设置栅格系统的行列并可以拖拽内容图标进行排列,并且实现内容从数据库读取
			 -->
			 
			 <div id="desktop_ctr" class="container desktop_ctr" style="height: 100%;">
			 <!-- 栅格开始 -->
			 <!-- 第一行 -->
			 <div class="row desktop_row">
			 	<div class="col-sm-6 col-md-4 col-lg-3">
			 		<!-- 链接开始 -->
	 		     	<div class="thumbnail bg_color_none">
	 		     		<!-- 链接LOGO -->
			            <a href="#" title="站点标题" target="_blank" >
			            	<img class="lazy" src="<c:url value="/resources/sso/images/siteguide.jpg"/>" width="200" height="150" data-src="<c:url value="/resources/sso/images/siteguide.jpg"/>">
			            </a>
			            <!-- 链接标题描述开始 -->
			            <div class="caption bg_color_white">
				              <!-- 链接标题 -->
				              <h3> 
				                <a href="#" title="站点标题" target="_blank" >站点标题</a>
				              </h3>
				              <!-- 链接描述 -->
				              <p>
				              	站点描述
				              </p>
		           		 </div>
		           		 <!-- 链接标题描述结束-->
			 		</div>
			 		<!-- 链接结束 -->
			 	</div>
			 	<div class="col-sm-6 col-md-4 col-lg-3">
					<!-- 链接开始 -->
	 		     	<div class="thumbnail bg_color_none">
	 		     		<!-- 链接LOGO -->
			            <a href="#" title="站点标题" target="_blank" >
			            	<img class="lazy" src="<c:url value="/resources/sso/images/siteguide.jpg"/>" width="200" height="150" data-src="<c:url value="/resources/sso/images/siteguide.jpg"/>">
			            </a>
			            <!-- 链接标题描述开始 -->
			            <div class="caption bg_color_white">
				              <!-- 链接标题 -->
				              <h3> 
				                <a href="#" title="站点标题" target="_blank" >站点标题</a>
				              </h3>
				              <!-- 链接描述 -->
				              <p>
				              	站点描述
				              </p>
		           		 </div>
		           		 <!-- 链接标题描述结束-->
			 		</div>
			 		<!-- 链接结束 -->
				</div>
			 	<div class="col-sm-6 col-md-4 col-lg-3">
					<!-- 链接开始 -->
	 		     	<div class="thumbnail bg_color_none">
	 		     		<!-- 链接LOGO -->
			            <a href="#" title="站点标题" target="_blank" >
			            	<img class="lazy" src="<c:url value="/resources/sso/images/siteguide.jpg"/>" width="200" height="150" data-src="<c:url value="/resources/sso/images/siteguide.jpg"/>">
			            </a>
			            <!-- 链接标题描述开始 -->
			            <div class="caption bg_color_white">
				              <!-- 链接标题 -->
				              <h3> 
				                <a href="#" title="站点标题" target="_blank" >站点标题</a>
				              </h3>
				              <!-- 链接描述 -->
				              <p>
				              	站点描述
				              </p>
		           		 </div>
		           		 <!-- 链接标题描述结束-->
			 		</div>
			 		<!-- 链接结束 -->
				</div>
			 	<div class="col-sm-6 col-md-4 col-lg-3">
					<!-- 链接开始 -->
	 		     	<div class="thumbnail bg_color_none">
	 		     		<!-- 链接LOGO -->
			            <a href="#" title="站点标题" target="_blank" >
			            	<img class="lazy" src="<c:url value="/resources/sso/images/siteguide.jpg"/>" width="200" height="150" data-src="<c:url value="/resources/sso/images/siteguide.jpg"/>">
			            </a>
			            <!-- 链接标题描述开始 -->
			            <div class="caption bg_color_white">
				              <!-- 链接标题 -->
				              <h3> 
				                <a href="#" title="站点标题" target="_blank" >站点标题</a>
				              </h3>
				              <!-- 链接描述 -->
				              <p>
				              	站点描述
				              </p>
		           		 </div>
		           		 <!-- 链接标题描述结束-->
			 		</div>
			 		<!-- 链接结束 -->
				</div>
			 </div>
			 <!-- 第二行 -->
			  <div class="row desktop_row">
			 	<div class="col-sm-6 col-md-4 col-lg-3">
			 		<!-- 链接开始 -->
	 		     	<div class="thumbnail bg_color_none">
	 		     		<!-- 链接LOGO -->
			            <a href="#" title="站点标题" target="_blank" >
			            	<img class="lazy" src="<c:url value="/resources/sso/images/siteguide.jpg"/>" width="200" height="150" data-src="<c:url value="/resources/sso/images/siteguide.jpg"/>">
			            </a>
			            <!-- 链接标题描述开始 -->
			            <div class="caption bg_color_white">
				              <!-- 链接标题 -->
				              <h3> 
				                <a href="#" title="站点标题" target="_blank" >站点标题</a>
				              </h3>
				              <!-- 链接描述 -->
				              <p>
				              	站点描述
				              </p>
		           		 </div>
		           		 <!-- 链接标题描述结束-->
			 		</div>
			 		<!-- 链接结束 -->
			 	</div>
			 	<div class="col-sm-6 col-md-4 col-lg-3">
					<!-- 链接开始 -->
	 		     	<div class="thumbnail bg_color_none">
	 		     		<!-- 链接LOGO -->
			            <a href="#" title="站点标题" target="_blank" >
			            	<img class="lazy" src="<c:url value="/resources/sso/images/siteguide.jpg"/>" width="200" height="150" data-src="<c:url value="/resources/sso/images/siteguide.jpg"/>">
			            </a>
			            <!-- 链接标题描述开始 -->
			            <div class="caption bg_color_white">
				              <!-- 链接标题 -->
				              <h3> 
				                <a href="#" title="站点标题" target="_blank" >站点标题</a>
				              </h3>
				              <!-- 链接描述 -->
				              <p>
				              	站点描述
				              </p>
		           		 </div>
		           		 <!-- 链接标题描述结束-->
			 		</div>
			 		<!-- 链接结束 -->
				</div>
			 	<div class="col-sm-6 col-md-4 col-lg-3">
					<!-- 链接开始 -->
	 		     	<div class="thumbnail bg_color_none">
	 		     		<!-- 链接LOGO -->
			            <a href="#" title="站点标题" target="_blank" >
			            	<img class="lazy" src="<c:url value="/resources/sso/images/siteguide.jpg"/>" width="200" height="150" data-src="<c:url value="/resources/sso/images/siteguide.jpg"/>">
			            </a>
			            <!-- 链接标题描述开始 -->
			            <div class="caption bg_color_white">
				              <!-- 链接标题 -->
				              <h3> 
				                <a href="#" title="站点标题" target="_blank" >站点标题</a>
				              </h3>
				              <!-- 链接描述 -->
				              <p>
				              	站点描述
				              </p>
		           		 </div>
		           		 <!-- 链接标题描述结束-->
			 		</div>
			 		<!-- 链接结束 -->
				</div>
			 	<div class="col-sm-6 col-md-4 col-lg-3">
					<!-- 链接开始 -->
	 		     	<div class="thumbnail bg_color_none">
	 		     		<!-- 链接LOGO -->
			            <a href="#" title="站点标题" target="_blank">
			            	<img class="lazy" src="<c:url value="/resources/sso/images/siteguide.jpg"/>" width="200" height="150" data-src="<c:url value="/resources/sso/images/siteguide.jpg"/>">
			            </a>
			            <!-- 链接标题描述开始 -->
			            <div class="caption bg_color_white">
				              <!-- 链接标题 -->
				              <h3> 
				                <a href="#" title="站点标题" target="_blank" >站点标题</a>
				              </h3>
				              <!-- 链接描述 -->
				              <p>
				              	站点描述
				              </p>
		           		 </div>
		           		 <!-- 链接标题描述结束-->
			 		</div>
			 		<!-- 链接结束 -->
				</div>
			 </div>
			 <!-- 栅格结束 -->
			 </div>
		</li>
        <li>This is another slide.</li>
    </ul>
</div>
<!-- 底部菜单 --> 
<nav class="navbar navbar-default navbar-fixed-bottom text-center nav_footer" >
    	Copyright &copy; 2015 Powered by BootStrap - WuF
</nav>
<!-- jquery -->
<script type="text/javascript" src="<c:url value="/resources/common/js/jquery-1.10.1.min.js"/>" ></script>
<!-- bootstrap -->
<script type="text/javascript" src="<c:url value="/resources/common/js/bootstrap.min.js"/>"></script>
<!-- unslider -->
<script type="text/javascript" src="<c:url value="/resources/common/js/unslider.min.js"/>"></script>
<script type="text/javascript">
	$(function() {
		//绘制高度
		//主显区域高度
		var body_height = $(window).height();
		//主显区域栅格高度
		var deskct_height = $("#desktop_ctr").height();
		//如果主显区域栅格高度大于主显区域,则隐藏链接说明
		if(deskct_height > body_height){
			$("p").hide();
			//如果还是高 隐藏标题
			deskct_height = $("#desktop_ctr").height();
			if(deskct_height > body_height){
				$(".caption.bg_color_white").hide();
			}
		}
		//取出的高度减去页底和页顶高度,不知为何缺少部分高度 追加30px的偏移
		var slide_height = body_height-80*2+20;
		 $("#slider").css("height",slide_height);

		//设置滑动
	    $('#slider').unslider({
    		speed: 500,               //  The speed to animate each slide (in milliseconds)
    		delay: 999999999,              //  The delay between slide animations (in milliseconds)
    		keys: true,               //  Enable keyboard (left, right) arrow shortcuts
    		fluid: true,              //  Support responsive design. May break non-responsive designs		
    		dots : true
	    });
	});
</script>
</body>
</html>
