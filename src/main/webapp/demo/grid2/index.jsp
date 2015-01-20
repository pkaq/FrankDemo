<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../ExtJS/resources/css/ext-all.css" />
 	<script type="text/javascript" src="../ExtJS/adapter/ext/ext-base.js"></script>
	<script type="text/javascript" src="../ExtJS/ext-all.js"></script>
	<script type="text/javascript" src="../js/TestGridPanel.js"></script>
<title>json</title>
</head>

<body>
<script type="text/javascript">

Ext.onReady(function(){
	
    Ext.QuickTips.init();
    
	var TestTabPanel = new Ext.TabPanel({
		el : 'testTab',//此处el指向div id 必须唯一
        id : 'testTab_id',
        border : true,
        height : 600,//设置panel的高度，使其完全填充页面，GridPanel中也要进行设置
        activeTab : 0,
	    frame : false,
	    enableTabScroll : true
	});
	
	var testGridPanel = new TestGridPanel({
		beginDate : '2011-12-12',
		superTabPanel : TestTabPanel
	});
	
	TestTabPanel.add(testGridPanel);
	//TestTabPanel.add(new Ext.Panel({title:'标题'}));
	TestTabPanel.render();
	testGridPanel.doLayout();
});

</script>

	<div id="testTab"></div>
</body>
</html>