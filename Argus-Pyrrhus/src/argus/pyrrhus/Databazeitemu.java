/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;

/**
 *
 * @author Karel
 */
public class Databazeitemu {
public static String name;    
//kupovatelne
void HP(){
String name = "lektvar zdravi";
    if (Shop.payment==true) {
ArgusPyrrhus.zdravi = (5 * ArgusPyrrhus.VIT); 
Shop.payment = false;
        
    }
    }
void ID1(){
String name = "Zelezna dyka";
    if (Shop.payment==true) {
ArgusPyrrhus.itemstr=0;
ArgusPyrrhus.itemdex=1;
ArgusPyrrhus.itemvit=0;
ArgusPyrrhus.itemdmg=1;
Shop.payment = false;
        
    }

    
//dropnutelne    
    
}}
