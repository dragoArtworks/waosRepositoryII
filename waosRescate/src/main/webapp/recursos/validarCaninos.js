function ValidarForma(forma){
    var nombre=forma.nombre;
    if(nombre.value == ""){
        alert("El campo nombre no puede estar vacio");
        nombre.select();
        nombre.focus();
        return false;
    }
    var raza=forma.raza;
    if(raza.value === "" ){
        alert("El campo raza no puede estar vacio");
        return false;
    }
    var color=forma.color;
    if(color.value ==""){
        alert("El espacio color no puede estar vacio");
        color.select();
        color.focus();
        return false;
    }
    if(!/^[a-zA-Z]+$/.test(color.value)){
        alert("No puedes escribir numeros en el espacio color");
        color.value="";
         color.select();
        color.focus();
        return false;
    }
    var edad=forma.edad;
    if(edad.value =="" ||edad.value < 1){
        alert("La edad debe ser mayor a 0\n y no puede est vacio");
        edad.focus();
        edad.select();
        return false;
    }
    if(/^[a-zA-Z]+$/.test(edad.value)){
        alert("El campo edad no puede contener letras");
        edad.value="";
        edad.focus();
        edad.select();
        return false;
    }
    var nivel=forma.nivel;
    if(nivel.value =="" || nivel.value<0 || nivel.value >10){
        alert("El campo nivel de entrenamiento no puede estar vacio\ny debe estra entre 1 y 10");
        nivel.focus();
        nivel.select();
        return false;
    }
    if(/^[a-zA-Z]+$/.test(nivel.value)){
        alert("El campo nivel no puede contener letras");
        nivel.value="";
        nivel.focus();
        nivel.select();
        return false;
    }
     
    alert("Formulario valido");
    return true;
    
        
}


