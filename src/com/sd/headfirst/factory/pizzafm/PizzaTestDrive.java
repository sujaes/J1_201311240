package com.sd.headfirst.factory.pizzafm;
public class PizzaTestDrive { 
 public static void main(String[] args) {
  PizzaStore nyStore = new NYPizzaStore();
  Pizza pizza = nyStore.orderPizza("cheese");
  System.out.println("I ordered a NYStyleCheesePizza \n");
 }
}