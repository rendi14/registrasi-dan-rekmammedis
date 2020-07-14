/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import exec.executeadmin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ConvertadminToObject {
        public String[][]getadmin(){
        List<admin> mykp = new ArrayList<admin>();
        executeadmin etrs = new executeadmin();
        mykp = etrs.getadmin();
        String[][] dataadmin = new String[mykp.size()][4];
        int i=0;
        for(admin trs : mykp){
            dataadmin[i][0] = trs.getKode_adm();
            dataadmin[i][1] = trs.getUsername();
            dataadmin[i][2] = trs.getPassword();
          i++;
            
        }
        return dataadmin;
}
}