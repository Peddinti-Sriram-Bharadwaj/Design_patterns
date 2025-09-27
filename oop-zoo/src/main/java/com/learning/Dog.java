package com.learning;

// Dog is an Animal AND it is also Pettable.
// It extends one class and implements one interface.
import com.learning.behavior.MoveStrategy;
public class Dog extends Animal implements Pettable, Eatable{
  public Dog(String name){
    super(name, new WalkStrategy());
  }

  @Override
  public void makeSound(){
    System.out.println(this.name + " the Dog barks!");
  }

  // We must implement this method because we signed the 'Pettable' contract.
  
  @Override
  public void bePetted(){
    System.out.println(this.name + " wags its tail happily!");
  }

  @Override
  public void eat(){
    System.out.println(this.name + " eats some cookies");
  }
}
