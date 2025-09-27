package com.learning;

import com.learning.behavior.MoveStrategy;
public class Lion extends Animal implements Eatable{
  public Lion(String name){
    // 'super(name)' calls the cosntructor of the parent class (Animal)
    super(name, new WalkStrategy());
  }

  // We MUST provide an implementation for the abstract 'makeSound' method.
  // @Override is an annotation that thells the compiler we are intentionally
  // replacing the parent's method
  
  @Override
  public void makeSound(){
    System.out.println(this.name + " the Lion roars!");
  }

  @Override
  public void eat() {
    System.out.println(this.name + " eats some meat.");
  }
}
