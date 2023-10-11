/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.awt.AWTEventMulticaster;
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
import modelo.Canino;

@WebServlet("/catalogo")
public class catalogoCaninos extends HttpServlet {
    private  ArrayList perros=new ArrayList();
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
        Canino newPerro= new Canino(nivel, nombre, raza, color, edadI);
       
        perros.add(newPerro);
        HttpSession sesion= request.getSession();
        sesion.setAttribute("perros", perros);
        RequestDispatcher rd=request.getRequestDispatcher("catalogoCaninos.jsp");
        rd.forward(request, response);
        
    }
   
}
