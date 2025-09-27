package com.learning;

import java.util.ArrayList;
import java.util.List;


public class ZooManager implements IZooManager{
  private final List<Animal> animals = new ArrayList<>();

  public void addAnimal(Animal animal){
    this.animals.add(animal);
  }

  public List<Animal> getAnimals(){
    return this.animals;
  }
}
