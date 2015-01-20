AjaxAOEFormpanel = function(config) {
	Ext.apply(this, config);

	var title = new Ext.form.TextArea({
		anchor : '98%',
		fieldLabel : '显示区域',
		name : 'ajax.area'
	});
	
	AjaxAOEFormpanel.superclass.constructor.call(this, {
		title : 'EXT-AJAX', 
		height:300,
		width:600,
		bodyStyle : 'padding:5px 5px 5px 5px',
		renderTo:Ext.getBody(),
		items : [ title ],
		reader : new Ext.data.JsonReader({
			root : "root",
			fields : [ {
				name : "ajax.area",
				mapping : 'response'
			}]
		})
	});
};

Ext.extend(AjaxAOEFormpanel, Ext.form.FormPanel, {
	loadFormData : function(params) {
		this.form.load({
			url : 's.json'
		});
	}
});