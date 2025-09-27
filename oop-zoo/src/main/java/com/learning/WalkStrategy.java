package com.learning.behavior;

public class WalkStrategy implements MoveStrategy{
  @Override
  public void move(String animalName){
    System.out.println(animalName + " stalks throuhg the ground.");
  }
}
