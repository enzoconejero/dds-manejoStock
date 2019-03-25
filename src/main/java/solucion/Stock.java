package solucion;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private List<Item> stock;

    public Stock(List<Item> stock) {
        this.stock = new ArrayList<>();
    }

    public void agregarItem(Item item){
        stock.add(item);
    }

    public void agregarItems(List<Item> items){
        items.forEach(x -> stock.add(x));
    }

}
