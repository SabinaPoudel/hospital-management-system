/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
 
/**
 *
 * @author SABINA
 */
import java.sql.*;

public class DBConnection {
    public static Connection getcon(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cons = DriverManager.getConnection ("jdbc:mysql://localhost:3306/advance_java","root","root");
             return cons;       
        }
        catch(Exception e){
            return null;
        }
    }
}
