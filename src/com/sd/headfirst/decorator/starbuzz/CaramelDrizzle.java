package com.sd.headfirst.decorator.starbuzz;
public class CaramelDrizzle extends CondimentDecorator {
 Beverage beverage;
 
 public CaramelDrizzle(Beverage beverage) {
  this.beverage = beverage;
 }
 
 public String getDescription() {
  return beverage.getDescription() + ", CaramelDrizzle";
 }
 
 public double cost() {
  return 0.21 + beverage.cost();
 }
}