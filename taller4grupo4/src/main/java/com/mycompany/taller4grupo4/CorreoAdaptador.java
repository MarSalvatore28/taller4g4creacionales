package com.mycompany.taller4grupo4;
public class CorreoAdaptador implements Notificacion {
    private Correo correoAdaptee;

    public CorreoAdaptador(Correo correo) {
        this.correoAdaptee = correo;
    }

    @Override
    public void mandarNotificacion(String mensaje) {
        correoAdaptee.mandarNotificacion(mensaje);
    }

}
