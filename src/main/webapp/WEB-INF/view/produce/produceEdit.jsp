<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/layui/css/layui.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/static/layui/layui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.2.1.js"></script>
<form class="layui-form layui-form-pane" id="popupForm">
    <div class="layui-form-item">
    <label class="layui-form-label">产品数量</label>
    <div class="layui-input-inline">
    <input type="hidden" value="${productRecordTable.id }" name="id"   lay-verify="required" autocomplete="off" class="layui-input">
    <input type="text" value="${productRecordTable.productnum }" name="productnum"   lay-verify="required" autocomplete="off" class="layui-input">
     </div>
    </div>
     <div class="layui-form-item">
    <label class="layui-form-label">预期时间</label>
    <div class="layui-inline"> <!-- 注意：这一层元素并不是必须的 -->
  <input name="inspectiontime" value="${productRecordTable.inspectiontime }" type="text" class="layui-input" id="test1">
</div>
</div>
   <div class="layui-form-item">
    <label class="layui-form-label">最迟时间</label>
    <div class="layui-inline"> <!-- 注意：这一层元素并不是必须的 -->
  <input name="deliverytime" value="${productRecordTable.deliverytime }" type="text" class="layui-input" id="test2">
</div>
</div>
 <div class="layui-form-item">
    <label class="layui-form-label">产品质量</label>
    <div class="layui-input-inline">
      <input type="text" value="${productRecordTable.productquality }" name="productquality" required  lay-verify="required" autocomplete="off" class="layui-input">
     </div>
    </div>
      <div class="layui-form-item">
    <label class="layui-form-label">产品风格</label>
    <div class="layui-input-inline">
      <select name="productStyle.styleno" lay-verify="required">
        <option value="${productRecordTable.productStyle.styleno }">${productRecordTable.productStyle.stylenames }</option>
        <c:forEach items="${style }" var="s">
        <c:if test="${s.styleno !=productRecordTable.productStyle.styleno }">
        	<option value="${s.styleno }">${s.stylenames }</option>
        </c:if>
        </c:forEach>
      </select>
    </div>
  </div>
    <div class="layui-form-item">
    <label class="layui-form-label">产品类型</label>
    <div class="layui-input-inline">
      <select name="productType.productno" lay-verify="required">
        <option value="${productRecordTable.productType.productno }">${productRecordTable.productType.producttype }</option>
        <c:forEach items="${type }" var="t">
        <c:if test="${t.productno !=productRecordTable.productType.productno }">
        	<option value="${t.productno }">${t.producttype }</option>
        </c:if>
        </c:forEach>
      </select>
    </div>
  </div>
    
  <div class="layui-form-item">
    <label class="layui-form-label">产品状态</label>
    <div class="layui-input-inline">
      <select name="productionRecordStatusTable.statusno" lay-verify="required">
        <option value="${productRecordTable.productionRecordStatusTable.statusno }">${productRecordTable.productionRecordStatusTable.status }</option>
        <c:if test="${productRecordTable.productionRecordStatusTable.statusno!=1 }">
        	<option value="1">生产中</option>
        </c:if>
        <c:if test="${productRecordTable.productionRecordStatusTable.statusno!=2 }">
        	<option value="2">生产完成</option>
        </c:if>
        <c:if test="${productRecordTable.productionRecordStatusTable.statusno!=3 }">
        	<option value="3">未生产</option>
        </c:if>
      </select>
    </div>
  </div>
    
    
     <div class="layui-form-item">
    <label class="layui-form-label">负责人</label>
    <div class="layui-input-inline">
      <input type="text" name="responsibleperson" value="${productRecordTable.responsibleperson }" required  lay-verify="required" autocomplete="off" class="layui-input">
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
layui.use('form', function () {  
    var form = layui.form;  
});  
</script> 
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
    elem: '#test1', //指定元素
  });
//执行一个laydate实例
  laydate.render({
    elem: '#test2', //指定元素
  });
});
</script>
