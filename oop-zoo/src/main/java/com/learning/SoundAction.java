package com.learning;

public class SoundAction implements ZooAction{
  @Override
  public void execute(Animal animal){
    animal.makeSound();
  }
}
