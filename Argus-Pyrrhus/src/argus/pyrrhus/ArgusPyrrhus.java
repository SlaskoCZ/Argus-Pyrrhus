/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author Slasko
 */
public class ArgusPyrrhus {
           public static String name;
           public static int STR;
           public static int INT;
           public static int DEX;
           public static int VIT;

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner user_input;
               user_input = new Scanner(System.in);
        Zobrazeni zobrazeni;
               zobrazeni = new Zobrazeni();
        Console console;
               console = System.console();
               int i=0;
        //Staty
               STR=10;
               DEX=10;
               INT=10;
               VIT=10;
              
        //Jmeno
            System.out.println("Zadej jmmeno hrdiny!");
            name = user_input.next();
            
        // Vypis do konzole
            while (true){
            zobrazeni.JmenoHrdiny();
           
            i++;
                System.out.println("Zobrazeni: "+i);
                 Thread.sleep(10000);
                 
            }
       
                
    }
  
   
}
