/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.awt.AWTEventMulticaster;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.UUID;
import javafx.scene.web.PromptData;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Canino;

@WebServlet("/catalogo")
public class catalogoCaninos extends HttpServlet {

    private ArrayList<Canino> perros = new ArrayList<Canino>();
    int indice = 0;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out = response.getWriter();

        String nombre = request.getParameter("nombre");
        String raza = request.getParameter("raza");
        String color = request.getParameter("color");
        String edad = request.getParameter("edad");
        String nivelEntrenamiento = request.getParameter("nivel");

        int edadI = Integer.parseInt(edad);
        int nivel = Integer.parseInt(nivelEntrenamiento);
        Canino newPerro = new Canino(nivel, indice, nombre, raza, color, edadI);
        perros.add(newPerro);
        //promedio edad

        indice++;
        int sumedad = 0;
        for (int i = 0; i < perros.size(); i++) {
            sumedad += perros.get(i).getEdad();
        }

        double prom = perros.get(0).CalcularPromedioEdad(sumedad, perros.size());
        HttpSession sesion = request.getSession();
        sesion.setAttribute("cantidadPerros", perros.size());
        sesion.setAttribute("promedioEdadC", prom);
        sesion.setAttribute("perros", perros);

        RequestDispatcher rd = request.getRequestDispatcher("catalogoCaninos.jsp");
        rd.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int indiceI = Integer.parseInt(request.getParameter("indice"));
        perros.remove(indiceI);

        int sumedad = 0;
        double prom =0;

        for (int i = 0; i < perros.size(); i++) {
            if (perros.size() == 0) {
            } else if (perros.size() == 1) {
                perros.get(i).setIndice(0);
                prom=perros.get(i).getEdad();
            } else {
                perros.get(i).setIndice(i + 1);
                sumedad += perros.get(i).getEdad();
                prom = perros.get(indiceI).CalcularPromedioEdad(sumedad, perros.size());
            }

        }

        HttpSession sesion = request.getSession();
        sesion.setAttribute("cantidadPerros", perros.size());
        sesion.setAttribute("promedioEdad", prom);
        response.sendRedirect("catalogoCaninos.jsp");
    }

}
