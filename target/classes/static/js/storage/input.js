$(document).ready(function(){
	$("#myButton").upload({
		action:'/storageFile',
		name:'myFile',
		onComplete: function(){
			$("#content").load("/storage");
		}
	});
	$("#output").click(function(){
		$("#content").load("/download");
	});
	
	$.get("/showStorage",function(aa){
		var a=JSON.parse(aa);
		var b=[];
		for(var i=0;i<a.length;i++){
	        	b.push(a[i]['name']);
	 		}
		 myChart.setOption({ //加载数据图表  
             legend: {  
                   data: b
                  },  
           series: {  
                   // 根据名字对应到相应的系列  
                   data: a 
                   }      
});  
		 chart.setOption({ //加载数据图表  
			 xAxis: {
				 data:b
			    }, 
           series: {  
                   // 根据名字对应到相应的系列  
                   data: a
                   }      
});  
	});
});