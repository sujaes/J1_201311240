package com.sd.headfirst.dao.v0;
import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class DaoMainV0 {
    public static void main (String[] args){
        Connection conn=null;
        ResultSet rs=null;
        Statement stmt=null;
        try {
          Class.forName("com.mysql.jdbc.Driver");
        } catch(java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
          }
        try {
          String path = System.getProperty("user.dir");
          path += "/src/com/sd/mysql.properties";
          Properties prop = new Properties();
          prop.load(new FileInputStream(path));
          conn = DriverManager.getConnection(
          prop.getProperty("URL"),
          prop.getProperty("USER"),
          prop.getProperty("PASSWORD")
          );
//          conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "jang201311240");
//          String mySql="CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";
//          mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
          stmt=conn.createStatement();
//        stmt.execute(mySql);
//          stmt.execute("INSERT INTO persons(name,address) VALUES('v0-1','1 Hongji Dong')");
//          stmt.execute("INSERT INTO persons(name,address) VALUES('v0-2','2 Hongji Dong')");
//          stmt.execute("INSERT INTO persons(name,address) VALUES('v0-3','3 Hongji Dong')");
          rs = stmt.executeQuery("select name from persons where id<4 order by id;");
          while (rs.next()) {
            System.out.println(rs.getString("name"));
          }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if(rs != null) rs.close();
            } catch (Exception e) {};
            try {
                if(stmt != null) stmt.close();
            } catch (Exception e) {};
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {};
        }
    }
}