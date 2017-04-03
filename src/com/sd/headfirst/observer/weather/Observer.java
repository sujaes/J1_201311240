package com.sd.headfirst.observer.weather;
//자바라이브러리에 있음.(arguement가 다름)
//만들어서 쓰면 유연성이 있음.
public interface Observer {
  public void update(float temp, float humidity, float pressure);
}