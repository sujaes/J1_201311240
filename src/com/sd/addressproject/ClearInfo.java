package com.sd.addressproject;
public class ClearInfo implements Updater{
 public void update(){
   clearPerson();
  System.out.println("�ʱ�ȭ��");
 }
 public void clearPerson(){
  AddressMain.jtfName.setText("");
  AddressMain.jtfPhone.setText("");
 }
}