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
        int enemy = (int)(1);
        enemyLVL = (int)(ArgusPyrrhus.LVL*Math.random());
        switch(enemy){
            case 0:
                System.out.println("Nepritel utekl kdyz te videl");
                nikdo();
                break;
            case 1:
                System.out.println("Narazil jsi na banditu! Jeho level je: "+enemyLVL);
                bandita();
        }
    }
    void bandita(){
        enemyName = "Bandita";
        enemySTR = (int)(enemyLVL-1+10*ArgusPyrrhus.obtiznost);
        enemyDEX = (int)(enemyLVL-1+10*ArgusPyrrhus.obtiznost);
        enemyVIT = (int)(enemyLVL-1+10*ArgusPyrrhus.obtiznost);
        enemyZdravi = (5*enemyVIT);
                
        
    }
    void nikdo(){
        enemyName = "Uprchlik";
        enemySTR = 0;
        enemyDEX = 0;
        enemyVIT = 0;
        enemyZdravi = 0;
                
        
    }
    
}
