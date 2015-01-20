TestGridPanel = function(config) {
	Ext.apply(this, config);
	
	var gridPanelId = Ext.id();
	//获取数据
	var store = new Ext.data.Store({
		proxy : new Ext.data.HttpProxy({
			url : 'json.action',
			//url : 'grid2/json.jsp',
			method : 'post'
		}),
		baseParams : {
			limit : 10
		},
		reader : new Ext.data.JsonReader({
			root : 'root',
			totalProperty : 'total',
			successProperty : 'success'
		}, [ {name : 'id'}, 
		     {name : 'date'}, 
		     {name : 'type'}, 
		     {name : 'desc',mapping:'descn'} 
		])
	});
	//复选框
	var sm = new Ext.grid.CheckboxSelectionModel();
	//列描述
	var cm = new Ext.grid.ColumnModel([
			sm,
			{
				dataIndex : "id",
				sortable : true,
				header : "编号"
			},{
				dataIndex : "date",
				sortable : true,
				header : "操作日期"
			},{
				dataIndex : "type",
				sortable : true,
				header : "类型",
				renderer : function(v) {
					return v == "1" ? "A类型" : "B类型";
				}
			},{
				dataIndex : 'desc',
				sortable : false,
				header : '描述'
			},{
				header : "查看",
				sortable : false,
				resizable : false,
				menuDisabled :true,
				align : "center",
				dataIndex : 'view',
				renderer : function(v, metadata, record, rowindex, colIndex,store) {
					var id = record.get("id");
					var editUrl = "<a href='javascript:view(\"" + id + "\",\""+ gridPanelId + "\")'><center>查看</center></a>";
					return editUrl;
				}
			 }]);
	
	//属性
	var dateBeginLabel = new Ext.form.Label({
		text : '日期:'
	});
	
	var dateBegin = new Ext.form.DateField({
		name : 'dateBegin',
		anchor : '98%',
		format : 'Y-m-d',
		value : this.beginDate
	});

	//构建
	TestGridPanel.superclass.constructor.call(this, {
		id : gridPanelId,
		title : '测试页面',
		autoScroll : true,
		border : true,
		sm : sm,
		cm : cm,
		height:'600',
		store : store,
		loadMask : true,
		viewConfig : {
			forceFit : true
		},
	   tbar : [
	        {text:'新增',handler:this.add},'-',
		    {text:'删除',handler:this.del},'->', 
		    dateBeginLabel, dateBegin, 
		    {text : '查询',handler : this.query}
		    ],
		bbar : new Ext.PagingToolbar({
			store : store,
			pageSize : 10,
			displayInfo : true,
			displayMsg : '显示第 {0} 条到 {1} 条记录，一共 {2} 条',
			emptyMsg : '没有记录'
		})
	});
	store.reload();
};

Ext.extend(TestGridPanel, Ext.grid.GridPanel, {

	query : function() {
		alert("查询");
	},
	add : function() {
		alert("新增");
	},
	del : function() {
		alert("删除");
	}

});
//
function view(id, gridPanelId) {
	alert("查看");
}