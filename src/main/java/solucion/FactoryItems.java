package solucion;

public class FactoryItems {

    public Item getVolante(){
        return new MateriaPrima("Volante");
    }

    public Item getMotor(){
        return new MateriaPrima("Motor");
    }

    public Item getVidrio(){
        return new MateriaPrima("Vidrio");
    }

    public Item getMoldeAluminio(){
        return new MateriaPrima("Molded de Aluminio");
    }

    public Item getMoldeZinc(){
        return new MateriaPrima("Molded de Zinc");
    }

    public Item getMoldeTungsteno(){
        return new MateriaPrima("Molded de Tungsteno");
    }

    public Item getChapa(){
        Componente chapa = new Componente("Chapa");
        chapa.agregarItem(getMoldeAluminio(),2);
        chapa.agregarItem(getMoldeZinc(),2);
        chapa.agregarItem(getMoldeTungsteno(),1);
        return chapa;
    }

    public Item getPuerta(){
        Componente puerta = new Componente("Puerta");
        puerta.agregarItem(getVidrio(),1);
        puerta.agregarItem(getChapa(),1);
        return puerta;
    }

    public Item getCarroceria(){
        return new MateriaPrima("Carroceria");
    }

    public Item getAsiento(){
        return new MateriaPrima("Asiento");
    }

    public Item getAuto(){
        Componente auto = new Componente("Auto");
        auto.agregarItem(getVolante(),1);
        auto.agregarItem(getMotor(),1);
        auto.agregarItem(getPuerta(),4);
        auto.agregarItem(getCarroceria(),1);
        auto.agregarItem(getAsiento(),4);
        return auto;
    }

}
