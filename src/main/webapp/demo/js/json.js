Ext.onReady(function() {
	Ext.QuickTips.init();
	var store = new Ext.data.Store({
		proxy : new Ext.data.HttpProxy({
			url : 'testJson.jsp'
		}),
		reader : new Ext.data.JsonReader({
			totalProperty : 'totalProperty',
			root : 'root'
		}, [ {
			name : 'id'
		}, {
			name : 'name'
		}, {
			name : 'descn'
		}, ])
	});

	//column 2
	var combo = new Ext.form.ComboBox({
	    typeAhead: true,
	    triggerAction: 'all',
	    lazyRender:true,
	    mode: 'local',
	    valueField: 'myId',
	    displayField: 'displayText',
	    tpl: '<tpl for=".">'+
	    		'<div x-combo-list-item :qtip="{icon}" class="x-combo-list-item">'+
					'<img src="{icon}" width="16" height="16">&nbsp;{displayText}'+
				'</div>'+				
			  '</tpl>',
	    store: new Ext.data.ArrayStore({
	        id: 0,
	        fields: [
	            'myId',
	            'displayText',
	            'icon'
	        ],
	        data: [[1, 'item1'], [2, 'item2'],['add','create new +','../images/icons/create.png']]
	    }),
	    listeners : {
	    	'render' : function(tc){
	    		console.info(tc);
	    	},
	    	'select' : function(a,b){
	    		console.info(b);
	    		
	    	},
	    	'change' :function(com, newValue, oldValue ){
	    		console.info(newValue);
	    		if ("add" == newValue) {
	    			var win = new Ext.Window({ 
	    			    layout:'fit', 
	    			    modal : true,
	    			    width:700, 
	    			    height:400, 
	    			    closable:true, 
	    			    closeAction:'close'
    			    }); 
	    			win.doLayout();
	    			
	    			win.show(); 
				}
	    	}
	    }
	   
	});
	   
	var sm = new Ext.grid.CheckboxSelectionModel();
	var cm = new Ext.grid.ColumnModel([{
	  colIndex: 0,
	  field: {
	    xtype: 'textfield',
	    id: 'brno',
	    name: 'brno',
	    fieldLabel: '使用分行',
	    allowBlank: false,
	    blankText: '不能为空',
	    maxLength: 60,
	    maxLengthText: '长度不能大于60位',
	    regex: /^[0-9]*$/,
	    regexText: '只能输入数字'
    }},{
		header : '编号',
		dataIndex : 'id',
		editor :combo
	}, {
		header : '姓名',
		dataIndex : 'name'
	}, {
		header : '描述',
		dataIndex : 'descn'
	} ]);

	var grid = new Ext.grid.EditorGridPanel({
		el : 'grid',
		store : store,
		cm : cm,
		sm : sm,
		autoHeight : true,
		bbar : new Ext.PagingToolbar({
			store : store,
			pageSize : 10,
			displayInfo : true,
			displayMsg : 'display{0}to{1}record,total{2}records',
			emptyInfo : 'no Records'
		}),
		viewConfig : {
			forceFit : true
		}
	});
	grid.render();
	store.load({
		params : {
			start : 0,
			limit : 10
		}
	});
});
