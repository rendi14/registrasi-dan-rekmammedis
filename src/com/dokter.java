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
public class dokter {
	private String kode_dokter;
        private String nama_dokter;
        private String jk;
	private String alamat;
        private String spesialis;

    public dokter() {
    }

    public dokter(String kode_dokter, String nama_dokter, String jk, String alamat, String spesialis) {
        this.kode_dokter = kode_dokter;
        this.nama_dokter = nama_dokter;
        this.jk = jk;
        this.alamat = alamat;
        this.spesialis = spesialis;
    }

    public String getKode_dokter() {
        return kode_dokter;
    }

    public void setKode_dokter(String kode_dokter) {
        this.kode_dokter = kode_dokter;
    }

    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    @Override
    public String toString() {
        return "dokter{" + "kode_dokter=" + kode_dokter + ", nama_dokter=" + nama_dokter + ", jk=" + jk + ", alamat=" + alamat + ", spesialis=" + spesialis + '}';
    }
}