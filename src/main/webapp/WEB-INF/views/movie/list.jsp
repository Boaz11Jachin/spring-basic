<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 14.
  Time: 오후 5:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>영화리스트</h3>
    <ul>
       <c:forEach var="one" items="${movies}">
           <li>
               ${one.id} | ${one.title} | ${one.genre} | ${one.releaseDate}
           </li>
       </c:forEach>
    </ul>
</body>
</html>
