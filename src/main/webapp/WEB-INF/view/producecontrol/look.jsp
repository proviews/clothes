<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/control.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/dagre/d3.v3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/dagre/w.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/dagre/dagre-d3.min.js"></script>
<div style="float:left;width:300px;height:500px;"><table id="demo" lay-filter="useruv">
</table>
<table class="layui-hide" id="LAY_table_user" lay-filter="useruv"></table>
</div>
<div id="aa" style="margin-left:280px;float:left;width: 100px;height:500px;">
 <svg width=960 height=600><g/></svg>
</div>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="progress">查看进度</a>
</script>
<script type="text/javascript">

layui.use('table', function(){
	  var table = layui.table;
	  table.render({
	    elem: '#demo'
	    ,height: 445
	    ,url: '/showEmployee'
	    ,id: 'testReload'
	    ,page: false //开启分页
	    ,cols: [[ //表头
	      {field: 'employeenumber', title: '员工号', width:80, sort: true, fixed: 'left'}
	      ,{field: 'position', title: '职称', width: 95, sort: true}
	      ,{field:'right', title: '操作', width:120,toolbar:"#barDemo"}
	    ]]
	  });

table.on('tool(useruv)', function(obj){
    var data = obj.data;
    if(obj.event === 'progress'){
    	$.ajax({
            url: "/showProgress",
            type: "POST",
            data:{"employeenumber":data.employeenumber},
            dataType: "json",
            success: function(data){
            		/*  var $node = $(".node:lt("+data+")");
            		$node.each(function(index,rect){
            			$(rect).children("rect").css("fill","red");
            		});  */
            		$(".node rect").css("fill","#999"); 
            		 $(".node:lt("+data+") rect").css("fill","red"); 
                }
            })
    }
});
});
        
</script>