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
public class pasien {
    private String No_antrian;
    private String No_KTP;
    private String NoBPJS;
    private String Nama_pasien;
    private String Ttl;
    private String Golongan_darah;
    private String Alamat;
    private String Jk;
    private String layanan;

    public pasien() {
    }

    public pasien(String No_KTP) {
        this.No_KTP = No_KTP;
    }

    public pasien(String No_antrian, String No_KTP, String NoBPJS, String Nama_pasien, String Ttl, String Golongan_darah, String Alamat, String Jk, String layanan) {
        this.No_antrian = No_antrian;
        this.No_KTP = No_KTP;
        this.NoBPJS = NoBPJS;
        this.Nama_pasien = Nama_pasien;
        this.Ttl = Ttl;
        this.Golongan_darah = Golongan_darah;
        this.Alamat = Alamat;
        this.Jk = Jk;
        this.layanan = layanan;
    }

    public String getNo_antrian() {
        return No_antrian;
    }

    public void setNo_antrian(String No_antrian) {
        this.No_antrian = No_antrian;
    }

    public String getNo_KTP() {
        return No_KTP;
    }

    public void setNo_KTP(String No_KTP) {
        this.No_KTP = No_KTP;
    }

    public String getNoBPJS() {
        return NoBPJS;
    }

    public void setNoBPJS(String NoBPJS) {
        this.NoBPJS = NoBPJS;
    }

    public String getNama_pasien() {
        return Nama_pasien;
    }

    public void setNama_pasien(String Nama_pasien) {
        this.Nama_pasien = Nama_pasien;
    }

    public String getTtl() {
        return Ttl;
    }

    public void setTtl(String Ttl) {
        this.Ttl = Ttl;
    }

    public String getGolongan_darah() {
        return Golongan_darah;
    }

    public void setGolongan_darah(String Golongan_darah) {
        this.Golongan_darah = Golongan_darah;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getJk() {
        return Jk;
    }

    public void setJk(String Jk) {
        this.Jk = Jk;
    }

    public String getLayanan() {
        return layanan;
    }

    public void setLayanan(String layanan) {
        this.layanan = layanan;
    }

    @Override
    public String toString() {
        return "pasien{" + "No_antrian=" + No_antrian + ", No_KTP=" + No_KTP + ", NoBPJS=" + NoBPJS + ", Nama_pasien=" + Nama_pasien + ", Ttl=" + Ttl + ", Golongan_darah=" + Golongan_darah + ", Alamat=" + Alamat + ", Jk=" + Jk + ", layanan=" + layanan + '}';
    }

  
}