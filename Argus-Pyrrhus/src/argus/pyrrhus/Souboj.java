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
public class Souboj {

void Boj(){
    Enemy enemy = new Enemy();
    Staty staty = new Staty();
    ArgusPyrrhus argusPyrrhus = new ArgusPyrrhus();
    Zobrazeni zobrazeni = new Zobrazeni();
    zobrazeni.Hrdina();
    System.out.println("");
    zobrazeni.Enemy();
    while (Enemy.enemyZdravi >0 && ArgusPyrrhus.zdravi >0){
        staty.hit();
        staty.enemyHit();
        System.out.println(Enemy.enemyName+" te zasahl za "+Enemy.enemyHit+" bodu zdravi   tve zbyvajici zdravi je "+(ArgusPyrrhus.zdravi-Enemy.enemyHit));
        ArgusPyrrhus.zdravi = (ArgusPyrrhus.zdravi-Enemy.enemyHit);
        System.out.println("Zasahl jsi "+Enemy.enemyName+" za "+ArgusPyrrhus.hit+" bodu zdravi  zbyva mu "+(Enemy.enemyZdravi - ArgusPyrrhus.hit)+" bodu zdravi");
        Enemy.enemyZdravi = (Enemy.enemyZdravi - ArgusPyrrhus.hit);
    }
    if (Enemy.enemyZdravi>0){
        System.out.println("Bohuzel nejsi dost silny a prohral si s "+Enemy.enemyName+" zbylo mu "+Enemy.enemyZdravi +" bodu zdravi" );
    } 
    else{
        System.out.println(Enemy.enemyName+" vubec netusil co se stalo");
    staty.exp();
        System.out.println("Tvuj aktualni lvl je "+ArgusPyrrhus.LVL+" a tve aktualni zkusenosti jsou "+ArgusPyrrhus.EXP+"/"+ Staty.lvlup );
    ArgusPyrrhus.zdravi=(int)(ArgusPyrrhus.obtiznost * 30); 
        
    }
    
}

}
