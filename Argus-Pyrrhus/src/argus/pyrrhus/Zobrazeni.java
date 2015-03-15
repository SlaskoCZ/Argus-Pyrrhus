/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;

import argus.pyrrhus.ArgusPyrrhus;

/**
 *
 * @author Slasko
 */
 
public class Zobrazeni {
    void JmenoHrdiny(){
        System.out.println("Jmeno: "+ArgusPyrrhus.name);
        System.out.print("Sila: "+ArgusPyrrhus.STR+"          ");
        System.out.println("Obratnost: "+ArgusPyrrhus.DEX+"   ");
        System.out.print("Inteligence: "+ArgusPyrrhus.INT+"   ");
        System.out.println("Vitalita: "+ArgusPyrrhus.VIT+"   ");
        
    }
    
}
