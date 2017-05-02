package com.sd.headfirst.factory.pizzaaf;

public class PotatoPizza extends Pizza{
  PizzaIngredientFactory ingredientFactory;
  public PotatoPizza(PizzaIngredientFactory ingredientFactory){
    name = "Potato Pizza";
    this.ingredientFactory = ingredientFactory;
  }
  public void prepare(){
    System.out.println("Prepare");
    ingredientFactory.createDough();
    ingredientFactory.createCheese();
  }
}