/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class koneksi1 {
    private static Connection koneksi;
    
    public static Connection GetConnection() throws SQLException {
        if (koneksi==null) {
            Driver driver = new Driver();
           
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/1projectrpl", "root", "");
        }
        return koneksi;
    }

    public static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public static Connection getKoneksi()
    {
        if(koneksi== null)
        {
            try {
                String url="jdbc:mysql://localhost/1projectrpl";
                String username= "root";     // default username
                String password= "";         // jika ada password bisa anda masukkan
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        return koneksi;
    }
    }
    
    

