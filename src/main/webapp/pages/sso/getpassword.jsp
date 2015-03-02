<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
  <title>密码找回</title>
</head>
<body>
<!-- main content -->
<div id="slider"  class="container" >
	<!-- 密码找回表单开始 -->
  <form class="form-horizontal formct" >
    <fieldset>
     <div id="legend">
       <legend>密码找回</legend>
     </div>
     <div class="form-group">
	    <label for="username" class="col-sm-2 control-label">用户名</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" id="username" placeholder="用户名">
	    </div>
	 </div>
	 <div class="form-group">
	    <label for="email" class="col-sm-2 control-label">注册邮箱</label>
	    <div class="col-sm-10">
	      <input type="email" class="form-control" id="email" placeholder="注册邮箱">
	    </div>
	 </div>
	 <div class="form-group">
	    <label for="ask" class="col-sm-2 control-label">密保问题</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" id="ask" placeholder="密保问题">
	    </div>
	 </div>
	 <div class="form-group">
	    <label for="anwser" class="col-sm-2 control-label">密保答案</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" id="anwser" placeholder="密保答案">
	    </div>
	 </div>
	 <div class="form-group">
	    <label for="valid" class="col-sm-2 control-label">验证码</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" id="valid" placeholder="验证码">
	    </div>
	 </div>
    <div class="form-group">
     	<div class="col-sm-12 text-right">
            <button class="btn green">提交</button>
            <button class="btn green">取消</button>
        </div>   
     </div>
    </fieldset>
  </form>
  <!-- 密码找回表单结束 -->
</div>
</body>
</html>
