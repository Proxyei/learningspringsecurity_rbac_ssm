<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录页面</title>
</head>
<body>
	<div align="center">
		<form action="${pageContext.request.contextPath }/user/login" method="POST">
			username:<input type="text" name="username" /><br /> 
			password:<input type="password" name="password" /><br />
			<input type="submit" value="提交" />&nbsp;&nbsp;记住我<input type="checkbox" name="remember-me" value="true"/>
		</form>
	</div>
</body>
</html>