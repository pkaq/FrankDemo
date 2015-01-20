
<%
	String start = request.getParameter("start");
	String limit = request.getParameter("limit");
	try{
		int index = Integer.parseInt(start);
		int pageSize = Integer.parseInt(limit);
		
		String json = "{totalProperty:100,root:[";
		for(int i=index;i<pageSize+index;i++){
			json+= "{id:'"+i+"',name:'name"+i+"',descn:'descn"+i+"'}";
			if(i != pageSize+index-1){
				json += ",";	
			}
		}
		json += "]}";	
		System.out.println(json);
		response.getWriter().write(json);
		
	}catch(Exception e){
		
	}


%>
