/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.executerekammedis;
import java.util.List;

/**
 *
 * @author ANGGITO ALFARIZI
 */
public class ConvertRekammedis {
  public Object[][] getAllRekammedis(){
        executerekammedis ml = new executerekammedis();
        List<Rekammedis>listmhs = ml.ListRekammedis();
        Object[][] datapasien = new Object[listmhs.size()][7];
        
        int i = 0;
        for(Rekammedis plg:listmhs){
            datapasien[i][0] = plg.getId_rekammedis();
            datapasien[i][1] = plg.getNo_KTP();
            datapasien[i][2] = plg.getNama_pasien();
            datapasien[i][3] = plg.getKode_dokter();
            datapasien[i][4] = plg.getKeluhan();
            datapasien[i][5] = plg.getTindakan();
            datapasien[i][6] = plg.getHasil_pemeriksaan();
           i++;
            
        }
        return datapasien;
}    
}
