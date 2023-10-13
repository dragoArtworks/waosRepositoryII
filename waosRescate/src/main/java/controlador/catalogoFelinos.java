package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Felino;

@WebServlet("/catalogof")
public class catalogoFelinos extends HttpServlet {

    ArrayList<Felino> felinos = new ArrayList<>();
    int indice = 0;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, IOException, ServletException {
        PrintWriter out = response.getWriter();
        String nombre = request.getParameter("nombre");
        String raza = request.getParameter("raza");
        String color = request.getParameter("color");
        String edad = request.getParameter("edad");
        String toxoplasmosis = request.getParameter("toxo");

        int edadI = Integer.parseInt(edad);
        boolean toxop = Boolean.parseBoolean(toxoplasmosis);

        Felino newPerro = new Felino(toxop, indice, nombre, raza, color, edadI);

        felinos.add(newPerro);
        
        int sumedad = 0;
        for (int i = 0; i < felinos.size(); i++) {
            sumedad += felinos.get(i).getEdad();
        }

        double prom = felinos.get(0).CalcularPromedioEdad(sumedad, felinos.size());
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("cantidadGatos", felinos.size());
        sesion.setAttribute("promedioEdad", prom);
        sesion.setAttribute("gatos", felinos);
        RequestDispatcher rd = request.getRequestDispatcher("catalogoFelinos.jsp");
        rd.forward(request, response);
        indice++;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int indiceI = Integer.parseInt(request.getParameter("indice"));
        felinos.remove(indiceI);
        indice--;
        int sumedad=0;
        double prom=0;
        for (int i = 0; i < felinos.size(); i++) {
            if (felinos.size() == 0) {
                felinos.get(i).setIndice(0);
            } else if(felinos.size() == 1){
               prom=felinos.get(i).getEdad();
            }else{
                 felinos.get(i).setIndice(i + 1);
                 felinos.get(i).setIndice(i + 1);
                sumedad += felinos.get(i).getEdad();
                prom = felinos.get(indiceI).CalcularPromedioEdad(sumedad, felinos.size());
            }
        }
        HttpSession sesion = request.getSession();
        sesion.setAttribute("cantidadGatos", felinos.size());
        sesion.setAttribute("promedioEdad", prom);
        response.sendRedirect("catalogoFelinos.jsp");
    }
}
