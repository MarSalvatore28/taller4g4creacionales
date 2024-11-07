package com.mycompany.taller4grupo4;

public class main {
    public static void main(String[] args) {
        // Obtiene la instancia única de ConcreteCreator
        ConcreteCreator creator = ConcreteCreator.getInstance();

        // Usa el Factory Method para crear un reporte
        Reporte reporte = creator.crearConcrete();
        reporte.escribir(); // Llama al método escribir() de ConcreteReporte

        // Llama al método operar en ConcreteCreator
        creator.operar();
    }
}
