package com.patterns;

public class EmailNotificationFactory extends NotificationFactory{
  @Override 
  protected Notification createNotification(){
    return new EmailNotification();
  }
}
