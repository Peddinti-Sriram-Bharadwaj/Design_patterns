package com.patterns;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
  private final String name;
  private final String position;

  private final List<Employee> subordinates = new ArrayList<>();

  public Manager(String name, String position){
    this.name = name;
    this.position = position;
  }

  public void addSubordinate(Employee employee){
    subordinates.add(employee);
  }

  public void removeSubordinate(Employee employee){
    subordinates.remove(employee);
  }

  @Override
  public void showDetails(){
    System.out.println("+ Composite: " + name + ", Position: " + position);

    for (Employee subordinate: subordinates){
      subordinate.showDetails();
    }
  }
}
