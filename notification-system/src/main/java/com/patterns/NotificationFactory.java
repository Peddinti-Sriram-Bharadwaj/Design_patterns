package com.patterns;

public abstract class NotificationFactory{
  public final void sendNotification(String message){
    Notification notification = createNotification();

    notification.send(message);
  }

  protected abstract Notification createNotification();
}
