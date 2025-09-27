package com.project.creational;

public class FileLogger implements Logger{
  @Override
  public void log(String message){
    System.out.println("[FILE] Writing to log.txt: " + message);
  }
}
