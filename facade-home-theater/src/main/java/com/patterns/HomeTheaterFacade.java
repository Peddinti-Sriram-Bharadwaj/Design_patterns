package com.patterns;

// This is the "Facade" class.
public class HomeTheaterFacade {
    // The facade holds references to all the subsystem components.
    private final Amplifier amp;
    private final Projector projector;
    private final TheaterLights lights;

    public HomeTheaterFacade(Amplifier amp, Projector projector, TheaterLights lights) {
        this.amp = amp;
        this.projector = projector;
        this.lights = lights;
    }

    // This method provides a simple interface for a complex series of actions.
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setSurroundSound();
        amp.setVolume(7);
        System.out.println("Now playing: " + movie);
    }

    // This method provides another simple interface.
    public void endMovie() {
        System.out.println("\nShutting movie theater down...");
        amp.off();
        projector.off();
        lights.on();
    }
}
