package com.sd.headfirst.factory.pizzaaf;

public class ChicagoPizzaStore extends PizzaStore{
  Pizza createPizza(String type){
    Pizza pizza =null;
    PizzaIngredientFactory ingredientFactory=new ChicagoPizzaIngredientFactory();
    if(type.equals("potato")){
      pizza = new PotatoPizza(ingredientFactory);
    }
    return pizza;
  }
}