package com.sd.headfirst.factory.pizzas;

public class VeggiePizza extends Pizza{
  public VeggiePizza(){
    name = "VeggiePizza";
    dough = "Original";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Fresh Mozzarella");
    toppings.add("Parmesan");
  }
}