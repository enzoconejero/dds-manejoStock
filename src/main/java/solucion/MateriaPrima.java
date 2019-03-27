package solucion;

public class MateriaPrima extends Item {

    public MateriaPrima(int cantidad, String id) {
        super(cantidad, id);
    }

    public MateriaPrima(String id) {
        super(id);
    }

    @Override
    public void sinStock(Fabrica fabrica) {
        fabrica.ordenarMateriaPrima(this);
    }

}
