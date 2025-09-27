package com.learning.behavior;

public class FlyStrategy implements MoveStrategy{
  @Override
  public void move(String animalName){
    System.out.println(animalName + " soars through the sky.");
  }
}
