/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exec;
import com.dokter;
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
public class executedokter {
       private int hasil;
 public List<dokter> getdokter(){
        String query = "select * from dokter";
        ConnectionManager conMan = new ConnectionManager();
        List<dokter> lsdokter = new ArrayList<dokter>();
        Connection conn = conMan.Logon();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                dokter plg = new dokter();
                plg.setKode_dokter(rs.getString("kode_dokter"));
                plg.setNama_dokter(rs.getString("nama_dokter"));
                plg.setJk(rs.getString("jk"));
                plg.setAlamat(rs.getString("alamat"));
                plg.setSpesialis(rs.getString("spesialis"));
                lsdokter.add(plg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(executeadmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
     return lsdokter;
    }  
     public String hapusData(String kode_dokter){
        String hasil = "";
      String query = "DELETE FROM dokter WHERE kode_dokter='"+kode_dokter+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
      try {
          Statement stm = conn.createStatement();
          stm.executeUpdate(query);
          hasil = "Berhasil";
          
      } catch (SQLException ex) {
          hasil = "Gagal";
          Logger.getLogger(executedokter.class.getName()).log(Level.SEVERE, null, ex);
      }
        conMan.Logoff();
        return hasil;
 
    }
          public String Insertdokter(dokter plg){
      String query ="INSERT INTO dokter value(?,?,?,?,?)";
       ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.Logon();
      String hasil;
      try{
          PreparedStatement pstm = con.prepareStatement(query);
         pstm.setString(1,plg.getKode_dokter());
          pstm.setString(2,plg.getNama_dokter());
          pstm.setString(3,plg.getJk());
          pstm.setString(4,plg.getAlamat());
          pstm.setString(5,plg.getSpesialis());
          pstm.executeUpdate();
          hasil = "Insert Sukses";
      }catch(SQLException ex){
       hasil = "Insert Gagal";
      Logger.getLogger(executedokter.class.getName()).log(Level.SEVERE, null, ex);
      }
      conMan.Logoff();
      return hasil;
         //
         
}

    public String Updatedokter(view.dokter plg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      public String Updatedokter(dokter plg){
      String hasil = "";
      String query = "UPDATE dokter SET nama_dokter='"+plg.getNama_dokter()+
              "', jk='"+plg.getJk()+"', alamat='"+plg.getAlamat()+"',"+ "spesialis='"+plg.getSpesialis()+
              "' WHERE kode_dokter='"+plg.getKode_dokter()+"'";
         ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.Logon();
      try {
          Statement stm = con.createStatement();
          stm.executeUpdate(query);
          hasil = "Berhasil";
      } catch (SQLException ex) {
          hasil = "gagal";
          Logger.getLogger(executedokter.class.getName()).log(Level.SEVERE, null, ex);
      }
      conMan.Logoff();
      return hasil;
    }
}
