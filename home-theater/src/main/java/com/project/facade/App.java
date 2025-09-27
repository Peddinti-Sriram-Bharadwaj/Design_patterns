package com.project.facade;

public class App 
{
    public static void main( String[] args )
    {
      // Instantiate all the subsystem components
      Amplifier amp = new Amplifier();
      DvdPlayer dvd = new DvdPlayer();
      Projector projector = new Projector();
      TheaterLights lights = new TheaterLights();

      // Create the Facade, giving its references to all the components
      HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, lights);
      
      // Use the simplified interface to watch a movie
      homeTheater.watchMovie("Raiders of the Lost Ark");

      homeTheater.endMovie();
    }
}
