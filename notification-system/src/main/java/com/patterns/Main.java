package com.patterns;

public class Main{
  public static void main(String[] args){
    NotificationFactory emailFactory = new EmailNotificationFactory();
    NotificationFactory smsFactory = new SMSNotificationFactory();

    System.out.println("Using the Email Factory");
    emailFactory.sendNotification("Hello, this is a test email!");

    System.out.println("\nUsing the SMS Factory");
   smsFactory.sendNotification("Yo, this is a text.");
  }
}
