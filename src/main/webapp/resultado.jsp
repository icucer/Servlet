<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado</title>
    <%@ include file="/assets/html/head.jsp" %>
</head>
<body class="bg-dark">
<div class="mt-5">
    <%@ include file="/assets/html/header.jsp" %>
</div>
<div class="container text-white">
    <h3 class="mt-120">Resultado: ${requestScope.resultado}</h3>
    <a href="index.jsp">Volver</a>
</div>
<div class="mt-120">
    <%@ include file="assets/html/footer.jsp" %>
</div>
</body>
</html>