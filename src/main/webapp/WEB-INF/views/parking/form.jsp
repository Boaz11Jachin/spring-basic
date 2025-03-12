<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 12.
  Time: 오전 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>주차요금 계산</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/parking/calculate" >
    <div>
        <label>차량번호</label>
            <div>
                <input type="text" name="carNumber"/>
            </div>
    </div>
    <div>
        <label>주차시간(분)</label>
        <div>
            <input type="number" name="parkingTime"/>
        </div>
    </div>
    <div>
        <label>쇼핑금액</label>
        <div>
            <input type="number" name="shoppingAmount"/>
        </div>
    </div>
    <div>
        <button type="submit">요금정산</button>
    </div>
    </form>
</body>
</html>
