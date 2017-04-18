package com.sd.headfirst.factory.pizzafm;

public class PotatoPizza extends Pizza{
  public PotatoPizza(){
     name = "PotatoPizza";
    dough = "Large Crust";
    sauce = "Tomato Pizza Sauce";
    toppings.add("mashed Potato");
    toppings.add("Parmesan");
  }
}