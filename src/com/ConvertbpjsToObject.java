/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import exec.executebpjs;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ConvertbpjsToObject {
    public Object[][] getAllBpjs(){
        executebpjs ml = new executebpjs();
        List<bpjs>listmhs = ml.ListBpjs();
        Object[][] databpjs = new Object[listmhs.size()][11];
        
        int i = 0;
        for(bpjs plg:listmhs){
            databpjs[i][0] = plg.getNo_antrian();
            databpjs[i][1] = plg.getNik();
            databpjs[i][2] = plg.getKode_dokter();
            databpjs[i][3] = plg.getNama_pasien();
            databpjs[i][4] = plg.getJk();
            databpjs[i][5] = plg.getTgl_lahir();
            databpjs[i][6] = plg.getAlamat();
            databpjs[i][7] = plg.getStatus_per();
            databpjs[i][8] = plg.getNo_hp();
            databpjs[i][9] = plg.getPekerjaan();
            databpjs[i][10] = plg.getKelas_p();
           i++;
            
        }
        return databpjs;
}
}
