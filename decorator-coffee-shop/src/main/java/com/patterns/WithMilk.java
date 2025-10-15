package com.patterns;

public class WithMilk extends CoffeeDecorator{
  public WithMilk(Coffee coffee){
    super(coffee);
  }

  @Override
  public double getCost(){
    return super.getCost() + 1.5;
  }

  @Override
  public String getDescription(){
    return super.getDescription() + ", with milk";
  }
}
