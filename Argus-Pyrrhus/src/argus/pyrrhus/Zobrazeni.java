/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;

/**
 *
 * @author Slasko
 */
 
public class Zobrazeni {
    void Hrdina(){
        System.out.println("Jmeno: "+ArgusPyrrhus.name);
        System.out.println("Level: "+ArgusPyrrhus.LVL+" Exp: "+ArgusPyrrhus.EXP);
        System.out.print("Sila: "+ArgusPyrrhus.STR+"   ");
        System.out.println("Obratnost: "+ArgusPyrrhus.DEX+"   ");
        System.out.print("Inteligence: "+ArgusPyrrhus.INT+"   ");
        System.out.println("Vitalita: "+ArgusPyrrhus.VIT+"   ");
        
    }
    void Enemy(){
        System.out.println("Jmeno: "+Enemy.enemyName);
    }
}
