<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 12.
  Time: 오후 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>주차비 계산</title>
</head>
<body>
    <p>차량번호 ${param.carNumber}</p>
    <p>주차시간 ${param.parkingTime}분</p>
    <p>쇼핑금액 ${shoppingAmount}원</p>

    <p>정산금액은 ${fee}원 입니다</p>

    <c:choose>
        <c:when test="${fee > 0}">
            <p>
                신용카드를 카드투입구에 넣어주세요.
            </p>
        </c:when>
        <c:otherwise>
            <p>
                안녕히 가세요.
            </p>
        </c:otherwise>
    </c:choose>

</body>
</html>
