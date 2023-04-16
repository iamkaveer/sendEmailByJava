package com.mail.sendMail;

public class Main {
    public static void main(String[] args) {

        System.out.println("This application is used for sending emails");
        HandleMail mailer = new HandleMail();
        mailer.sendMail();
    }
}