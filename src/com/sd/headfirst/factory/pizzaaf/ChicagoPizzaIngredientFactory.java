package com.sd.headfirst.factory.pizzaaf;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
  public Dough createDough(){
    return new ThinCrustDough();
  }
  public Cheese createCheese(){
    return new ReggianoCheese();
  }
}