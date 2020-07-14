/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

/**
 *
 * @author ASUS
 */
public class bpjs {
 private String No_antrian;
 private String Nik;
 private String Kode_dokter;
 private String Nama_pasien;
 private String Jk;
 private String Tgl_lahir;
 private String Alamat;
 private String Status_per;
 private String No_hp;
 private String Pekerjaan;
 private String Kelas_p;

    public bpjs() {
    }

    public bpjs(String Nik) {
        this.Nik = Nik;
    }
    

    public bpjs(String No_antrian, String Nik, String Kode_dokter, String Nama_pasien, String Jk, String Tgl_lahir, String Alamat, String Status_per, String No_hp, String Pekerjaan, String Kelas_p) {
        this.No_antrian = No_antrian;
        this.Nik = Nik;
        this.Kode_dokter = Kode_dokter;
        this.Nama_pasien = Nama_pasien;
        this.Jk = Jk;
        this.Tgl_lahir = Tgl_lahir;
        this.Alamat = Alamat;
        this.Status_per = Status_per;
        this.No_hp = No_hp;
        this.Pekerjaan = Pekerjaan;
        this.Kelas_p = Kelas_p;
    }

    public String getNo_antrian() {
        return No_antrian;
    }

    public void setNo_antrian(String No_antrian) {
        this.No_antrian = No_antrian;
    }

    public String getNik() {
        return Nik;
    }

    public void setNik(String Nik) {
        this.Nik = Nik;
    }

    public String getKode_dokter() {
        return Kode_dokter;
    }

    public void setKode_dokter(String Kode_dokter) {
        this.Kode_dokter = Kode_dokter;
    }

    public String getNama_pasien() {
        return Nama_pasien;
    }

    public void setNama_pasien(String Nama_pasien) {
        this.Nama_pasien = Nama_pasien;
    }

    public String getJk() {
        return Jk;
    }

    public void setJk(String Jk) {
        this.Jk = Jk;
    }

    public String getTgl_lahir() {
        return Tgl_lahir;
    }

    public void setTgl_lahir(String Tgl_lahir) {
        this.Tgl_lahir = Tgl_lahir;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getStatus_per() {
        return Status_per;
    }

    public void setStatus_per(String Status_per) {
        this.Status_per = Status_per;
    }

    public String getNo_hp() {
        return No_hp;
    }

    public void setNo_hp(String No_hp) {
        this.No_hp = No_hp;
    }

    public String getPekerjaan() {
        return Pekerjaan;
    }

    public void setPekerjaan(String Pekerjaan) {
        this.Pekerjaan = Pekerjaan;
    }

    public String getKelas_p() {
        return Kelas_p;
    }

    public void setKelas_p(String Kelas_p) {
        this.Kelas_p = Kelas_p;
    }

    @Override
    public String toString() {
        return "bpjs{" + "No_antrian=" + No_antrian + ", Nik=" + Nik + ", Kode_dokter=" + Kode_dokter + ", Nama_pasien=" + Nama_pasien + ", Jk=" + Jk + ", Tgl_lahir=" + Tgl_lahir + ", Alamat=" + Alamat + ", Status_per=" + Status_per + ", No_hp=" + No_hp + ", Pekerjaan=" + Pekerjaan + ", Kelas_p=" + Kelas_p + '}';
    }
 
 

    
}
