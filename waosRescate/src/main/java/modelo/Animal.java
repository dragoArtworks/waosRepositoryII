package modelo;

import java.util.ArrayList;

public class Animal implements Calcular{
    int indice=0;
    String nombre;
    String raza;
    String color;
    int edad;

    public Animal() {
    }

    public Animal(int indice ,String nombre, String raza, String color, int edad) {
        this.indice=indice;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }
    
    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public double calcularPromedioEdad(int sumedad, int cantAnimales) {
        double edad=(double)(sumedad);
        double animales=(double)(cantAnimales);
        return edad/animales;
    }
    
    
}
