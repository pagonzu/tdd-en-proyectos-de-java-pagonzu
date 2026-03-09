package com.tt1.mock;
import com.tt1.test.IMailer;

public class MailerMock implements IMailer {
    public int correosEnviados = 0;
    @Override
    public boolean enviarCorreo(String d, String m) {
        correosEnviados++;
        return true;
    }
}