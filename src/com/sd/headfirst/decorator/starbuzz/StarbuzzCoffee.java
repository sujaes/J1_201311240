package com.sd.headfirst.decorator.starbuzz;

public class StarbuzzCoffee {
 
 public static void main(String args[]) {

 
  Beverage beverage2 = new HouseBlend();
  beverage2 = new Mocha(beverage2);
  beverage2 = new Mocha(beverage2);
  beverage2 = new Whip(beverage2);
  System.out.println(beverage2.getDescription() 
    + " $" + beverage2.cost());
 
  Beverage beverage3 = new CaramelMacchiato();
  beverage3 = new VanillaSyrup(beverage3);
  beverage3 = new Whip(beverage3);
  beverage3 = new CaramelDrizzle(beverage3);
  System.out.println(beverage3.getDescription() 
    + " $" + beverage3.cost());
 }
}