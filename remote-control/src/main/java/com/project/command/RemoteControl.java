package com.project.command;

public class RemoteControl{
  private Command slot;
  private Command undoCommand;

  public void setCommand(Command command){
    this.slot = command;
  }

  public void buttonWasPressed(){
    System.out.print("Button pressed: ");
    slot.execute();
    undoCommand = slot;
  }

  public void undoButtonWasPressed(){
    System.out.print("Undo button was pressed: " );
    if (undoCommand != null){
      undoCommand.undo();
    }
  }
}
