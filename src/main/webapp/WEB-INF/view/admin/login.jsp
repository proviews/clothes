<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/layui/css/layui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/login/login.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/login/code.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/static/layui/layui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/swat.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/code.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/register.js"></script>

</head>
<body background="${pageContext.request.contextPath }/static/img/produce.jpg">
<div id="login">
<c:if test="${not empty message }"><script type="text/javascript">
	alert("注册成功!");
</script>
</c:if>
	<form class="layui-form layui-form-pane" action="/loginInfo" method="post" id="form">
	<h1>服装生产管理系统</h1>
  <div class="layui-form-item">
    <label class="layui-form-label">账号:</label>
    <div class="layui-input-inline">
      <input type="text" name="username" required lay-verify="required" placeholder="请输入账号" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">密码:</label>
    <div class="layui-input-inline">
      <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" class="layui-input">
    </div>
  </div>
  <table border="0" cellspacing="5" cellpadding="5" >
   <tr>
    <td></td>
    <td><div class="code" id="checkCode" onclick="createCode()" ></div></td>
    <td><a href="#" onclick="createCode()">看不清换一张</a></td>
   </tr>
  </table>
  <div class="layui-form-item">
    <label class="layui-form-label">验证码:</label>
    <div class="layui-input-inline">
      <input type="text" name="code" id="inputCode" placeholder="请输入验证码" class="layui-input">
    </div>
 </div> 
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button type="button" class="layui-btn" onclick="validateCode()">登录</button>
      <button type="button" id="register" class="layui-btn layui-btn-primary">注册</button>
    </div>
  </div>
</form>
</div>
</body>
</html>