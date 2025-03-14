<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 14.
  Time: 오후 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Movie :: Spring</title>
</head>
<body>
<div style="text-align: center; width:680px; margin : auto">
    <h2>${found.title}</h2>
    <p>
        <small stlye="color: lightgray">장르</small> <b>${found.genre}</b>
        <small stlye="color:lightgray">개봉일</small> <b>${found.releaseDate}</b>
    </p>
    <div style="margin-top:80px;">
        <h4>시놉시스</h4>
        <p style="white-space: pre-wrap">${found.description}</p>
    </div>
</div>
</body>
</html>
