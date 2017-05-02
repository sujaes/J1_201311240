package com.sd.headfirst.factory.pizzaaf;

public interface PizzaIngredientFactory{
  public Dough createDough();
  public Cheese createCheese();
  public Potato createPotato();
}