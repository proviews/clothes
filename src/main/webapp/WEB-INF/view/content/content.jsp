<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>服装生产系统</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/layui/css/layui.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/static/layui/layui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/index.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/provider/provider.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/storage/storage.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/produce/produceRecord.js"></script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo layui-bg-green">服装生产系统管理</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
      <li class="layui-nav-item"><a href="">控制台</a></li>
      <li class="layui-nav-item"><a href="">商品管理</a></li>
      <li class="layui-nav-item"><a href="">用户</a></li>
      <li class="layui-nav-item">
        <a href="javascript:;">其它系统</a>
        <dl class="layui-nav-child">
          <dd><a href="">邮件管理</a></dd>
          <dd><a href="">消息管理</a></dd>
          <dd><a href="">授权管理</a></dd>
        </dl>
      </li>
    </ul>
    <ul class="layui-nav layui-layout-right layui-bg-red">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
          ${sessionScope.userTable.username}
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li id="logout" class="layui-nav-item"><a href="${pageContext.request.contextPath }/logout">退出</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
       
        <li class="layui-nav-item">
          <a class="" href="javascript:;">财务管理功能</a>	
          <dl class="layui-nav-child">
            <dd><a id="a1" href="javascript:;">应付款（供应商）</a></dd>
            <dd><a id="a2" href="javascript:;">应收款（客户）</a></dd>
            <dd><a id="a3" href="javascript:;">人员工资表</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;">产品管理</a>
          <dl class="layui-nav-child">
            <dd><a id="b1" href="javascript:;">生产报表</a></dd>
            <dd><a id="b2" href="javascript:;">产品记录</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;">库存管理功能</a>
          <dl class="layui-nav-child">
            <dd><a id="c1" href="javascript:;">服装成品库存管理</a></dd>
          </dl>
        </li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <div id="content" style="padding: 15px;"></div>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    ©服装生产系统
  </div>
</div>
<script>
//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
  
});
</script>
</body>
</html>