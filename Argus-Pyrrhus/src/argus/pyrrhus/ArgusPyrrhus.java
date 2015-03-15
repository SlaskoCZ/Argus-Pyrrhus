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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user_input;
               user_input = new Scanner(System.in);
        Zobrazeni zobrazeni;
               zobrazeni = new Zobrazeni();
        Console console;
               console = System.console();

        //Jmeno
            System.out.println("Zadej jmmeno hrdiny!");
            name = user_input.next();
            
        // Vypis do konzole
            while (true){
            zobrazeni.JmenoHrdiny();
            }
       
                
    }
  
   
}
