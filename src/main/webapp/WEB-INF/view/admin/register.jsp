<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/layui/css/layui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/register/register.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/static/layui/layui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/swat.js"></script>
</head>
<body background="${pageContext.request.contextPath }/static/img/register.jpg">
<div id="register">
<c:if test="${not empty message }"><script type="text/javascript">alert("用户名已注册！")</script></c:if>
	<form class="layui-form layui-form-pane" action="/registerInfo" method="post">
	<h1>服装生产管理系统注册</h1>
	<div id="left">
  <div class="layui-form-item">
    <label class="layui-form-label">用户名：</label>
    <div class="layui-input-inline">
      <input type="text" name="username" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">职称：</label>
    <div class="layui-input-inline">
      <select name="permissionnum" lay-verify="required">
        <option value=""></option>
        <option value="101">老板</option>
        <option value="102">经理</option>
        <option value="103">主管</option>
        <option value="104">组长</option>
        <option value="105">人事</option>
        <option value="106">财务</option>
        <option value="107">普通员工</option>
      </select>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">密码：</label>
    <div class="layui-input-inline">
      <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">年龄：</label>
    <div class="layui-input-inline">
      <input type="text" name="age" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
    </div>
  </div>
  </div>
  <div id="right">
  <div class="layui-form-item">
    <label class="layui-form-label">身份证号：</label>
    <div class="layui-input-inline">
      <input type="text" name="identitycard" required  lay-verify="required" placeholder="请输入身份证号码" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">联系电话：</label>
    <div class="layui-input-inline">
      <input type="text" name="contact" required  lay-verify="required" placeholder="请输入联系电话" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">地址：</label>
    <div class="layui-input-inline">
      <input type="text" name="address" required  lay-verify="required" placeholder="请输入地址" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">性别：</label>
    <div class="layui-input-block">
      <input type="radio" name="sex" value="男" title="男" checked>
      <input type="radio" name="sex" value="女" title="女">
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
  </div>
</form>
</div>
<script>  
    layui.use('form', function () {  
        var form = layui.form;  
    });  
</script>  
</body>
</html>