package modelo;

public class Canino extends Animal{
    int nivelEntrenamiento;

    public Canino(int nivelEntrenamiento, String nombre, String raza, String color, int edad) {
        super(nombre, raza, color, edad);
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
        return "Canino{" + " nombre:"+nombre+" raza: "+raza+" color: "+raza+ "nivelEntrenamiento=" + nivelEntrenamiento + '}';
    }
    
    
    
}

