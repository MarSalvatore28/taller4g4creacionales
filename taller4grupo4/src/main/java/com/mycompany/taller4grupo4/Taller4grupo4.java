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
        adaptadorCorreo.mandarNotificacion("Este es un mensaje de prueba.");
    }
}
