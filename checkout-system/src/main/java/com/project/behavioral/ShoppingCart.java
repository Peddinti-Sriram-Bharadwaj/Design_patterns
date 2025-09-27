package com.project.behavioral;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShoppingCart{
  private int totalAmount = 0;

  private final List<OrderPlacedObserver> observers = new ArrayList<>();

  public void addObserver(OrderPlacedObserver observer){
    observers.add(observer);
  }

  public void addItem(String item, int price){
    totalAmount += price;
    System.out.println("Added "  + item + " for $" + price);
  }

  public void checkout(PaymentStrategy paymentMethod){
    paymentMethod.pay(totalAmount);

    String orderId = UUID.randomUUID().toString();
    System.out.println("Order " + orderId + " placed successfully.");
    for(OrderPlacedObserver observer: observers){
      observer.onOrderPlaced(orderId);
    }
  }

}
