package modelo;

public class Canino extends Animal implements Calcular{
    int nivelEntrenamiento;

    public Canino(int nivelEntrenamiento, int indice, String nombre, String raza, String color, int edad) {
        super(indice, nombre, raza, color, edad);
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    public int getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    public void setNivelEntrenamiento(int nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    @Override
    public String toString() {
        return "Canino{" + "\nnombre: "+nombre+"\nraza:"+raza+"\ncolor:"+color+ "\nnivelEntrenamiento= " + nivelEntrenamiento + "}";
    }
}

