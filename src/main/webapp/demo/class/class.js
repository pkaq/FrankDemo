MyWindow = function(config){
	MyWindow.superclass.constructor.call(this,config);
};

Ext.extend(MyWindow,Ext.Window,{
	s:function(){
		alert('A');
	}
});