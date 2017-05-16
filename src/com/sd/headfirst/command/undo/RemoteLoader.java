package com.sd.headfirst.command.undo;
public class RemoteLoader {
 
 public static void main(String[] args) {
  RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
  Light light = new Light();

  LightOnCommand lightOn = new LightOnCommand(light);
  LightOffCommand lightOff = new LightOffCommand(light);

  remoteControl.setCommand(0, lightOn, lightOff);
  remoteControl.onbuttonWasPressed(0);
  remoteControl.offbuttonWasPressed(0);
  remoteControl.undoButtonWasPushed();
  remoteControl.offbuttonWasPressed(0);
  remoteControl.onbuttonWasPressed(0);
  remoteControl.undoButtonWasPushed();
 }
}