package com.project.behavioral;

public class EmailService implements OrderPlacedObserver{
  @Override
  public void onOrderPlaced(String orderId){
    System.out.println("[EmailService] Sending confirmation email for order: "+ orderId);

  }
}
