/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;

import static argus.pyrrhus.ArgusPyrrhus.STR;
import static argus.pyrrhus.ArgusPyrrhus.INT;
import static argus.pyrrhus.ArgusPyrrhus.DEX;
import static argus.pyrrhus.ArgusPyrrhus.VIT;
import java.util.Scanner;
/**
 *
 * @author Karel
 */
public class Staty {
    void name(){
    //zdraví
    int zdraví=VIT*5;
    //critical sance
    int sance = (ArgusPyrrhus.DEX * (0,5));
    int crit;
    int random= (int)(1 + 100* Math.random());
       if ((100-sance) > random) {
            
        } else {
        }
  

   
    
}}
