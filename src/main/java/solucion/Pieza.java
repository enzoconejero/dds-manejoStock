package solucion;

public abstract class Pieza {

    protected String nombre;

    public Pieza(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
