package com.sd.headfirst.observer.weather;
//�ڹٶ��̺귯���� ����.(arguement�� �ٸ�)
//���� ���� �������� ����.
public interface Observer {
  public void update(float temp, float humidity, float pressure);
}