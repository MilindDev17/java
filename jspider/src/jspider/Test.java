package jspider;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
//import com.mysql.*;

public class Test 
{ 
    public static void main(String[] args) 
                         throws ClassNotFoundException, SQLException 
    { 
    	java.sql.Connection con;
    	try {
         Class.forName("com.mysql.jdbc.Driver");   
         System.out.print("loaded "); 
         con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/montly","root","root");

         //       con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/montly? user = root && password = root");
         //       Statement stmt = con.createStatement();
         
         java.sql.Statement stmt = con.createStatement();
         String insert = "INSERT INTO month " +
                 "VALUES (10, 'mi')";
//         stmt.executeQuery(insert);
         int eff = stmt.executeUpdate(insert);
         System.out.println("execute query");
         if(eff > 0) {
        	 System.out.println("Update eff");
         }
         else {
        	 System.out.println("No data");
         }
         
         con.close();
        System.out.println("created platform");
        }
        catch(ClassNotFoundException | SQLException e){
        	e.printStackTrace();
        }
        } 
} 