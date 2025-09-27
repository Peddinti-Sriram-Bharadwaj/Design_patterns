package com.project.creational;

public class App 
{
    public static void main( String[] args )
    {
      Configuration config = Configuration.getInstance();
      System.out.println("Current Log level: " + config.getLogLevel());

      Configuration config2 = Configuration.getInstance();
      System.out.println("Are config1 and config2 the same object? " + (config == config2));

      System.out.println("---");

      LoggerFactory loggerFactory = new LoggerFactory();

      Logger consoleLogger = loggerFactory.getLogger("CONSOLE");
      consoleLogger.log("This is an informational message.");

      Logger fileLogger = loggerFactory.getLogger("FILE");
      fileLogger.log("An error occurred in the application.");
    }
}
