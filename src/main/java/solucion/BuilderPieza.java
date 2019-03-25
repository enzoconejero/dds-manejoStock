package solucion;

import java.util.List;

public class BuilderPieza {

    private List<Item> items;
    private String nombre;

    public BuilderPieza(String nombre) {
        this.nombre = nombre;
    }

    public Pieza build(){

        if(items.size() == 0){
            return new MateriaPrima(nombre);
        }

        else{
            return new Componente(nombre, items);
        }

    }

    public void addPieza(Pieza pieza, int cantidad){

        int index = -1;

        for(int i = 0; i < items.size(); i++){
            if( items.get(i).getPieza() == pieza){
                index = i;
                break;
            }
        }

        if( index >= 0){
            items.get(index).agregarCantidad(cantidad);
        }

        else{
            items.add(new Item(pieza, cantidad));
        }

    }

}
