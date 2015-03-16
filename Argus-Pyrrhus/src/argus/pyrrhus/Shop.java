/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;
import static argus.pyrrhus.ArgusPyrrhus.money;

/**
 *
 * @author Karel
 */
public class Shop {
    Vstup vstup = new Vstup();
    Databazeitemu databazeitemu = new Databazeitemu();
    Shop shop = new Shop();
    int vyber;
    int cena;
    
 public static Boolean payment;   
 void nakup(){
          vstup.vstupint(); 
 switch (Vstup.vstup){
     case "1":
     cena = 25;
     System.out.println("Opravdu chcete koupit tento item za"+cena+" ?[ano/ne]");
     vstup.vstup();
     switch (Vstup.vstup) {
         case "ano":
             if (money-cena>0) {
              payment=true;
              money-=cena;
     databazeitemu.HP();break; 
     
             }
     
         case "ne":
             shop.nakup();break;
             
     case "2":
     cena = 25;
     System.out.println("Opravdu chcete koupit tento item za"+cena+" ?[ano/ne]");
     vstup.vstup();
     switch (Vstup.vstup) {
         case "ano":
             if (money-cena>0) {
              payment=true;
              money-=cena;
     databazeitemu.HP();break; 
     
             }
     
         case "ne":
             shop.nakup();break;        
             
             

      
   
 }}}}}   
 
 
    
    

