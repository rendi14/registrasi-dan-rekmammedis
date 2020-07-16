/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exec;

import com.dokter;
import com.pasien;
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
public class executepasien {
    public List<pasien> ListPasien(){
      List<pasien> lspasien = new ArrayList<>();
      String query = "SELECT * FROM pasien ";
      ConnectionManager conMan = new ConnectionManager();
      Connection conn = conMan.Logon();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                pasien plg = new pasien();
                plg.setNo_antrian(rs.getString("No_antrian"));
                plg.setNo_KTP(rs.getString("No_KTP"));
                plg.setKode_Dokter(rs.getString("Kode_Dokter"));
                plg.setNama_pasien(rs.getString("Nama_Pasien"));
                plg.setTtl(rs.getString("Ttl"));
                plg.setGolongan_darah(rs.getString("Golongan_Darah"));
                plg.setAlamat(rs.getString("Alamat"));
                plg.setJk(rs.getString("Jk"));
                plg.setHasil_pemeriksaan(rs.getString("hasil_pemeriksaan"));
                lspasien.add(plg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(executepasien.class.getName()).log(Level.SEVERE, null, ex);
        }
     conMan.Logoff();
     return lspasien;
    }  
    
    public String InsertPasien(pasien pmb){
      String query ="INSERT INTO pasien value(?,?,?,?,?,?,?,?,?)";
      ConnectionManager conMan = new ConnectionManager();
      com.mysql.jdbc.Connection conn = (com.mysql.jdbc.Connection) conMan.Logon();
      String Respon;
      try{
          PreparedStatement pstm = conn.prepareStatement(query);
          pstm.setString(1,pmb.getNo_antrian());
          pstm.setString(2,pmb.getNo_KTP());
          pstm.setString(3,pmb.getKode_Dokter());
          pstm.setString(4,pmb.getNama_pasien());
          pstm.setString(5,pmb.getTtl());
          pstm.setString(6, pmb.getGolongan_darah());
          pstm.setString(7, pmb.getAlamat());
          pstm.setString(8, pmb.getJk());
          pstm.setString(9, pmb.getHasil_pemeriksaan());
          pstm.executeUpdate();
          Respon = "Insert Sukses";
      }catch(SQLException ex){
       Respon = "Insert Gagal";
       Logger.getLogger(executepasien.class.getName()).log(Level.SEVERE, null, ex);
      }
      conMan.Logoff();
      return Respon;
  }
    
   public String UpdatePasien(pasien prd){
      String hasil = "";
      String query = "UPDATE pasien SET No_antrian='"+prd.getNo_antrian()+
              "', Jk='"+prd.getJk()+"', Alamat='"+prd.getAlamat()+"',"
              + "Nama_Pasien='"+prd.getNama_pasien()+"'," + "Ttl='"+prd.getTtl()+"',"+ "hasil_pemeriksaan='"+prd.getHasil_pemeriksaan()+"',"+ "Kode_Dokter='"+prd.getKode_Dokter()+""
              + "'WHERE No_KTP='"+prd.getNo_KTP()+"'";
      ConnectionManager conMan = new ConnectionManager();
      Connection conn = conMan.Logon();
      try {
          Statement stm = conn.createStatement();
          stm.executeUpdate(query);
          hasil = "Berhasil";
      } catch (SQLException ex) {
          hasil = "gagal";
          Logger.getLogger(executepasien.class.getName()).log(Level.SEVERE, null, ex);
      }
      conMan.Logoff();
      return hasil;
    } 
    public String DeletePasien(String mhs ){
      String hasil = "";
      String query = "DELETE FROM pasien WHERE No_KTP='"+mhs+"'";
      ConnectionManager conMan = new ConnectionManager();
      Connection conn = conMan.Logon();
      try {
          Statement stm = conn.createStatement();
          stm.executeUpdate(query);
          hasil = "Berhasil";
          
      } catch (SQLException ex) {
          hasil = "Gagal";
          Logger.getLogger(executebpjs.class.getName()).log(Level.SEVERE, null, ex);
      }
      conMan.Logoff();
      return hasil;
  }
}