package com.sd.addressproject;

public class PersonInfo //DAO
{
 private String name;
 private String phone;
    public PersonInfo()
    {       
       name = "";
       phone = "";
    }
 public PersonInfo(String name, String phone)
 {
  this.name = name;
  this.phone = phone;
 }
 public void setName(String n)
 {
  name=n;  
 }
 public void setPhone(String ph)
 {
  phone=ph;
 }
 public String getName()
 {
  return name;
 }
 public String getPhone()
 {
  return phone;
 }
}