package com.tt1.test;

public class MailerStub {
    public boolean enviarCorreo(String direccion, String mensaje) {
        System.out.println("Destinatario: " + direccion);
        System.out.println("Mensaje: " + mensaje);
        return true;
    }
}