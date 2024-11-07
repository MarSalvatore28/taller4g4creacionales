package com.mycompany.taller4grupo4;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void escribir() {
        super.escribir();
        agregarEstilo();
    }

    private void agregarEstilo() {
        System.out.println("Agregando estilo adicional al reporte.");
    }

}
