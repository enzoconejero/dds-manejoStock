
package solucion;

import java.util.Objects;

public abstract class Item {

    protected int cantidad;
    protected String id;

    public Item(int cantidad, String id) {
        this.cantidad = cantidad;
        this.id = id;
    }

    public Item(String id) {
        this.id = id;
        this.cantidad = 0;
    }

    public void agregarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public void restarCantidad(int cantidad) {
        this.cantidad -= cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Item:" + id +";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Item item = (Item) o;

        return this.id == ((Item) o).id;

    }


}
