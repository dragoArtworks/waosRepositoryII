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
    private  ArrayList perros=new ArrayList();
    int indice=0;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        PrintWriter out=response.getWriter();
       
        String nombre=request.getParameter("nombre");
        String raza=request.getParameter("raza");
        String color=request.getParameter("color");
        String edad=request.getParameter("edad");
        String nivelEntrenamiento=request.getParameter("nivel");
        
        int edadI= Integer.parseInt(edad);
        int nivel=Integer.parseInt(nivelEntrenamiento);
        Canino newPerro= new Canino(nivel,indice, nombre, raza, color, edadI);
       
        perros.add(newPerro);
        indice++;
       
        HttpSession sesion= request.getSession();
        sesion.setAttribute("perros", perros);
        //request.setAttribute("perros", perros);
        RequestDispatcher rd=request.getRequestDispatcher("catalogoCaninos.jsp");
        rd.forward(request, response);
        // response.sendRedirect("catalogoCaninos.jsp");
        
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int indiceI=Integer.parseInt(request.getParameter("indice"));
        perros.remove(indiceI);
        response.sendRedirect("catalogoCaninos.jsp");
    }
}
