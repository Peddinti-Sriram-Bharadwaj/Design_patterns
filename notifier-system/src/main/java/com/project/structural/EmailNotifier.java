package com.project.structural;

public class EmailNotifier implements Notifier{
  @Override
  public void send(String message){
    System.out.println("Sending Email withj message: " + message);
  }
}
