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
            int numero_1 = Integer.parseInt(numero1);
            int numero_2 = Integer.parseInt(numero2);
            int resultado = 0;
            String parImparResultado = "";

            switch (operacion) {
                case "suma":
                    resultado = numero_1 + numero_2;
                    break;
                case "resta":
                    resultado = numero_1 - numero_2;
                    break;
                case "multiplicacion":
                    resultado = numero_1 * numero_2;
                    break;
                case "division":
                    resultado = numero_1 / numero_2;
                    break;
                case "ordenar":
                    resultado = Math.max(numero_1, numero_2);
                    break;
                case "parImpar":
                    parImparResultado = (esPar(numero_1) ? "Número 1 es par." : "Número 1 es impar.") + " " +
                            (esPar(numero_2) ? "Número 2 es par." : "Número 2 es impar.");
                    break;
            }
            if (!parImparResultado.isEmpty()) {
                request.setAttribute("resultado", parImparResultado);
            } else
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
    private boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
