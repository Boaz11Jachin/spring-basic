<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 12.
  Time: 오후 5:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>BMI 결과</title>
</head>
<body>
    <h2>BMI 측정 결과</h2>
    <p>
        분석에 사용한 데이터는 <b>신장 ${param.height }m</b>, <b>${param.weight}kg</b> 입니다.
    </p>
    <p>
        분석에 사용한 데이터는 <b>신장 ${bodyStats.height }m</b>, <b>${bodyStats.weight}kg</b> 입니다.
    </p>
    <hr/>
    <p>
        BMI 수치는 ${String.format("%.2f",bmi)}입니다
    </p>

    <p>
    <c:choose>
        <c:when test ="${bmi<20}">
            저체중 구간이십니다
        </c:when>
        <c:when test = "${20<=bmi && bmi<25}">
            표준체중 구간이십니다
        </c:when>
        <c:otherwise>
            과체중 구간이십니다
        </c:otherwise>
    </c:choose>
    </p>


    <p>
        권장 체중은 ${String.format("%.2f",minKg)} ~ ${String.format("%.2f",maxKg)}kg 입니다
    </p>



</body>
</html>
