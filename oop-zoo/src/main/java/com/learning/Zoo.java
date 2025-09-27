package com.learning;
import java.util.ArrayList;
import java.util.List;

public class Zoo{
  public static void main(String[] args){
    
    IZooManager manager = new ZooManager();
    IZooSimulator simulator = new ZooSimulator();

    ZooApplication app = new ZooApplication(manager, simulator);

    app.run();
  
  }
} 
