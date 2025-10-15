package com.patterns;

public class ImageProxy implements Image{
  private final String filename;

  private HighResolutionImage realImage;

  public ImageProxy(String filename){
    this.filename = filename;
  }

  @Override
  public void display(){
    if (realImage == null){
      System.out.println("Proxy is creating the real image now.");
      realImage = new HighResolutionImage(filename);
    }

    realImage.display();
  }
}
