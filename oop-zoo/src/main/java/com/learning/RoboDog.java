package com.learning;

import com.learning.behavior.MoveStrategy;
public class RoboDog extends Animal implements Pettable{
  public RoboDog(String name){
    super(name, new WalkStrategy());
  }

  @Override
  public void makeSound(){
   System.out.println(this.name + " makes a synthetic bark!");
  }

  @Override
  public void bePetted(){
    System.out.println(this.name + " wags its metallic tail.");
  }

  public void chargeBattery(){
    System.out.println(this.name + " is charging its battery.");
  }
}
