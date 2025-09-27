package com.learning;


/**
 * This high-level class depends ONLY on abstractions (interfaces).
 * It doesnt' know what concrete kind of manger o simulator its using.
 * The dependencies are "injecte"through the constructor.
 */

public class ZooApplication{
  private final IZooManager manager;
  private final IZooSimulator simulator;

  public ZooApplication(IZooManager manager, IZooSimulator simulator){
    this.manager = manager;
    this.simulator = simulator;
  }

  public void run(){
      manager.addAnimal(new Lion("Leo"));
      manager.addAnimal(new Eagle("Ezra"));
      manager.addAnimal(new RoboDog("Sparky"));
      Animal poppy= new Penguin("Poppy");
      manager.addAnimal(poppy);
      
      System.out.println(" - - - A Day at the Zoo - - - ");
      for (Animal animal: manager.getAnimals()){
        animal.makeSound();
        animal.performMove();
      }

      System.out.println("\n- - - A Miracle Occurs! - - -");
      System.out.println("Poppy the Penguin finds a jetpack!");
      poppy.setMOveStrategy(new FlyStrategy());
      poppy.performMove();


  
  }
}
