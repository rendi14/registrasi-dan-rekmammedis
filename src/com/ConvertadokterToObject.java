/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import exec.executedokter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ConvertadokterToObject {
        public String[][]getdokter(){
        List<dokter> mykp = new ArrayList<>();
        executedokter eplg = new executedokter();
        mykp = eplg.getdokter();
        String[][] datadokter = new String[mykp.size()][5];
        int i=0;
        for(dokter plg : mykp){
            datadokter[i][0] = plg.getKode_dokter();
            datadokter[i][1] = plg.getNama_dokter();
            datadokter[i][2] = plg.getJk();
            datadokter[i][3] = plg.getAlamat();
            datadokter[i][4] = plg.getSpesialis();
           i++;
            
        }
        return datadokter;
}
}
