package com.sd.headfirst.observer.weather;
//인터페이스는  고정부!!
//자바 라이브러리 안에 서브젝트에 해당하는 인터페이스가 있음 Observerable(대체가능함)
//자바꺼를 쓰면 다 지켜야되고 밑에꺼를 쓰면 알아서 정의해서 쓰면됨.
public interface Subject{ 
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}