package travel.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
   Conn(){
       //using jdbc:java database connectivity
       try{
       //1st step:register the driver
       Class.forName("com.mysql.cj.jdbc.Driver");
       //2nd step:creating connection string
       c=DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","Suryam@123");
       //3rd step:creating a statement
       s=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
   } 
}