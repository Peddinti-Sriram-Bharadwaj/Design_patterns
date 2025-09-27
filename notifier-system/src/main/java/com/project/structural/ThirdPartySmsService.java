package com.project.structural;

public class ThirdPartySmsService{
  public void transmit(String phoneNumber, String text){
    System.out.printf("TRANSMITTING SMS to %s: %s%n", phoneNumber, text);
  }
}
