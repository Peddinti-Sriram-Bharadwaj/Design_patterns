package com.learning;

import com.learning.behavior.MoveStrategy;

public class Eagle extends Animal implements Eatable, Flyable{
  public Eagle(String name){
    super(name, new FlyStrategy());
  }

  @Override
  public void makeSound(){
    System.out.println(this.name + " The Eagle screeches!");
  }

  @Override
  public void eat(){
    System.out.println(this.name + " eats a fish.");
  }

}

