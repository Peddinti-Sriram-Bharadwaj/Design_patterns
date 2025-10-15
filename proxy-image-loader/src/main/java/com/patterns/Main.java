package com.patterns;

public class Main{
  public static void main(String[] args){
    System.out.println("Creating the pxory object...");
    Image image = new ImageProxy("vacation_photo.jpg");

    System.out.println("Proxy created. Real image not loaded yet.");
    
    System.out.println("\nCalling display() for the first time...");

    image.display();

    System.out.println("\nCalling display() for the second time...");

    image.display();
  }
}
