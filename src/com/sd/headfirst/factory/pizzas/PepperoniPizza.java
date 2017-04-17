package com.sd.headfirst.factory.pizzas;

public class PepperoniPizza extends Pizza{
  public PepperoniPizza(){
    name = "PepperoniPizza";
    dough = "Thin";
    sauce = "Tomato sauce";
    toppings.add("Fresh Mozzarella");
    toppings.add("Parmesan");
  }
}