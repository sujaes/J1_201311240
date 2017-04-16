package com.sd.addressproject;

public class PhoneAddress {
 private Updater updater;
 public PhoneAddress(Updater updater){
  this.updater = updater;
 }
 public void upd(){
  updater.update();
 }
}
