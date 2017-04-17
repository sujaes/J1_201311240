package com.sd.headfirst.factory.pizzas;

public class PizzaTestDrive{
  public static void main(String[] args){
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);
    Pizza pizza = store.orderPizza("cheese");
    System.out.println("another pizza");
    pizza = store.orderPizza("potato");
  }
}