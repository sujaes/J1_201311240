package com.sd.headfirst.factory.pizzaaf;

public class CheesePizza extends Pizza{
  PizzaIngredientFactory ingredientFactory;
  public CheesePizza(PizzaIngredientFactory ingredientFactory){
    name = "Cheese Pizza";
    this.ingredientFactory = ingredientFactory;
//    dough = "Thin Crust";
//    sauce = "NY Style Pizza Sauce";
//    toppings.add("Grated Reggiano Cheese");
  }
  public void prepare(){
    System.out.println("Prepare");
    ingredientFactory.createDough();
    ingredientFactory.createCheese();
  }
}