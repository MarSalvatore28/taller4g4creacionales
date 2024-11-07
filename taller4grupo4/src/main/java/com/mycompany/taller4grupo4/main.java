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


        //
        Correo correo = new Correo();
        Notificacion adaptadorCorreo = new CorreoAdaptador(correo);
        adaptadorCorreo.mandarNotificacion("Este es un mensaje de prueba puedes poner cualquier cosa en el correo sabes bruh.");

        // ejemplo de como usamos el reporte en un reporte en concreto de nuestra eleccion 

        Reporte reporteBasico = new ConcreteReporte();

        // Decorar el reporte con estilo adicional
        Reporte reporteConEstilo = new ConcreteDecoratorA(reporteBasico);

        // Escribir el reporte
        reporteConEstilo.escribir();

    }
}
