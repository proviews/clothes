<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/layui/css/layui.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/static/layui/layui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.2.1.js"></script>
<form class="layui-form layui-form-pane" id="popupForm">
   <div class="layui-form-item">
    <label class="layui-form-label">订单ID</label>
    <div class="layui-input-inline">
    <input type="hidden" value="${fmap.id }" name="id"   lay-verify="required" autocomplete="off" class="layui-input">
      <input type="text" value="${fmap.orderid }" name="orderid" required  lay-verify="required" autocomplete="off" class="layui-input">
     </div>
    </div>
     <div class="layui-form-item">
    <label class="layui-form-label">订单日期</label>
    <div class="layui-inline"> <!-- 注意：这一层元素并不是必须的 -->
  <input name="orderdate" value="${fmap.orderdate }" type="text" class="layui-input" id="test1">
</div>
</div>
 <div class="layui-form-item">
    <label class="layui-form-label">订单类型</label>
    <div class="layui-input-inline">
      <input type="text" value="${fmap.billtype }" name="billtype" required  lay-verify="required" autocomplete="off" class="layui-input">
     </div>
    </div>
     <div class="layui-form-item">
    <label class="layui-form-label">客户</label>
    <div class="layui-input-inline">
      <input type="text" value="${fmap.client }" name="client" required  lay-verify="required" autocomplete="off" class="layui-input">
     </div>
    </div>
     <div class="layui-form-item">
    <label class="layui-form-label">货物跟踪号码</label>
    <div class="layui-input-inline">
      <input type="text" value="${fmap.shipmenttrackingnumber }" name="shipmenttrackingnumber" required  lay-verify="required" autocomplete="off" class="layui-input">
     </div>
    </div>
     <div class="layui-form-item">
    <label class="layui-form-label">收款价格</label>
    <div class="layui-input-inline">
      <input type="text" value="${fmap.receivableamount }" name="receivableamount" required  lay-verify="required" autocomplete="off" class="layui-input">
     </div>
    </div>
     <div class="layui-form-item">
    <label class="layui-form-label">折扣价格</label>
    <div class="layui-input-inline">
      <input type="text" name="discountamount" value="${fmap.discountamount }" required  lay-verify="required" autocomplete="off" class="layui-input">
     </div>
    </div>
     <div class="layui-form-item">
    <label class="layui-form-label">实时价格</label>
    <div class="layui-input-inline">
      <input type="text" value="${fmap.actualamount }" name="actualamount" required  lay-verify="required" autocomplete="off" class="layui-input">
     </div>
    </div>
    <div class="layui-form-item">
    <div class="layui-input-block">
      <button id="saveBtn" type="button" class="layui-btn">提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
    </form>
<script>
$(function(){  
    $("#saveBtn").click(function(){  
        // 将表单复制到父画面，在父页面的回调函数里提交表单  
        $(parent.document.body).find("div[id='popupFormDiv']").children().remove();
        var popupForm= $(parent.document.body).find("div[id='popupFormDiv']").append($("#popupForm"));
       	var index = parent.layer.getFrameIndex(window.name); //获取窗口索引  
                parent.layer.close(index);
        }); 
}); 
layui.use('laydate', function(){
  var laydate = layui.laydate;
  
  //执行一个laydate实例
  laydate.render({
    elem: '#test1' //指定元素
  });
});
</script>
