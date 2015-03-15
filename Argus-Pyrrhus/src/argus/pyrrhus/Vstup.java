/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;


import static argus.pyrrhus.ArgusPyrrhus.name;
import java.util.Scanner;

/**
 *
 * @author Slasko
 */
public class Vstup {
    
    void name(){
    Scanner user_input;
       user_input = new Scanner(System.in);
       //Jmeno
            System.out.println("Zadej jmmeno hrdiny!");
            name = user_input.next();
            
               
}
}
