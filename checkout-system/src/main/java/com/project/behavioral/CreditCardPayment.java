package com.project.behavioral;

public class CreditCardPayment implements PaymentStrategy{
  private final String cardNumber;

  public CreditCardPayment(String cardNumber){
    this.cardNumber = cardNumber;
  }

  @Override
  public void pay(int amount){
    System.out.println("Paying $" + amount + " with Credit Card " + cardNumber);
  }
  
}
