package com.sd.headfirst.factory.pizzas;
import java.util.ArrayList;

public class Pizza{
  String name,dough,sauce;
  ArrayList<String> toppings = new ArrayList<String>();
  public void prepare(){
    System.out.println("Preparing" + name); 
  }
  public void bake(){
    System.out.println("Baking" + name); 
  }
  public void cut(){
    System.out.println("Cutting" + name); 
  }
  public void box(){
    System.out.println("Boxing" + name); 
  }
}