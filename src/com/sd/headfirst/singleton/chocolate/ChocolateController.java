package com.sd.headfirst.singleton.chocolate;
 
public class ChocolateController {
 public static void main(String args[]) {
  ChocolateBoiler boiler = ChocolateBoiler.getInstance();
  boiler.fill();
  boiler.boil();
  boiler.drain();
  ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
  boiler1.fill();
  boiler1.boil();
  boiler1.drain();
  ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
  boiler2.fill();
  boiler2.boil();
  boiler2.drain();
 }
}