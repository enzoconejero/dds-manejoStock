package solucion;

public class Item {

    private Pieza pieza;
    private int cantidad;

    public Item(Pieza pieza, int cantidad) {
        this.pieza = pieza;
        this.cantidad = cantidad;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void agregarCantidad(int cantidad){
        this.cantidad += cantidad;
    }

}
