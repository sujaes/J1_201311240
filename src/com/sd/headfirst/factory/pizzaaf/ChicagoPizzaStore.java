package com.sd.headfirst.factory.pizzaaf;

public class ChicagoPizzaStore extends PizzaStore{
  Pizza createPizza(String type){
    Pizza pizza =null;
    PizzaIngredientFactory ingredientFactory=new ChicagoPizzaIngredientFactory();
    if(type.equals("cheese")){
      //pizza = new NYStyleCheesePizza();
      pizza = new CheesePizza(ingredientFactory);
    }
    return pizza;
  }
}