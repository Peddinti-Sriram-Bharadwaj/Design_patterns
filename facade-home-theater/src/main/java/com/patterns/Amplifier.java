package com.patterns;

public class Amplifier {
    public void on() { System.out.println("Amplifier is ON"); }
    public void off() { System.out.println("Amplifier is OFF"); }
    public void setSurroundSound() { System.out.println("Amplifier surround sound is ON (5.1)"); }
    public void setVolume(int level) { System.out.println("Amplifier volume set to " + level); }
}
