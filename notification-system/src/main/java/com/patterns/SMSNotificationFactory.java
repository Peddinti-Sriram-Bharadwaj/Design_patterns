package com.patterns;

public class SMSNotificationFactory extends NotificationFactory{
  @Override
  protected Notification createNotification(){
    return new SMSNotification();
  }
}
