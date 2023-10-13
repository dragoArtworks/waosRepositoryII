/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Felino extends Animal implements Calcular{
    boolean toxo;

    public Felino(boolean toxo, int indice, String nombre, String raza, String color, int edad) {
        super(indice, nombre, raza, color, edad);
        this.toxo = toxo;
    }

    public boolean isToxo() {
        return toxo;
    }

    public void setToxo(boolean toxo) {
        this.toxo = toxo;
    }

    @Override
    public String toString() {
        return "Felino{" + "\nnombre: "+nombre+"\nraza:"+raza+"\ncolor:"+color+ "\ntoxo=" + toxo + "\n}";
    }
}
