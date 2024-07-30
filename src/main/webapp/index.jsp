<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculadora</title>
    <%@ include file="/assets/html/head.jsp" %>
</head>
<body class="bg-dark mt-60">
<%@ include file="/assets/html/header.jsp" %>
<div class="container bg-dark text-white mt-120">
    <form action="Calculadora_Servlet" method="post">
        <label for="numero1">Número 1:</label>
        <input type="number" id="numero1" name="numero1" placeholder="Número 1" required><br>
        <label class="mt-5" for="numero2">Número 2:</label>
        <input type="number" id="numero2" name="numero2" placeholder="Número 2" required><br>
        <label class="mt-5" for="operacion">Operación:</label>
        <select id="operacion" name="operacion">
            <option value="suma">Suma</option>
            <option value="resta">Resta</option>
            <option value="multiplicacion">Multiplicación</option>
            <option value="division">División</option>
            <option value="ordenar">Ordenar</option>
            <option value="parImpar">Par e Impar</option>
        </select><br>
        <input class="mt-5" type="submit" value="Calcular">
    </form>
</div>
<div class="mt-120">
    <%@ include file="assets/html/footer.jsp" %>
</div>
</body>
</html>