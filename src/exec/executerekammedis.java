/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.mysql.jdbc.Connection;
import db.ConnectionManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.Rekammedis;
import java.sql.PreparedStatement;

/**
 *
 * @author ANGGITO ALFARIZI
 */
public class executerekammedis {
   public List<Rekammedis> ListRekammedis(){
      List<Rekammedis> lsRekammedis = new ArrayList<>();
      String query = "SELECT * FROM rekammedis ";
      ConnectionManager conMan = new ConnectionManager();
      Connection conn = conMan.Logon();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Rekammedis plg = new Rekammedis();
                plg.setId_rekammedis(rs.getString("id_rekammedis"));
                plg.setNo_KTP(rs.getString("No_KTP"));
                plg.setNama_pasien(rs.getString("Nama_pasien"));
                plg.setKode_dokter(rs.getString("kode_dokter"));
                plg.setKeluhan(rs.getString("keluhan"));
                plg.setTindakan(rs.getString("tindakan"));
                plg.setHasil_pemeriksaan(rs.getString("hasil_pemeriksaan"));
                lsRekammedis.add(plg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(executepasien.class.getName()).log(Level.SEVERE, null, ex);
        }
     conMan.Logoff();
     return lsRekammedis;
    }   
   
   
     public String InsertRekammedis(Rekammedis plg){
      String query ="INSERT INTO rekammedis value(?,?,?,?,?,?,?)";
       ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.Logon();
      String hasil;
      try{
         PreparedStatement pstm = con.prepareStatement(query);
         pstm.setString(1,plg.getId_rekammedis());
          pstm.setString(2,plg.getNo_KTP());
          pstm.setString(3,plg.getNama_pasien());
          pstm.setString(4,plg.getKode_dokter());
          pstm.setString(5,plg.getKeluhan());
          pstm.setString(6,plg.getTindakan());
          pstm.setString(7,plg.getHasil_pemeriksaan());
          pstm.executeUpdate();
          hasil = "Insert Sukses";
      }catch(SQLException ex){
       hasil = "Insert Gagal";
      Logger.getLogger(executedokter.class.getName()).log(Level.SEVERE, null, ex);
      }
      conMan.Logoff();
      return hasil;
   
     }   
     
     public String UpdateRekammedis(Rekammedis prd){
      String hasil = "";
      String query = "UPDATE rekammedis SET keluhan='"+prd.getKeluhan()+"'," + "tindakan='"+prd.getTindakan()+"',"
              + "hasil_pemeriksaan='"+prd.getHasil_pemeriksaan()
              + "'WHERE id_rekammedis='"+prd.getId_rekammedis()+"'";
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
     
      public String DeleteRekammedis(String mhs ){
      String hasil = "";
      String query = "DELETE FROM rekammedis WHERE id_rekammedis='"+mhs+"'";
      ConnectionManager conMan = new ConnectionManager();
      java.sql.Connection conn = conMan.Logon();
      try {
          Statement stm = conn.createStatement();
          stm.executeUpdate(query);
          hasil = "Berhasil";
          
      } catch (SQLException ex) {
          hasil = "Gagal";
          Logger.getLogger(executepasien.class.getName()).log(Level.SEVERE, null, ex);
      }
      conMan.Logoff();
      return hasil;
  }
}
