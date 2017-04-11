package com.sd.headfirst.decorator.starbuzz;
public class VanillaSyrup extends CondimentDecorator {
 Beverage beverage;
 
 public VanillaSyrup(Beverage beverage) {
  this.beverage = beverage;
 }
 
 public String getDescription() {
  return beverage.getDescription() + ", VanillaSyrup";
 }
 
 public double cost() {
  return 0.14 + beverage.cost();
 }
}