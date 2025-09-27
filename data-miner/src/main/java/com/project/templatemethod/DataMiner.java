package com.project.templatemethod;

public abstract class DataMiner{
  
  // This is the "template method"
  // It defines the skeleton of the algorithm

  public final void mine(String filePath){
    openFile(filePath);
    extractData();
    parseData();
    closeFile();
  }

  // These are concrete methods that are common to all subclasses
  private void openFile(String filePath){
    System.out.println("Opening file: " + filePath);
  }

  private void closeFile(){
    System.out.println("Closing file.");
  }

  // These are the "primitive operations" that subclasses MUST implement.
  protected abstract void extractData();
  protected abstract void parseData();
  
}
