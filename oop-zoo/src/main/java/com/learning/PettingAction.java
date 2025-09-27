package com.learning;

public class PettingAction implements ZooAction{
  @Override
  public void execute(Animal animal){
    if(animal instanceof Pettable){
      ((Pettable) animal).bePetted();
    } else {
      System.out.println(animal.name + " Cannot be petted.");
    }
  }
}
