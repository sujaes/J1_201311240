package com.sd.headfirst.strategy;

public class ModelDuck extends Duck {
 public ModelDuck() {
  flyBehavior = new FlyRocketPowered();
  quackBehavior = new Quack();
 }

 public void display() {
  System.out.println("I'm a model duck");
 }
}