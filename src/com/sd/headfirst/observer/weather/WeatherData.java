package com.sd.headfirst.observer.weather;

import java.util.*;

public class WeatherData implements Subject {
  private ArrayList<Observer> observers; //갯수가 몇개올지 모르는 상황이니 array보다 arraylist가 나음
  private float temperature;
  private float humidity;
  private float pressure;
 
  public WeatherData() {
    observers = new ArrayList<Observer>(); //제네릭 타입을 정해줘야댐 아니면 오류나 경고 뜸.
  }
 
  public void registerObserver(Observer o) {
    observers.add(o);
  }
 
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(i);
    }
  }
 
  public void notifyObservers() {
    for (int i = 0; i < observers.size(); i++) {
      Observer observer = (Observer)observers.get(i);
      observer.update(temperature, humidity, pressure);
    }
  }
 
  public void measurementsChanged() {
    notifyObservers();
  }
 
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
 
  public float getTemperature() {
    return temperature;
  }
 
  public float getHumidity() {
    return humidity;
  }
 
  public float getPressure() {
    return pressure;
  }
}