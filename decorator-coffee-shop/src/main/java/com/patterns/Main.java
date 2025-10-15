package com.patterns;

public class Main{
  public static void main(String[] args){
    Coffee myCoffee = new SimpleCoffee();
    printCoffeeInfo(myCoffee);

    Coffee coffeeWithMilk = new WithMilk(myCoffee);
    printCoffeeInfo(coffeeWithMilk);

    Coffee sweetMilkyCoffee = new WithSugar(coffeeWithMilk);
    printCoffeeInfo(sweetMilkyCoffee);

    System.out.println("\n--- Creating a new coffee from scratch ---");
    Coffee blackAndSweet = new WithSugar(new SimpleCoffee());
    printCoffeeInfo(blackAndSweet);
  }

  private static void printCoffeeInfo(Coffee coffee){
    System.out.println("Cost: " + coffee.getCost() + "; Description: " + coffee.getDescription());
  }

}
