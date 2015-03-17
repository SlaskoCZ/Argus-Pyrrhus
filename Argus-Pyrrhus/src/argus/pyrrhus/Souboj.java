/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;

import java.io.IOException;

/**
 *
 * @author Slasko
 */
public class Souboj {

    Enemy enemy = new Enemy();
    Staty staty = new Staty();
    ArgusPyrrhus argusPyrrhus = new ArgusPyrrhus();
    Zobrazeni zobrazeni = new Zobrazeni();
    Vstup vstup = new Vstup();
    Utilities utilities = new Utilities();

//    void Boj() {
//        
//        zobrazeni.Hrdina();
//        System.out.println("");
//        zobrazeni.Enemy();
//        while (Enemy.enemyZdravi > 0 && ArgusPyrrhus.zdravi > 0) {
//            staty.hit();
//            staty.enemyHit();
//            System.out.println(Enemy.enemyName + " te zasahl za " + Enemy.enemyHit + " bodu zdravi   tve zbyvajici zdravi je " + (ArgusPyrrhus.zdravi - Enemy.enemyHit));
//            ArgusPyrrhus.zdravi = (ArgusPyrrhus.zdravi - Enemy.enemyHit);
//            System.out.println("Zasahl jsi " + Enemy.enemyName + " za " + ArgusPyrrhus.hit + " bodu zdravi  zbyva mu " + (Enemy.enemyZdravi - ArgusPyrrhus.hit) + " bodu zdravi");
//            Enemy.enemyZdravi = (Enemy.enemyZdravi - ArgusPyrrhus.hit);
//        }
//        if (ArgusPyrrhus.zdravi <= 0) {
//            System.out.println("Bohuzel nejsi dost silny a prohral si s " + Enemy.enemyName + " zbylo mu " + Enemy.enemyZdravi + " bodu zdravi");
//        } else {
//            System.out.println(Enemy.enemyName + " vubec netusil co se stalo");
//            staty.exp();
//            staty.MONEY();
//            System.out.println("");
//
//        }
    //   }
    void Boj() throws IOException {

        if (Enemy.enemyZdravi > 0 && ArgusPyrrhus.zdravi > 0) {
            utok();
            if (Enemy.enemyZdravi > 0) {
                enemyutok();

            }

        } else if (ArgusPyrrhus.zdravi < 0) {
            System.out.println("Bohuzel nejsi dost silny a prohral si s " + Enemy.enemyName + " zbylo mu " + Enemy.enemyZdravi + " bodu zdravi");
        }
        System.out.println("");
        System.out.println(Enemy.enemyName + " vubec netusil co se stalo");

        staty.exp(1);
        staty.MONEY();
        System.out.println("Obdrzel jsi " + Staty.gain + " exp a " + Staty.moneygive + " stribrnych");
        zobrazeni.Hrdina();

    }

    void utok() throws IOException {
        System.out.println("0. Popis utoku ");
        System.out.println("1. Rychli utok ");
        System.out.println("2. Utok ");
        System.out.println("3. Silny utok");
        System.out.println("4. Fatality");
        vstup.vstup();
        switch (Integer.valueOf(Vstup.vstup)) {
            case 0:
                System.out.println("Rychli utok - Jde o typ utoku, ktery diky sve rychlosti temer vzdy zasahne cil. Ale postrada nicivou silu.");
                System.out.println("Utok - Jde o typ utoku, ktery je ve vsem prumerny");
                System.out.println("Silny utok - Jde o typ utoku, ktery ma ohrmnou nicivou silu, ale casto mine.");
                System.out.println("Fatality - Jde o specialni typ utoku zbrane, ktery zavisi na atributu INT a nemuze udelat kriticky zasah");
                System.out.println("Pokracovat ...");
                System.in.read();
                utok();
                break;
            case 1:
                staty.hitfast();
                break;
            case 2:
                staty.hit();
                break;
            case 3:
                staty.hithard();
                break;
            case 4:
                staty.fatality();
                break;
            default:
                System.out.println("Neplatny utok");
                utok();
                break;
        }
    }

    private void enemyutok() {
        staty.enemyHit();

    }

}
