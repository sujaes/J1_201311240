package com.sd.headfirst.singleton.classic;
public class Singleton{
  private static int numCalled=0;
  private static Singleton uniqueInstance; //static 함수에 사용되므로 static
  private Singleton(){

  }
  public static Singleton getInstance(){
    if (uniqueInstance == null) {
      System.out.println("Creating unique instance");
      uniqueInstance = new Singleton();
    }
    System.out.println("Returning instance");
    System.out.println("jsj: numCalled "+numCalled++);
    return uniqueInstance;
  }
}