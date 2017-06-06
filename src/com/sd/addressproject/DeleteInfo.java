package com.sd.addressproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeleteInfo implements Updater{
 private ArrayList personsList;
 private Connection con;
 String name= AddressMain.jtfName.getText();
 String phone= AddressMain.jtfPhone.getText();
 public void update(){//command
  getConnection();
  PersonInfo person = new PersonInfo(name,phone);
   removePerson(person);
  personsList = new ArrayList();
  System.out.println("정보를 삭제했음");
 }
 public Connection getConnection(){ //singleton
  try {
   Class.forName("com.mysql.jdbc.Driver"); 
  } catch(java.lang.ClassNotFoundException e) {
   System.err.print("ClassNotFoundException: ");
   System.err.println(e.getMessage());
  }
  try {
   if(con ==null){
    con = DriverManager.getConnection("jdbc:mysql://localhost/address", "root", "jang201311240");
   }
  } catch(SQLException ex) {
   System.err.println("SQLException: " +"conerror"+ ex.getMessage());
  }
  return con;
 }

 public int removePerson(PersonInfo person){
        int no = 0;
  try{
   String sql = "DELETE FROM Person WHERE name = ?";
   // Create a Prepared statement
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, person.getName());
   no = ps.executeUpdate();
  }
  catch(Exception e){
   System.out.println(e);
  }
  return no;
 }
}