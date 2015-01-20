<%
	String start = (String)request.getParameter("start");
	String limit = (String)request.getParameter("limit");
	try{
		start = start == null?"0":start;
		int index = Integer.parseInt(start);
		int pageSize = Integer.parseInt(limit);
		
		
		String json = "{total:100,root:[";
		for(int i=index;i<pageSize+index;i++){
			json += "{id:'"+i+"',date:'2012-04-11',type:'1',descn:'descn"+i+"'}";
			if(i != pageSize+index-1){
				json += ",";	
			}
		}
		json += "]}";	
		System.out.println(json);
		out.println(json);
	}catch(Exception e){
		e.printStackTrace();
	}
%>
