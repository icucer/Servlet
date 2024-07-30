package cl.praxis.mi_calculadora;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "Calculadora_Servlet", value = "/Calculadora_Servlet")
public class Calculadora_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String numero1 = request.getParameter("numero1");
        String numero2 = request.getParameter("numero2");
        String operacion = request.getParameter("operacion");

        try {
            int num1 = Integer.parseInt(numero1);
            int num2 = Integer.parseInt(numero2);
            int resultado = 0;

            switch (operacion) {
                case "suma":
                    resultado = num1 + num2;
                    break;
                case "resta":
                    resultado = num1 - num2;
                    break;
                case "multiplicacion":
                    resultado = num1 * num2;
                    break;
                case "division":
                    resultado = num1 / num2;
                    break;
                case "ordenar":
                    resultado = Math.max(num1, num2);
                    break;
                case "parImpar":
                    // Aquí se puede implementar la lógica para par/impar
                    break;
            }
            request.setAttribute("resultado", resultado);
            RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            }
        } catch (NumberFormatException e) {
            response.sendRedirect("error.jsp");
        }
    }
}
