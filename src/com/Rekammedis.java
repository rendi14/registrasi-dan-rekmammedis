/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author ANGGITO ALFARIZI
 */
public class Rekammedis {
  private String id_rekammedis;
  private String No_KTP;
  private String Nama_pasien;
  private String Kode_dokter;
  private String keluhan;
  private String tindakan;
  private String hasil_pemeriksaan;

    public Rekammedis() {
    }

    public Rekammedis(String id_rekammedis) {
        this.id_rekammedis = id_rekammedis;
    }

    public Rekammedis(String No_KTP, String Nama_pasien, String Kode_dokter, String keluhan, String tindakan, String hasil_pemeriksaan) {
        this.No_KTP = No_KTP;
        this.Nama_pasien = Nama_pasien;
        this.Kode_dokter = Kode_dokter;
        this.keluhan = keluhan;
        this.tindakan = tindakan;
        this.hasil_pemeriksaan = hasil_pemeriksaan;
    }
    
    
    

    public Rekammedis(String id_rekammedis, String No_KTP, String Nama_pasien, String Kode_dokter, String keluhan, String tindakan, String hasil_pemeriksaan) {
        this.id_rekammedis = id_rekammedis;
        this.No_KTP = No_KTP;
        this.Nama_pasien = Nama_pasien;
        this.Kode_dokter = Kode_dokter;
        this.keluhan = keluhan;
        this.tindakan = tindakan;
        this.hasil_pemeriksaan = hasil_pemeriksaan;
    }

    public String getId_rekammedis() {
        return id_rekammedis;
    }

    public void setId_rekammedis(String id_rekammedis) {
        this.id_rekammedis = id_rekammedis;
    }

    public String getNo_KTP() {
        return No_KTP;
    }

    public void setNo_KTP(String No_KTP) {
        this.No_KTP = No_KTP;
    }

    public String getNama_pasien() {
        return Nama_pasien;
    }

    public void setNama_pasien(String Nama_pasien) {
        this.Nama_pasien = Nama_pasien;
    }

    public String getKode_dokter() {
        return Kode_dokter;
    }

    public void setKode_dokter(String Kode_dokter) {
        this.Kode_dokter = Kode_dokter;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public String getTindakan() {
        return tindakan;
    }

    public void setTindakan(String tindakan) {
        this.tindakan = tindakan;
    }

    public String getHasil_pemeriksaan() {
        return hasil_pemeriksaan;
    }

    public void setHasil_pemeriksaan(String hasil_pemeriksaan) {
        this.hasil_pemeriksaan = hasil_pemeriksaan;
    }

    @Override
    public String toString() {
        return "Rekammedis{" + "id_rekammedis=" + id_rekammedis + ", No_KTP=" + No_KTP + ", Nama_pasien=" + Nama_pasien + ", Kode_dokter=" + Kode_dokter + ", keluhan=" + keluhan + ", tindakan=" + tindakan + ", hasil_pemeriksaan=" + hasil_pemeriksaan + '}';
    }
  
  
  
  
  
}
