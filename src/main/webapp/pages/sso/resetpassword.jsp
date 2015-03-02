<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <title>密码重置 </title>
</head>
<body>
<!-- main content -->
<div id="slider"  class="container" >
	<!-- 密码找回表单开始 -->
  <form class="form-horizontal formct" >
    <fieldset>
     <div id="legend">
       <legend>密码重置</legend>
     </div>
	  <div class="form-group">
	    <label for="password" class="col-sm-2 control-label">密码</label>
	    <div class="col-sm-10">
	      <input type="password" class="form-control" id="password" placeholder="密码">
	    </div>
	 </div>
	  <div class="form-group">
	    <label for="repassword" class="col-sm-2 control-label">密码确认</label>
	    <div class="col-sm-10">
	      <input type="password" class="form-control" id="repassword" placeholder="密码确认">
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
