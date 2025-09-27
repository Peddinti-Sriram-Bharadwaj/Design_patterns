package com.learning;

import java.util.List;

public interface IZooSimulator{
  void runAction(ZooAction action, List<Animal> animals);
}
