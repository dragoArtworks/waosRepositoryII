/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Felino extends Animal {
    boolean toxo;

    public Felino(boolean toxo, String nombre, String raza, String color, int edad) {
        super(nombre, raza, color, edad);
        this.toxo = toxo;
    }

    public boolean isToxo() {
        return toxo;
    }

    public void setToxo(boolean toxo) {
        this.toxo = toxo;
    }
}
