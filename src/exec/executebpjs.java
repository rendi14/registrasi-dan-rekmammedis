/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exec;

import com.bpjs;
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
public class executebpjs {
    public List<bpjs> ListBpjs(){
      List<bpjs> lsbpjs = new ArrayList<>();
      String query = "SELECT * FROM pasien_bpjs ";
      ConnectionManager conMan = new ConnectionManager();
      Connection conn = conMan.Logon();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                bpjs plg = new bpjs();
                plg.setNo_antrian(rs.getString("No_antrian"));
                plg.setNik(rs.getString("NIK"));
                plg.setKode_dokter(rs.getString("Kode_Dokter"));
                plg.setNama_pasien(rs.getString("Nama_Pasien"));
                plg.setJk(rs.getString("Jk"));
                plg.setTgl_lahir(rs.getString("Tgl_lahir"));
                plg.setAlamat(rs.getString("Alamat"));
                plg.setStatus_per(rs.getString("Status_per"));
                plg.setNo_hp(rs.getString("No_hp"));
                plg.setPekerjaan(rs.getString("Pekerjaan"));
                plg.setKelas_p(rs.getString("Kelas_P"));
                lsbpjs.add(plg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(executedokter.class.getName()).log(Level.SEVERE, null, ex);
        }
     conMan.Logoff();
     return lsbpjs;
    }  
    
    public String InsertBpjs(bpjs pmb){
      String query ="INSERT INTO pasien_bpjs value(?,?,?,?,?,?,?,?,?,?,?)";
      ConnectionManager conMan = new ConnectionManager();
      com.mysql.jdbc.Connection conn = conMan.Logon();
      String Respon;
      try{
          PreparedStatement pstm = conn.prepareStatement(query);
          pstm.setString(1,pmb.getNo_antrian());
          pstm.setString(2,pmb.getNik());
          pstm.setString(3,pmb.getKode_dokter());
          pstm.setString(4,pmb.getNama_pasien());
          pstm.setString(5,pmb.getJk());
          pstm.setString(6, pmb.getTgl_lahir());
          pstm.setString(7, pmb.getAlamat());
          pstm.setString(8, pmb.getStatus_per());
          pstm.setString(9, pmb.getNo_hp());
          pstm.setString(10, pmb.getPekerjaan());
          pstm.setString(11, pmb.getKelas_p());
          pstm.executeUpdate();
          Respon = "Insert Sukses";
      }catch(SQLException ex){
       Respon = "Insert Gagal";
       Logger.getLogger(executebpjs.class.getName()).log(Level.SEVERE, null, ex);
      }
      conMan.Logoff();
      return Respon;
  }
    
    public String UpdateBpjs(bpjs prd){
      String hasil = "";
      String query = "UPDATE pasien_bpjs SET Status_per='"+prd.getStatus_per()+
              "', Alamat='"+prd.getAlamat()+"', Kelas_P='"+prd.getKelas_p()+"',"
              + "No_hp='"+prd.getNo_hp()+"',"+ "Pekerjaan='"+prd.getPekerjaan()+""
              + "'WHERE NIK='"+prd.getNik()+"'";
      ConnectionManager conMan = new ConnectionManager();
      Connection conn = conMan.Logon();
      try {
          Statement stm = conn.createStatement();
          stm.executeUpdate(query);
          hasil = "Berhasil";
      } catch (SQLException ex) {
          hasil = "gagal";
          Logger.getLogger(executebpjs.class.getName()).log(Level.SEVERE, null, ex);
      }
      conMan.Logoff();
      return hasil;
    } 
    public String DeleteBpjs(String mhs){
      String hasil = "";
      String query = "DELETE FROM pasien_bpjs WHERE Nik='"+mhs+"'";
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
