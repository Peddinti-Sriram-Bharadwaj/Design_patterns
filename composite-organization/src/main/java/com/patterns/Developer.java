package com.patterns;

public class Developer implements Employee{
  private final String name;
  private final String position;

  public Developer(String name, String position){
    this.name = name;
    this.position = position;
  }

  @Override
  public void showDetails(){
    System.out.println(" - Leaf: " + name + ", Position: " + position);
  }
}
