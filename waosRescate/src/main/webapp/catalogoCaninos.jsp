<%-- 
    Document   : catalogo
    Created on : 1/10/2023, 10:55:08 a. m.
    Author     : USER
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Canino"%>
<%@page import="java.util.HashMap"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="controlador.catalogoCaninos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/waosRescate/estilazosWaos.css" rel="stylesheet" type="text/css"/>
        <title>catalogoCaninos</title>
    </head>
    <body>
        <div class="container">
            <div class="empresa">
                 <a href="/waosRescate/index.html">
                <img src="imagenes/logoWaos.png" alt=""width="100px" height="100px">
                </a>
               <p class="empresaI">
                    Rescates <br> 
                    Waos
                </p>
                
            </div>
            <section class="botones-container">
                <button class="button"> <a  class="enlaces" href="/waosRescate/agregarCaninos.html">agregar perrito</a></button>
                <button class="button"> <a  class="enlaces" href="/waosRescate/index.html">volver al inicio</a></button>
            </section>
            <c:forEach var="elemento" items="${perros}">
                <div class="separador">
                    <img class="imagen" src="imagenes/perrito.jpg" alt=""/>
                    <ul>
                        <li><h1 class="titulo">${elemento.nombre}</h1></li>
                        <li><h4 class="descripcion">raza: </h4>${elemento.raza}</li>
                        <li><h4 class="descripcion">color: </h4>${elemento.color}</li>
                        <li><h4 class="descripcion">edad: </h4>${elemento.edad}</li>
                        <li><h4 class="descripcion">Nivel de entrenamiento: </h4>${elemento.nivelEntrenamiento}</li>
                    </ul>
                    </br>
                </div>
            </c:forEach>



        </div>
    </body>
</html>
