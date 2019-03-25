<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<body>
<header>
    <base href="<%=basePath%>">
    <style type="text/css">
        form{
            margin:0px auto;

            width:500px;
            padding:20px;
        }
    </style>
</header>
<h1>SSM整合</h1>
<form action="${pageContext.request.contextPath }/employee/query" method="post">
    用户名：<input name="name"/> <br/>
    <input type="submit" value="查询"/>
</form>
</body>
</html>
