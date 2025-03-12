<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 12.
  Time: 오후 5:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BMI 계산기</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/bmi/calculate" >
        <div>
            <label>키</label>
            <div>
                <input type="number" name="height" step="0.1"/>
            </div>
        </div>
        <div>
            <label>몸무게</label>
            <div>
                <input type="number" name="weight" step="0.1"/>
            </div>
        </div>
        <div>
            <button type="submit">계산하기</button>
        </div>

    </form>
</body>
</html>
