<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>
<body>
	<h1>Spring Security</h1>

	<h2>
		<a href="${pageContext.request.contextPath }/product/add">产品添加</a>
	</h2>
	<h2>
		<a href="${pageContext.request.contextPath }/product/delete">产品删除</a>
	</h2>
	<h2>
		<a href="${pageContext.request.contextPath }/product/list">产品修改</a>
	</h2>
	<h2>
		<a href="${pageContext.request.contextPath }/product/update">产品更新</a>
	</h2>

</body>
</html>