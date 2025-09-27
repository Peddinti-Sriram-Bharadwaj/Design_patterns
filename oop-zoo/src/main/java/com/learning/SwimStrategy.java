package com.learning;

public class SwimStrategy implements MoveStrategy{
  @Override
  public void move(String animalName){
    System.out.println(animalName + " gracefully glides through the water.");
  }
}
