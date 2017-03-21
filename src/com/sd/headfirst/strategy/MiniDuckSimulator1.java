package com.sd.headfirst.strategy;

public class MiniDuckSimulator1 {
 
 public static void main(String[] args) {
 
  Duck mallard = new MallardDuck();
  mallard.performQuack();
  mallard.performFly();
  mallard.setFlyBehavior(new FlyRocketPowered());
  mallard.performFly();
 }
}