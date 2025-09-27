package com.project.creational;

public class LoggerFactory{
  public Logger getLogger(String type){
    if ("CONSOLE".equalsIgnoreCase(type)){
      return new ConsoleLogger();
    } else if("FILE".equalsIgnoreCase(type)){
      return new FileLogger();
    }

    return new ConsoleLogger();
  }
}
