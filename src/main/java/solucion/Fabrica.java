package solucion;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {

    private List<Item> stock;
    private List<MateriaPrima> pendientes_compra;

    public Fabrica() {
        this.stock = new ArrayList<>();
        this.pendientes_compra = new ArrayList<>();
    }

    public void fabricar(Item item){

        //Busco el stock del item pedido
        int existencias = getStockDe(item);

        if ( existencias >= item.getCantidad() ){
            extraerStock(item);
        }

        else{
            item.restarCantidad(existencias);
            extraerStock(item);
            item.sinStock(this);
        }

    }

    private int getStockDe(Item item){

        int indice = stock.indexOf(item);

        if(indice >= 0){
            return stock.get(indice).getCantidad();
        }

        return 0;

    }

    public void construirComponente(Componente componente){

        componente.getItems().forEach(c -> fabricar(c));

    }

    public void ordenarMateriaPrima(MateriaPrima materiaPrima){

        int indice = pendientes_compra.indexOf(materiaPrima);

        if( indice >= 0) {
            pendientes_compra.get(indice).agregarCantidad(materiaPrima.getCantidad());
        }

        else {
            pendientes_compra.add(materiaPrima);
        }

    }

    public void extraerStock(Item item){

        int indice = stock.indexOf(item);

        stock.get(indice).restarCantidad(item.cantidad);

    }

}
