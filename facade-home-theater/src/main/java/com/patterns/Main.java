package com.patterns;

public class Main {
    public static void main(String[] args) {
        // 1. First, create all the subsystem components.
        Amplifier amp = new Amplifier();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();

        // 2. Now, create the facade and give it the components.
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, projector, lights);

        // 3. Use the simple interface to perform complex operations.
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
