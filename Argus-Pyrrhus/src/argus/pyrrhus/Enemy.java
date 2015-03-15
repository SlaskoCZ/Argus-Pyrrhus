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

public class Enemy {
    public static int enemySTR;
    public static int enemyDMG;
    public static int enemyVIT;
    public static int enemyZdravi;
    public static int enemyHit;
    public static int enemyDEX;
    public static int enemyLVL;
    public static String enemyName;
    void getEnemy(){
        int enemy = (int)(Math.random()*2+1);
        enemyLVL = (int)(1 + ArgusPyrrhus.LVL*Math.random());
        switch(enemy){
            case 0:
                System.out.println("Nepritel utekl kdyz te videl");
                break;
            case 1:
                System.out.println("Narazil jsi na banditu! Jeho level je: "+enemyLVL);
                bandita();
        }
    }
    void bandita(){
        enemyName = "Bandita";
        enemySTR = (enemyLVL-1+10);
        enemyDEX = (enemyLVL-1+10);
        enemyVIT = (enemyLVL-1+10);
        enemyZdravi = (5*enemyVIT);
                
        
    }
    
}
