package com.sd.headfirst.singleton.chocolate;
public class ChocolateBoiler{
  private boolean empty;
  private boolean boiled;
  private static int numCalled=0;
  private static ChocolateBoiler uniqueInstance; //static �Լ��� ���ǹǷ� static
  private ChocolateBoiler(){
    empty = true;
    boiled = false;
  } //�ƹ��� �ν��Ͻ��� ���������ϰ��Ϸ��� private
  public static ChocolateBoiler getInstance(){
    if (uniqueInstance == null) {
      System.out.println("Creating unique instance of Chocolate Boiler");
      uniqueInstance = new ChocolateBoiler();
    }
    System.out.println("Returning instance of Chocolate Boiler");
    System.out.println("jsj: numCalled "+numCalled++);
    return uniqueInstance;
  }
  public void fill(){
    if (isEmpty()) {
      empty = false;
      boiled = false;
      System.out.println("filling");
    }
  }
  public void boil(){
    if (!isEmpty() && !isBoiled()) {
    boiled = true;
    System.out.println("boiling");
    }
  }
  public void drain(){
    if (!isEmpty() && isBoiled()) {
    empty = true;
    System.out.println("draining");
    }
  }
  public boolean isEmpty() {
    return empty;
  }
 
  public boolean isBoiled() {
    return boiled;
  }
}