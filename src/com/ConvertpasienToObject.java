/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import exec.executepasien;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class ConvertpasienToObject {
  public Object[][] getAllPasien(){
        executepasien ml = new executepasien();
        List<pasien>listmhs = ml.ListPasien();
        Object[][] datapasien = new Object[listmhs.size()][9];
        
        int i = 0;
        for(pasien plg:listmhs){
            datapasien[i][0] = plg.getNo_antrian();
            datapasien[i][1] = plg.getNo_KTP();
            datapasien[i][2] = plg.getNoBPJS();
            datapasien[i][3] = plg.getNama_pasien();
            datapasien[i][4] = plg.getTtl();
            datapasien[i][5] = plg.getGolongan_darah();
            datapasien[i][6] = plg.getAlamat();
            datapasien[i][7] = plg.getJk();
            datapasien[i][8] = plg.getLayanan();
           i++;
            
        }
        return datapasien;
}  
}
