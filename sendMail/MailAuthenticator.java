package com.mail.sendMail;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthenticator extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication()
    {

        return new PasswordAuthentication(MailConstants.SENDER, "tonyvnqzznlhnyjt");
    }

}