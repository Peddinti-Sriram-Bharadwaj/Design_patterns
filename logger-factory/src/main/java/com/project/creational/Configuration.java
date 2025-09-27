package com.project.creational;

public class Configuration{
  private static volatile Configuration instance;
  private final String logLevel = "INFO";

  //private constuctor prevents instantiation from other classes.
  private Configuration() {}

  // The single point of access to the isntance/
  // Double checked lokcing ensures it's thread-safe
  
  public static Configuration getInstance(){
    if (instance == null){
      synchronized (Configuration.class){
        if(instance == null){
          instance = new Configuration();
        }
      }
    }
    return instance;
  }

  public String getLogLevel(){
    return logLevel;
  }
}
