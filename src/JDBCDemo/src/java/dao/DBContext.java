/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Asus
 */
public class DBContext {

    public static Connection con;

    public DBContext() {
//            String dbUrl = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL;user=root;password=Tranducminh21202.;encrypt=true;trustServerCertificate=true";
//            String dbClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
              
            try{
                String dbURL = "jdbc:mysql://localhost:3306/QLDH_T051?zeroDateTimeBehavior=CONVERT_TO_NULL"; 
                String username = "root";
                String password = "Tranducminh21202.";
                con = DriverManager.getConnection(dbURL, username, password);
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
