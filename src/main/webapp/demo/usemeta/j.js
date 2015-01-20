Ext.onReady(function(){
	  	Ext.QuickTips.init();
		var store =  new Ext.data.Store({
			proxy:new Ext.data.HttpProxy({url:'t.json'}),
			reader:new Ext.data.JsonReader()
		});
	  /* var store=new Ext.data.Store({
	  	reader:new Ext.data.JsonReader(
	  	    {
	  	        idProperty: 'id',
	  	        root: 'rows',
	  	        totalProperty: 'results',
	  	        fields: [
	  	            {name: 'name'},
	  	            {name: 'job', mapping: 'occupation'}
	  	        ],
	  	        sortInfo: {field: 'name', direction:'ASC'}, // used by store to set its sortInfo
	  	        results: 2,
		  	    rows: [
		  	        { 'id': 1, 'name': 'Bill', occupation: 'Gardener' },
		  	        { 'id': 2, 'name': 'Ben', occupation: 'Horticulturalist' }
		  	    ]
	  	    }
	  	   
	  	)		
      });*/
		var sm = new Ext.grid.CheckboxSelectionModel();
		var cm = new  Ext.grid.ColumnModel([//渲染Grid所使用的Ext.grid.ColunmModel
			sm,//一个辅助类，用于传到Ext.grid.ColumnModel,作为自动列数字的生成
		{
			header:'NAME',dataIndex:'name'
		},
		{
			header:'JOB',dataIndex:'job'
		}
		]);
		
		var grid = new Ext.grid.GridPanel({//此类是基于Grid控件的一个面板组件，呈现了Grid的主要交互接口
			el:'grid',
			store:store,
			cm:cm,//colModel类的简写形式
			sm:sm,
			autoHeight:true,
		/*	bbar:new Ext.PagingToolbar({//一个要和Ext.data.Store参与绑定，并且自动提供翻页控制的工具栏
				store : store,
				pageSize:10,
				displayInfo:true,
				displayMsg:'display{0}to{1}record,total{2}records',
				emptyInfo:'no Records'
			}),*/
			viewConfig:{   
				forceFit:true
			}
		});
		grid.render();
		store.load({params:{start:0,limit:10}});
	});
	