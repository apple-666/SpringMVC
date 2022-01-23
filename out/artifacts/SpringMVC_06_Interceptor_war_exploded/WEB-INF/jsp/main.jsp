<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h1>首页</h1>
<span>${password}</span>
<span>${username}</span>

<p>
    <h1>已进入首页</h1>
    <a href="${pageContext.request.contextPath}/apple/goOut">注销</a>
</p>

</body>
</html>


