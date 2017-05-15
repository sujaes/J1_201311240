package com.sd.headfirst.singleton.threaddcl;

public class Singleton {
    private volatile static Singleton uniqueInstance;//�����峢�� �����Ϸ��� volatile�� �����.
    private static int numCalled=0;
    private Singleton() {}
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
          synchronized(Singleton.class){
            if(uniqueInstance == null){
              System.out.println("creating");
              uniqueInstance = new Singleton();
            }
          }
        }
        System.out.println("numCalled: "+numCalled++);
        return uniqueInstance;
    }
}