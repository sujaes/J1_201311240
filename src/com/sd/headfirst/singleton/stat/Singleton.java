package com.sd.headfirst.singleton.stat;
public class Singleton{
  private static int numCalled=0;
  private static Singleton uniqueInstance = new Singleton();
//private static Singleton uniqueInstance;
  private Singleton(){

  }
  public static Singleton getInstance(){
//    if (uniqueInstance == null) {
//      System.out.println("Creating unique instance");
//      uniqueInstance = new Singleton();
//    }
    System.out.println("Returning instance");
    System.out.println("jsj: numCalled "+numCalled++);
    return uniqueInstance;
  }
}