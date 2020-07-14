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
public class admin {
    private String kode_adm;
    private String username;
    private String password;

    public admin() {
    }
    

    public admin(String kode_adm, String username, String password) {
        this.kode_adm = kode_adm;
        this.username = username;
        this.password = password;
    }

    public String getKode_adm() {
        return kode_adm;
    }

    public void setKode_adm(String kode_adm) {
        this.kode_adm = kode_adm;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "admin{" + "kode_adm=" + kode_adm + ", username=" + username + ", password=" + password + '}';
    }

 
}