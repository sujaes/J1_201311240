package com.sd.addressproject;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class SaveInfo implements Updater{
 private ArrayList personsList;
 private Connection con;
 String name= AddressMain.jtfName.getText();
 String phone= AddressMain.jtfPhone.getText();
 public void update(){
  getConnection();
  PersonInfo person = new PersonInfo(name, phone);
   savePerson(person);
  personsList = new ArrayList();
  System.out.println("정보를 저장했음");
 }
 public Connection getConnection(){
  try {
   Class.forName("com.mysql.jdbc.Driver"); 
  } catch(java.lang.ClassNotFoundException e) {
   System.err.print("ClassNotFoundException: ");
   System.err.println(e.getMessage());
  }
  try {
   if(con==null){ //싱글턴패턴
    con = DriverManager.getConnection("jdbc:mysql://localhost/address", "root", "jang201311240");
   }
  } catch(SQLException ex) {
   System.err.println("SQLException: " +"conerror"+ ex.getMessage());
  }
  return con;
 }

 public void savePerson(PersonInfo person){
  try
  {
   String sql = "INSERT INTO Person(name,phone) VALUES (?,?)";
   PreparedStatement ps = con.prepareStatement(sql);
   ps.setString(1, person.getName());
   ps.setString(2, person.getPhone());
   ps.executeUpdate();
  }
  catch(Exception e){
   System.out.println(e);
  }
 }
}