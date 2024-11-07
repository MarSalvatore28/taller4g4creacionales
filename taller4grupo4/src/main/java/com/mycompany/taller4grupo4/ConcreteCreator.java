package com.mycompany.taller4grupo4;

public class ConcreteCreator implements Creator , Reporte {
    private static ConcreteCreator instance;

    private ConcreteCreator() {
        // Constructor privado para prevenir instanciación
    }

    // Método para obtener la instancia única
    public static ConcreteCreator getInstance() {
        if (instance == null) {
            instance = new ConcreteCreator();
        }
        return instance;
    }

    @Override
    public Reporte crearConcrete() {
        return new ConcreteReporte();
    }

    @Override
    public void escribir() {
        System.out.println("Escribiendo el contenido del reporte básico.");
    }

}
