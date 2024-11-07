package com.mycompany.taller4grupo4;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void escribir() {
        super.escribir();
        decorate();
    }

    public void decorate() {
        
    }

}
