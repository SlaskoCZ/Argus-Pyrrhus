/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;

/**
 *
 * @author Karel
 */
public class Staty {

    Enemy enemy = new Enemy();
    //penizky a jeho vzorecky
    public static int moneygive;

    void MONEY() {
        if (ArgusPyrrhus.LVL == Enemy.enemyLVL) {
            moneygive = (int) ((Enemy.enemyDEX + Enemy.enemySTR + Enemy.enemyVIT) / (1 + ArgusPyrrhus.LVL - Enemy.enemyLVL));
        } else {
            moneygive = (int) ((Enemy.enemyDEX + Enemy.enemySTR + Enemy.enemyVIT) / (1 + ArgusPyrrhus.LVL - Enemy.enemyLVL));
        }
        ArgusPyrrhus.money = moneygive + ArgusPyrrhus.money;

    }
    public static int lvlup;

    void exp() {
        int expgain = 20;
        Vstup vstup = new Vstup();
        ArgusPyrrhus.EXP = (int) (ArgusPyrrhus.EXP + ArgusPyrrhus.LVL + expgain * ArgusPyrrhus.obtiznost * (1.1 - 0.2 * Math.random()));
        lvlup = 100 + ArgusPyrrhus.LVL * expgain;
        if (lvlup < ArgusPyrrhus.EXP) {
            ArgusPyrrhus.LVL = ArgusPyrrhus.LVL + 1;
            ArgusPyrrhus.EXP = 0;
            System.out.println("Vyberte si vas atribut : STR,DEX,VIT)");
            System.out.print("Zadej atribut: ");
            vstup.vstup();
            switch (Vstup.vstup) {
                case "STR":
                    ArgusPyrrhus.STR++;
                    break;
                case "DEX":
                    ArgusPyrrhus.DEX++;
                    break;
                case "VIT":
                    ArgusPyrrhus.VIT++;

            }
            ArgusPyrrhus.zdravi = (5 * ArgusPyrrhus.VIT);
        }
    }

    void hitfast() {
        //critical sance
        float sance = ((float) ArgusPyrrhus.DEX * (0.5f));
        int critical;
        int random = (int) (1 + 100 * Math.random());
        if ((100 - sance) < random) {
            critical = 2;

        } else {
            critical = 1;
        }
        //síla utoku
        ArgusPyrrhus.hit = Math.round((float) (Math.random() * ArgusPyrrhus.STR * (1.1 - 0.2 * Math.random()) * critical)+ArgusPyrrhus.itemdmg);
       System.out.println("Zasahl jsi " + Enemy.enemyName + " za " + ArgusPyrrhus.hit + " bodu zdravi  zbyva mu " + (Enemy.enemyZdravi - ArgusPyrrhus.hit) + " bodu zdravi");
       Enemy.enemyZdravi = (Enemy.enemyZdravi - ArgusPyrrhus.hit);
    }
    void hit() {
        //critical sance
        float sance = ((float) ArgusPyrrhus.DEX * (0.5f));
        int critical;
        int random = (int) (1 + 100 * Math.random());
        if ((100 - 25) > random) {
            if ((100 - sance) < random) {
            critical = 2;

        } else {
            critical = 1;
        }
        ArgusPyrrhus.hit = Math.round((float) (Math.random() * ArgusPyrrhus.STR * (1.4 - 0.2 * Math.random()) * critical)+ArgusPyrrhus.itemdmg);    
         System.out.println("Zasahl jsi " + Enemy.enemyName + " za " + ArgusPyrrhus.hit + " bodu zdravi  zbyva mu " + (Enemy.enemyZdravi - ArgusPyrrhus.hit) + " bodu zdravi");
         Enemy.enemyZdravi = (Enemy.enemyZdravi - ArgusPyrrhus.hit);
        }else {
            System.out.println("netrefil jsi");
        }
        
        //síla utoku
        

    }
    void hithard() {
        //critical sance
        float sance = ((float) ArgusPyrrhus.DEX * (0.5f));
        int critical;
        int random = (int) (1 + 100 * Math.random());
        if ((100 - 50) > random) {
            if ((100 - sance) < random) {
            critical = 2;

        } else {
            critical = 1;
        }
        ArgusPyrrhus.hit = Math.round((float) (Math.random() * ArgusPyrrhus.STR * (2.0 - 0.2 * Math.random()) * critical)+ArgusPyrrhus.itemdmg);    
         System.out.println("Zasahl jsi " + Enemy.enemyName + " za " + ArgusPyrrhus.hit + " bodu zdravi  zbyva mu " + (Enemy.enemyZdravi - ArgusPyrrhus.hit) + " bodu zdravi");
         Enemy.enemyZdravi = (Enemy.enemyZdravi - ArgusPyrrhus.hit);
        }else {
            System.out.println("netrefil jsi");
        }

    }
    void fatality() {
        //critical sance
        float sance = ((float) ArgusPyrrhus.DEX * (0.5f));
        int critical;
        int random = (int) (1 + 100 * Math.random());
        if ((100 - 10) > random) {
            if ((100 - sance) < random) {
            critical = 2;

        } else {
            critical = 1;
        }
        ArgusPyrrhus.hit = Math.round((float) (Math.random() * ArgusPyrrhus.INT * (1.1 - 0.2 * Math.random()) )+ArgusPyrrhus.itemdmg+ArgusPyrrhus.INT);    
         System.out.println("Zasahl jsi " + Enemy.enemyName + " za " + ArgusPyrrhus.hit + " bodu zdravi  zbyva mu " + (Enemy.enemyZdravi - ArgusPyrrhus.hit) + " bodu zdravi");
         Enemy.enemyZdravi = (Enemy.enemyZdravi - ArgusPyrrhus.hit);
        }else {
            System.out.println("netrefil jsi");
        }

    }

    void enemyHit() {
        int enemyCritical;
        float enemySance = ((float) Enemy.enemyDEX * (0.5f));
        int enemyRandom = (int) (1 + 100 * Math.random());
        if ((100 - 10) > enemyRandom) {
        if ((100 - enemySance) < enemyRandom) {
            enemyCritical = 2;

        } else {
            enemyCritical = 1;
        }

        Enemy.enemyHit = Math.round((float) (Math.random() * Enemy.enemySTR * (1.1 - 0.2 * Math.random()) * enemyCritical));
    System.out.println(Enemy.enemyName + " te zasahl za " + Enemy.enemyHit + " bodu zdravi   tve zbyvajici zdravi je " + (ArgusPyrrhus.zdravi - Enemy.enemyHit));
        ArgusPyrrhus.zdravi = (ArgusPyrrhus.zdravi - Enemy.enemyHit);
        }else {
         System.out.println("tvuj protivnik te nezasahl");   
        }
}
}
