package com.learning;

/**
 * This is an ABSTRACT class.
 * It's a partial blueprint for what all animals in our zoo should have. 
 * You CANNOT create a new Animal() directly. You must extend it
 */

public abstract class Animal {
  protected String name; // 'protected' so sublcasses can access it.
  public MoveStrategy moveStrategy;

  public Animal(String name, MoveStrategy moveStrategy){
    this.name = name;
    this.moveStrategy = moveStrategy;
  }

  public abstract void makeSound();

  public void performMove(){
   moveStrategy.move(this.name); 
  }
  
  public void setMoveStrategy(MoveStrategy moveStrategy){
    this.moveStrategy = moveStrategy;
  }
} 
