/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ASUS
 */
public class ConnectionManager {

private Connection con;
     private com.mysql.jdbc.Connection conn;
    private String driver="com.sql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/1projectrpl";
    private String Username="root";
    private String Password="";
    
    public com.mysql.jdbc.Connection Logon(){ 
        try { 
            conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(url,Username,Password);
                   } catch (SQLException ex){
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;       
    }
    public void Logoff(){
        try {
            conn.close();
        } catch (SQLException ex){
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


