package com.project.behavioral;

public class App 
{
    public static void main( String[] args )
    {
      EmailService emailer = new EmailService();
      InventoryService inventory = new InventoryService();

      ShoppingCart cart = new ShoppingCart();
      cart.addObserver(emailer);
      cart.addObserver(inventory);

      cart.addItem("Laptop", 1200);
      cart.addItem("Mouse", 25);
      System.out.println("---");

      PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456");

      System.out.println("Checking out with Credit Card...");
      cart.checkout(creditCard);
    }
}
