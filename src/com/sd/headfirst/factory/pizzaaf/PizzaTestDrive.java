package com.sd.headfirst.factory.pizzaaf;
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza1 = chicagoStore.orderPizza("cheese");
        System.out.println("Sujae ordered a " + pizza1 + "\n");
        
 }
}