package com.learning;

import com.learning.behavior.MoveStrategy;
public class Penguin extends Animal implements Eatable, Swimmable{
  public Penguin(String name){
    super(name, new SwimStrategy());  
  }

  @Override
  public void makeSound(){
    System.out.println(this.name + " the Penguin honks!");
  }

  @Override
  public void eat(){
    System.out.println(this.name + " eats a krill.");
  }

}
