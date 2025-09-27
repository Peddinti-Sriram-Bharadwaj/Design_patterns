package com.learning;

import java.util.List;

/**
 * This class is now CLOSED for modification.
 * It doesn't know about sounds, petting, or feeding. It only knows 
 * how to execute a 'ZooAction'. We can add infinite new actions
 * without ever changing this class again.
 */

public class ZooSimulator implements IZooSimulator{
  public void runAction(ZooAction action, List<Animal> animals){
    for (Animal animal: animals){
      action.execute(animal);
    }
  }
}
