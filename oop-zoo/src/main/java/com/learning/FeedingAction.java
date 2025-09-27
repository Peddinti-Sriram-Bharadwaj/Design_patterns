package com.learning;

public class FeedingAction implements ZooAction{
  @Override
  public void execute(Animal animal){
    
    if (animal instanceof Eatable){
      ((Eatable) animal).eat();
    } else{
      System.out.println(animal.name + " doesn't eat.");
    }
  }
}
