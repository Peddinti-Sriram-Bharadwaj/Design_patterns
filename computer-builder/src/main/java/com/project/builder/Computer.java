package com.project.builder;

public class Computer{
  
  private final String cpu;
  private final int ram;
  private final int storage;
  private final String gpu;
  private final String os;

  private Computer(Builder builder){
    this.cpu = builder.cpu;
    this.ram = builder.ram;
    this.storage = builder.storage;
    this.gpu = builder.gpu;
    this.os = builder.os;
  }

  @Override
  public String toString(){
    return "Computer Specs: \n" + 
           " CPU : " + cpu + "\n" + 
           " RAM: "  + ram + "GB\n" + 
           "Storage: " + storage + "GB SSD\n" +
           "GPU: " + gpu + "\n" + 
           " OS: " + os;
  }

  public static class Builder{
    private final String cpu;
    private final int ram;

    private int storage = 256;
    private String gpu = "Integrated";
    private String os = "Linux";


    public Builder(String cpu, int ram){
      this.cpu = cpu;
      this.ram = ram;
    }
    
    // Setter-like methods for optional parameters.
    // They return the Builder instance to allow for method chaining
    public Builder storage(int storage){
      this.storage = storage;
      return this;
    }

    public Builder gpu(String gpu){
      this.gpu = gpu;
      return this;
    }

    public Builder os(String os){
      this.os = os;
      return this;
    }

    public Computer build(){
      return new Computer(this);
    }
  }
} 
