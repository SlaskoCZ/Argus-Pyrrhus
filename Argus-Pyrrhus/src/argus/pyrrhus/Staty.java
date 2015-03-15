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
    
    void hit(){
    //zdraví
    
    //critical sance
    float sance = ((float)ArgusPyrrhus.DEX * (0.5f));
    int critical;
    int random= (int)(1 + 100* Math.random());
       if ((100-sance) < random) {
           critical=2;
            
        } else {
           critical=1;
        }
    //síla utoku
    int odchylka = (int)(1.1 - 0.2* Math.random());
    ArgusPyrrhus.hit = Math.round((float)(Math.random()*ArgusPyrrhus.STR * odchylka * critical));
    

   
    
}
    void enemyHit(){
        int enemyCritical;
        float enemySance = ((float)Enemy.enemyDEX * (0.5f));
       int enemyRandom= (int)(1 + 100* Math.random());
       if ((100-enemySance) < enemyRandom) {
           enemyCritical=2;
            
        } else {
           enemyCritical=1;
        }
    int odchylka = (int)(1.1 - 0.2* Math.random());
    Enemy.enemyHit = Math.round((float)(Math.random()*Enemy.enemySTR * odchylka * enemyCritical));   
    }
}
