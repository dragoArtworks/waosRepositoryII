<%-- 
    Document   : AgregarCaninos
    Created on : 30/09/2023, 8:43:10 p. m.
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="estilos.css">
    <title>agregar Caninos</title>
</head>
<body>
    <form action="perro" method="post"
    onsubmit="return ValidarForma(this)">
    <div class="contenido">
        <div class="empresa">
            <img src="imagenes/logoWaos.png" alt=""width="100px" height="100px">
            <p class="empresaI">
                Rescates <br> 
                Waos
            </p>
        </div>
        <div class="imagen">
            <img src="imagenes/chems.png" alt="" width="750px" height="750px">
        </div>
    
    <div class="tituloContenedor">
        <h1>Agregar Caninos</h1>
         <p>Por favor, complete los siguientes datos para 
            <br>agregar a su mascota canina</p>
    </div>
    <div class="contenedor" >
    
        <table class="table">        
            <tr>
                <td class="columna">
                    Nombre:
                </td>
                <td>
                    <input type="text" name="nombre" class="default">
                </td>
            </tr>
            <tr>
                <td class="columna">
                    Raza:
                </td>
                <td>
                      <select name="raza" class="default"id="raza">
                        <option value="">seleccionar</option>
                        <option value="angora">angora</option>
                        <option value="siames">siames</option>
                        <option value="persa">persa</option>
                        <option value="azul ruso">azul ruso</option>
                        <option value="siberiano">siberiano</option>
                        <option value="maine Coom">maine Coon</option>
                        <option value="Bengali">bengali</option>
                      </select>
                </td>
            </tr>
            <tr>
                <td class="columna">
                    Color:
                </td>
                <td>
                    <input type="text" name="color" class="default">
                </td>
            </tr>
            <tr>
                <td class="columna">
                    Edad:
                </td>
                <td>
                    <input type="text" name="edad" class="default">
                </td>
            </tr>
            <tr>
                <td>
                    Nivel de entrenamiento:
                </td>
                <td>
                    <input type="text" name="entrenamiento" id="nivel" class="default">
                </td>
            </tr>
            <tr>
                <td>
                    <button type="submit" class="boton">Registrar</button>
                </td>
                
            </tr>
        </table>
    </form>
    </div>
</div>   
</body>
</html>
