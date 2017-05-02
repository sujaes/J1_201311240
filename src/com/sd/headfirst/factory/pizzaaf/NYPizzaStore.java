package com.sd.headfirst.factory.pizzaaf;

public class NYPizzaStore extends PizzaStore{
  Pizza createPizza(String type){
    Pizza pizza =null;
    PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();
    if(type.equals("cheese")){
      //pizza = new NYStyleCheesePizza();
      pizza = new CheesePizza(ingredientFactory);
    }
    return pizza;
  }
}