package com.learning;

import com.lerning.behavior.MoveStrategy;

public class Tiger extends Animal implements Eatable{
  public Tiger(String name){
    super(name, new WalkStrategy());
  }

  @Override
  public void makeSound(){
    System.out.println(this.name + " The Tiger chuffs!");
  }

  @Override
  public void eat(){
    System.out.println(this.name + " Eats some meat");
  }
}
