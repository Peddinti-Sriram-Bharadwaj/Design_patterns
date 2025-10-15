package com.patterns;

public class Main{
  public static void main(String[] args){
    
    Shape redCircle = new Circle(new RedColor());
    redCircle.draw();

    Shape blueSquare = new Square(new BlueColor());
    blueSquare.draw();

    Shape blueCircle = new Circle(new BlueColor());
    blueCircle.draw();
  }

}
