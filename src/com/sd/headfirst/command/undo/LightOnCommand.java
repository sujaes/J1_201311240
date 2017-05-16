package com.sd.headfirst.command.undo;

public class LightOnCommand implements Command{
  Light light;
  int level;
  public LightOnCommand(Light light){
    this.light = light;
  }
  public void execute(){
    level=light.getLevel();
    light.on();
    System.out.println(light.level);
  }
  public void undo(){
    System.out.println("Start undo");
    light.dim(level);
    System.out.println(light.level);
  }
}