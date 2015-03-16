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
        int enemy = (int)(1+Math.random()*4);
        enemyLVL = (int)(1+ArgusPyrrhus.LVL*Math.random());
        switch(enemy){
            case 0:
                System.out.println("Nepritel utekl kdyz te videl");
                nikdo();
                break;
            case 1:
                System.out.println("Narazil jsi na banditu! Jeho level je: "+enemyLVL);
                bandita();
                break;
            case 2:
                System.out.println("Narazil jsi na Trpaslika! Jeho level je: "+enemyLVL);
                trpaslik();
                break;
            case 3:
                System.out.println("Narazil jsi na vlka! Jeho level je: "+enemyLVL);
                vlk();
                break;
            case 4:
                System.out.println("Narazil jsi na strom veku! Jeho level je: "+enemyLVL);
                stromVeku();
                break;
                
        }
    }
    void bandita(){
        enemyName = "Bandita";
        enemySTR =(int)Math.round(enemyLVL-1+5*ArgusPyrrhus.obtiznost);
        enemyDEX =(int)Math.round(enemyLVL-1+10*ArgusPyrrhus.obtiznost);
        enemyVIT =(int)Math.round(enemyLVL-1+3*ArgusPyrrhus.obtiznost);
        enemyZdravi = (5*enemyVIT);
                
        
    }
    void trpaslik(){
        enemyName = "Trpaslik";
        enemySTR =(int)Math.round(enemyLVL-1+2*ArgusPyrrhus.obtiznost);
        enemyDEX =(int)Math.round(enemyLVL-1+1*ArgusPyrrhus.obtiznost);
        enemyVIT =(int)Math.round(enemyLVL-1+10*ArgusPyrrhus.obtiznost);
        enemyZdravi = (10*enemyVIT);
                
        
    }
    void vlk(){
        enemyName = "Vlk";
        enemySTR =(int)Math.round(enemyLVL-1+7*ArgusPyrrhus.obtiznost);
        enemyDEX =(int)Math.round(enemyLVL-1+1*ArgusPyrrhus.obtiznost);
        enemyVIT =(int)Math.round(enemyLVL-1+8*ArgusPyrrhus.obtiznost);
        enemyZdravi = (3*enemyVIT);
                
        
    }
    void stromVeku(){
        enemyName = "Strom Veku";
        enemySTR =(int)Math.round(enemyLVL-1+1*ArgusPyrrhus.obtiznost);
        enemyDEX =(int)Math.round(enemyLVL-1+0*ArgusPyrrhus.obtiznost);
        enemyVIT =(int)Math.round(enemyLVL-1+20*ArgusPyrrhus.obtiznost);
        enemyZdravi = (12*enemyVIT);
                
        
    }
    void nikdo(){
        enemyName = "Uprchlik";
        enemySTR = 0;
        enemyDEX = 0;
        enemyVIT = 0;
        enemyZdravi = 0;
                
        
    }
    
}
