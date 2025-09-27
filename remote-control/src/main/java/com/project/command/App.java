package com.project.command;

public class App 
{
    public static void main( String[] args )
    {
      // The invoker
      RemoteControl remote = new RemoteControl();

      // The Receiver
      Light livingRoomLight = new Light();

      // Create command objects passing them the reciever
      Command lightOn = new LightOnCommand(livingRoomLight);
      Command lightOff = new LightOffCommand(livingRoomLight);

      // Program the remote's button
      remote.setCommand(lightOn);
      remote.buttonWasPressed();

      // Now press the undo button
      remote.undoButtonWasPressed();

      System.out.println("---");

      // Repgroam the same button with a different command
      remote.setCommand(lightOff);
      remote.buttonWasPressed();
      remote.undoButtonWasPressed();
    }
}
