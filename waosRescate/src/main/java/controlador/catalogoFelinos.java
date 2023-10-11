package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Felino;

@WebServlet("/catalogof")
public class catalogoFelinos {
    ArrayList<Felino> felinos=new ArrayList<>();
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, IOException, ServletException{
        PrintWriter out=response.getWriter();
        String nombre=request.getParameter("nombre");
        String raza=request.getParameter("raza");
        String color=request.getParameter("color");
        String edad=request.getParameter("edad");
        String toxoplasmosis=request.getParameter("toxo");
        
        int edadI= Integer.parseInt(edad);
        boolean toxop=Boolean.parseBoolean(toxoplasmosis);
              
        Felino newPerro= new Felino(toxop, nombre, raza, color, edadI);
       
        felinos.add(newPerro);
        HttpSession sesion= request.getSession();
        sesion.setAttribute("gatos", felinos);
        RequestDispatcher rd=request.getRequestDispatcher("catalogoFelinos.jsp");
        rd.forward(request, response);
    }
    
}
