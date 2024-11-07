package com.mycompany.taller4grupo4;
public class ConcreteReporte implements Reporte {
    
    @Override
    public void escribir() {
        System.out.println("Escribiendo el reporte en el formato especificado...");
    }

}
