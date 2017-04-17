package com.sd.headfirst.factory.pizzas;

public class ClamPizza extends Pizza{
  public ClamPizza(){
    name = "ClamPizza";
    dough = "Gold Ring";
    sauce = "Soy sauce";
    toppings.add("Fresh Mozzarella");
    toppings.add("Parmesan");
  }
}