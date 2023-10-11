<%-- 
    Document   : catalogoFelinos
    Created on : 10/10/2023, 7:57:45 a. m.
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilazosWaos.css" rel="stylesheet" type="text/css"/>
        <title>catalogo Felinos</title>
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
                <button class="button"> <a  class="enlaces" href="/waosRescate/agregarFelinos.html">agregar gaticos</a></button>
                <button class="button"> <a  class="enlaces" href="/waosRescate/index.html">volver al inicio</a></button>
            </section>
            <c:forEach var="elemento" items="${gatos}">
                <div class="separador">
                    <!--<img class="imagen" src="imagenes/perrito.jpg" alt=""/>--> 
                    <ul>
                        <li><h1 class="titulo">${elemento.nombre}</h1></li>
                        <li><h4 class="descripcion">raza: </h4>${elemento.raza}</li>
                        <li><h4 class="descripcion">color: </h4>${elemento.color}</li>
                        <li><h4 class="descripcion">edad: </h4>${elemento.edad}</li>
                        <li><h4 class="descripcion">Nivel de entrenamiento: </h4>${elemento.toxo}</li>
                    </ul>
                    </br>
                </div>
            </c:forEach>



        </div>

    </body>
</html>
