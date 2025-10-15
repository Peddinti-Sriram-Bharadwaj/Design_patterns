package com.patterns;

public class Main{
  public static void main(String[] args){
    Employee dev1 = new Developer("Alice", "Frontend Developer");
    Employee dev2 = new Developer("Bob", "Backend Developer");
    Employee dev3 = new Developer("Charlie", "Mobile Developer");

    Manager engineeringManager = new Manager("Diana", "Engineering Manager");
    Manager cto = new Manager("Eve", "Chief Technology Officer");

    cto.addSubordinate(engineeringManager);

    engineeringManager.addSubordinate(dev1);
    engineeringManager.addSubordinate(dev2);
    engineeringManager.addSubordinate(dev3);

    System.out.println("Showing organizational structure:");
    cto.showDetails();

    System.out.println("\nShowing details for just one manager:");
    engineeringManager.showDetails();
  }
}
