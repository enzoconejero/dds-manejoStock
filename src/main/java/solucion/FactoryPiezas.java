package solucion;

public class FactoryPiezas {

    public Pieza getVolante(){
        BuilderPieza builder = new BuilderPieza("Volante");
        return builder.build();
    }

    public Pieza getMotor(){
        BuilderPieza builder = new BuilderPieza("Motor");
        return builder.build();
    }

    public Pieza getVidrio(){
        BuilderPieza builder = new BuilderPieza("Vidrio");
        return builder.build();
    }

    public Pieza getMoldeAluminio(){
        BuilderPieza builder = new BuilderPieza("Molded de Aluminio");
        return builder.build();
    }

    public Pieza getMoldeZinc(){
        BuilderPieza builder = new BuilderPieza("Molded de Zinc");
        return builder.build();
    }

    public Pieza getMoldeTungsteno(){
        BuilderPieza builder = new BuilderPieza("Molded de Tungsteno");
        return builder.build();
    }

    public Pieza getChapa(){
        BuilderPieza builder = new BuilderPieza("Chapa");
        builder.addPieza(getMoldeAluminio(), 2);
        builder.addPieza(getMoldeZinc(),2);
        builder.addPieza(getMoldeTungsteno(),1);
        return builder.build();
    }

    public Pieza getPuerta(){
        BuilderPieza builder = new BuilderPieza("Molded de Tungsteno");
        builder.addPieza(getVidrio(),1);
        builder.addPieza(getChapa(),1);
        return builder.build();
    }

    public Pieza getCarroceria(){
        BuilderPieza builder = new BuilderPieza("Carroceria");
        return builder.build();
    }

    public Pieza getAsiento(){
        BuilderPieza builder = new BuilderPieza("Asiento");
        return builder.build();
    }

    public Pieza getAuto(){
        BuilderPieza builder = new BuilderPieza("Auto");
        builder.addPieza(getVolante(),1);
        builder.addPieza(getMotor(),1);
        builder.addPieza(getPuerta(),4);
        builder.addPieza(getCarroceria(),1);
        builder.addPieza(getAsiento(),4);
        return builder.build();
    }

}
