package com.project.facade;

public class HomeTheaterFacade{
  // Composition: the facade holds references to all the subsystem components.

  private final Amplifier amp;
  private final DvdPlayer dvd;
  private final Projector projector;
  private final TheaterLights lights;

  public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector, TheaterLights lights){
    this.amp = amp;
    this.dvd = dvd;
    this.projector = projector;
    this.lights = lights;
  }

  public void watchMovie(String movie){
    System.out.println("Get ready to watch a movie...");
    lights.dim(10);
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setVolume(5);
    dvd.on();
    dvd.play(movie);
  }

  public void endMovie(){
    System.out.println("\nShutting movie theater down...");
    dvd.off();
    amp.off();
    projector.off();
    lights.on();
  }
}
