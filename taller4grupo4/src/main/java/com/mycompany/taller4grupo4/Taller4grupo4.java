/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller4grupo4;

/**
 *
 * @author CltControl
 */
public class Taller4grupo4 {

    public static void main(String[] args) {

        Correo correo = new Correo();
        Notificacion adaptadorCorreo = new CorreoAdaptador(correo);
        adaptadorCorreo.mandarNotificacion("Este es un mensaje de prueba puedes poner cualquier cosa en el correo sabes bruh.");


        ConcreteCreator creator = ConcreteCreator.getInstance();
        
        // Crear un reporte concreto esto lo usamos para tener un reporte en especial 
        Reporte reporte = creator.crearConcrete();
        // Usamos el reporte concreto que queriamos y habiamos creado 
        reporte.escribir();

        // ejemplo de como usamos el reporte en un reporte en concreto de nuestra eleccion 

        Reporte reporteBasico = new ConcreteReporte();

        // Decorar el reporte con estilo adicional
        Reporte reporteConEstilo = new ConcreteDecoratorA(reporteBasico);

        // Escribir el reporte
        reporteConEstilo.escribir();











    }
}
