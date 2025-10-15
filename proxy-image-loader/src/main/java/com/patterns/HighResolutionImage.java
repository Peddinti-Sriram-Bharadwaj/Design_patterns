package com.patterns;


public class HighResolutionImage implements Image{
  private final String filename;

  public HighResolutionImage(String filename){
    this.filename = filename;
    loadImageFromDisk();
  }

  private void loadImageFromDisk(){
    System.out.println("Loading image form disk: " + filename);
    try{
      Thread.sleep(2000);
    } catch (InterruptedException e){
      e.printStackTrace();
    }
  }

  @Override
  public void display(){
    System.out.println("Displaying image: " + filename);
  }
}
