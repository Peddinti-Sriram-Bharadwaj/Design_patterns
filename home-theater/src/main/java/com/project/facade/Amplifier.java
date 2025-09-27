package com.project.facade;

public class Amplifier{
  public void on(){ System.out.println("Amplifier on");}
  public void off(){ System.out.println("Amplifier off");}
  public void setVolume(int level) {System.out.println("Amplifier setting volume to " + level);
}
}
