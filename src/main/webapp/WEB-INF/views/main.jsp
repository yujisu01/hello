<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath == '/' ? '' : pageContext.request.contextPath}" scope="application"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
</head>
<body>
 <div class="heading">
   	<h1>Hello Hello Hello </h1><h1>
   	<a href="${ctx }/login" class="nav-link">login</a>
   	<a href="${ctx }/join" class="nav-link">join</a></h1>
   <h1>	Hello Hello Hello</h1>
 </div>
	<img src="${ctx}/resources/image/cookie.jpg" alt="Image">  
	
</body>
</html>