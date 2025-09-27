package com.project.structural;

public class SmsAdapter implements Notifier{
  private final ThirdPartySmsService smsService;
  private final String phoneNumber;

  public SmsAdapter(ThirdPartySmsService smsService, String phoneNumber){
    this.smsService = smsService;
    this.phoneNumber = phoneNumber;
  }

  @Override
  public void send(String message){
    smsService.transmit(this.phoneNumber, message);
  }
}
