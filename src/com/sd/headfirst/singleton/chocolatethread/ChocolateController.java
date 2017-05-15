package com.sd.headfirst.singleton.chocolatethread;
 
public class ChocolateController {
 public static void main(String args[]) {
  ChocolateBoiler boiler = ChocolateBoiler.getInstance();
  ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
 }
}
