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
    Staty staty = new Staty();
    void Hrdina(){
        System.out.println("Jmeno: "+ArgusPyrrhus.name);
        System.out.println("Level: "+ArgusPyrrhus.LVL+" Exp: "+ArgusPyrrhus.EXP+"/"+staty.lvlup);
        System.out.print("Sila: "+ArgusPyrrhus.STR+"   ");
        System.out.println("Obratnost: "+ArgusPyrrhus.DEX+"   ");
        System.out.print("Inteligence: "+ArgusPyrrhus.INT+"   ");
        System.out.println("Vitalita: "+ArgusPyrrhus.VIT+"   ");
         System.out.println("Stribrny: "+ArgusPyrrhus.money+"   ");
        
    }
    void Enemy(){
        System.out.println("Jmeno: "+Enemy.enemyName);
    }
}
