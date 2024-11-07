package com.mycompany.taller4grupo4;

public abstract class Decorator implements Reporte {
    protected Reporte reporteDecorado;

    public Decorator(Reporte reporte) {
        this.reporteDecorado = reporte;
    }

    @Override
    public void escribir() {
        reporteDecorado.escribir();
    }
    public void decorate() {
        
    }
}
