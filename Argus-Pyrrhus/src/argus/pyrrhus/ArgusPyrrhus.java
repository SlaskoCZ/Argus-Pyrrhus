/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;


import java.io.IOException;

/**
 * @author Ssaruman
 * @author Slasko
 */
public class ArgusPyrrhus {
           public static String name;
           public static int STR;
           public static int INT;
           public static int DEX;
           public static int VIT;
           public static int LVL;
           public static int EXP;
           public static int zdravi;
           public static int hit;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Vstup vstup = new Vstup();
        Zobrazeni zobrazeni = new Zobrazeni();
        Utilities utilities = new Utilities();
        Souboj souboj = new Souboj();
        Enemy enemy = new Enemy();
               int i=0;
        //Staty
               vstup.stats();
               
        //Jmeno
               vstup.name();
            
        // Vypis do konzole
            utilities.clearConsole();
            System.out.println("Zmackni enter a najdes si soupere");
            System.in.read();            
            enemy.getEnemy();  
            souboj.Boj();
            System.in.read();
            
                 
            
       
                
    }
  
   
}
