<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.2.1.js"></script>
<div id="popupFormDiv" style="display:none;"></div>
<div>
<div>
     <a id="add" class="layui-btn layui-btn-mini" lay-event="add">增加生产记录</a>
</div>
<table id="demo" lay-filter="useruv">

</table>
<table class="layui-hide" id="LAY_table_user" lay-filter="useruv"></table>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-mini" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="del">删除</a>
</script>
 <script>
 function createFormat(o){
	  return o;
 }
layui.use('table', function(){
  var table = layui.table;
  table.render({
    elem: '#demo'
    ,height: 445
    ,url: '/produceShow'
    ,id: 'testReload'
    ,page: false //开启分页
    ,cols: [[ //表头
    	{field: 'id', title: 'ID', width:60, sort: true, fixed: 'left'}
        ,{field: 'productnum', title: '产品数量', width:100, sort: true} 
        ,{field: 'inspectiontime', title: '预期时间', width: 120, sort: true}
        ,{field: 'deliverytime', title: '最迟时间', width: 120, sort: true}
        ,{field: 'productquality', title: '产品质量', width: 110, sort: true}
        ,{title: '产品风格', width: 106, templet:'<div>{{createFormat(d.productStyle.stylenames)}}</div>',sort: true}
        ,{title: '产品类型', width: 106, templet:'<div>{{createFormat(d.productType.producttype)}}</div>',sort: true}
        ,{title: '产品状态', width: 106, templet:'<div>{{createFormat(d.productionRecordStatusTable.status)}}</div>',sort: true}
        ,{field: 'responsibleperson', title: '负责人', width: 120}
        ,{field:'right', title: '操作', width:177,toolbar:"#barDemo"}
      ]]
  });
  //监听添加按钮
  $("#add").on('click',function(){
	  layer.open({
          type: 2
          ,shadeClose: true
          ,shade: false
          ,maxmin: true
          ,title: '添加供应商'
          ,area: ['480px', '525px'] //宽高
          ,content: '/showAdd'
          ,end: function(){  
              // 如果是通过单击关闭按钮关闭弹出层，父画面没有此表单  
              if($("#popupForm").length === 1){  
                  $.post("${pageContext.request.contextPath }/addProvider",$("#popupForm").serialize(),function(data){
                  	if(data.state==200){
                	  layer.msg("添加成功!", {icon: 6});
                  	table.reload('testReload');
                  	}else{
                        layer.msg("删除失败", {icon: 5});
                    } 
                  });  
              }  
          }
      })
  });
  
  //分页
  layui.use('laypage', function(){
  var laypage = layui.laypage;
laypage.render({
  elem: '#demo'
  ,jump: function(obj, first){
    //obj包含了当前分页的所有参数，比如：
    console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
    console.log(obj.limit); //得到每页显示的条数
    //首次不执行
    if(!first){
      //do something
      
    }
  }
});
});
  
  
  
 //监听工具条
  table.on('tool(useruv)', function(obj){
    var data = obj.data;
   if(obj.event === 'del'){
        layer.confirm('真的删除行么', function(index){
            console.log(data);
            $.ajax({
                url: "/providerDel",
                type: "POST",
                data:{"id":data.id},
                dataType: "json",
                success: function(data){
                       if(data.state==200){
                       //删除这一行
                        obj.del();
                       //关闭弹框
                        layer.close(index);
                        layer.msg("删除成功", {icon: 6});
                    }else{
                        layer.msg("删除失败", {icon: 5});
                    }  
                }  
            });
        });
    } else if(obj.event === 'edit'){
			layer.open({
	            type: 2
	            ,shadeClose: true
	            ,shade: false
	            ,maxmin: true
	            ,title: '修改 ID 为'+data.id+'的供应商'
	            ,area: ['480px', '525px'] //宽高
	            ,content: '/showProviderEdit?id='+data.id
	            ,end: function(){  
	                // 如果是通过单击关闭按钮关闭弹出层，父画面没有此表单  
	                if($("#popupForm").length === 1){  
	                    $.post("${pageContext.request.contextPath }/editProvider",$("#popupForm").serialize(),function(){
	                    	layer.msg("修改成功!", {icon: 6});
	                    	table.reload('testReload');
	                    });  
	                }  
	            }
	        })
    }
});
});
</script>
</div>