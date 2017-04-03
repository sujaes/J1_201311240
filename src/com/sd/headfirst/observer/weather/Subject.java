package com.sd.headfirst.observer.weather;
//�������̽���  ������!!
//�ڹ� ���̺귯�� �ȿ� ������Ʈ�� �ش��ϴ� �������̽��� ���� Observerable(��ü������)
//�ڹٲ��� ���� �� ���Ѿߵǰ� �ؿ����� ���� �˾Ƽ� �����ؼ� �����.
public interface Subject{ 
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}