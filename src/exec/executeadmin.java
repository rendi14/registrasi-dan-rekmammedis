/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exec;

import com.admin;
import db.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class executeadmin {
   private int hasil;
 public List<admin> getadmin(){
        String query = "select * from admin";
        ConnectionManager conMan = new ConnectionManager();
        List<admin> lsadmin = new ArrayList<admin>();
        Connection conn = conMan.Logon();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                admin plg = new admin();
                plg.setKode_adm(rs.getString("kode_adm"));
                plg.setUsername(rs.getString("username"));
                plg.setPassword(rs.getString("password"));
        
                lsadmin.add(plg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(executeadmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
     return lsadmin;
    }  
   public String Insertadmin(admin plg){
      String query ="INSERT INTO admin value(?,?,?)";
       ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.Logon();
      String lsadmin;
      try{
          PreparedStatement pstm = con.prepareStatement(query);
         pstm.setString(1,plg.getKode_adm());
          pstm.setString(2,plg.getUsername());
          pstm.setString(3,plg.getPassword());
          pstm.executeUpdate();
          lsadmin = "Insert Sukses";
      }catch(SQLException ex){
       lsadmin = "Insert Gagal";
      Logger.getLogger(executeadmin.class.getName()).log(Level.SEVERE, null, ex);
      }
      conMan.Logoff();
      return lsadmin;
         //
         
}
   public String hapusData(String Id){
        String hasil = "";
      String query = "DELETE FROM admin WHERE kode_adm='"+Id+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
      try {
          Statement stm = conn.createStatement();
          stm.executeUpdate(query);
          hasil = "Berhasil";
          
      } catch (SQLException ex) {
          hasil = "Gagal";
          Logger.getLogger(executeadmin.class.getName()).log(Level.SEVERE, null, ex);
      }
        conMan.Logoff();
        return hasil;
 }
    }