package com.project.creational;

public class ConsoleLogger implements Logger{
  @Override
  public void log(String message){
    System.out.println("[CONSOLE]" + message);
  }
}
