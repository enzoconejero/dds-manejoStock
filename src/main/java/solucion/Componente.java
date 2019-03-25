package solucion;

import java.util.List;

public class Componente extends Pieza{

    private List<Item> items;

    public Componente(String nombre, List<Item> items) {
        super(nombre);
        this.items = items;
    }

}
