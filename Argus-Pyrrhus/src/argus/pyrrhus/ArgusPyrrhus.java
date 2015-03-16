/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;

import java.io.IOException;

/**
 * @author Ssaruman
 * @author Slasko
 */
public class ArgusPyrrhus {

    public static String name;
    public static int STR;
    public static int INT;
    public static int DEX;
    public static int VIT;
    public static int LVL;
    public static int EXP;
    public static int zdravi;
    public static int hit;
    public static int money;
    public static int itemstr;
    public static int itemdex;
    public static int itemvit;
    public static int itemdmg;
    public static double obtiznost;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        Vstup vstup = new Vstup();
        Zobrazeni zobrazeni = new Zobrazeni();
        Utilities utilities = new Utilities();
        Lokace lokace = new Lokace();
        Souboj souboj = new Souboj();
        Mapa mapa = new Mapa();
        Enemy enemy = new Enemy();
        int i = 0;
        //Mapgen
        mapa.mapgen();

        //Staty
        vstup.stats();

        //Jmeno
        vstup.name();
        //Obtiznost
        System.out.println("Obtiznost (Easy,Normal,Hard,Impossible)");
        System.out.print("Zadej obtiznost: ");
        vstup.vstup();
        switch (Vstup.vstup) {
            case "Easy":
                obtiznost = 0.5;
                break;
            case "Normal":
                obtiznost = 1;
                break;
            case "Hard":
                obtiznost = 1.5;
                break;
            case "Impossible":
                obtiznost = 2;
                break;
            case "Test":
                obtiznost = 0.1;
                break;
            default:
                obtiznost = 1;
                break;
        }
        //Pozice
        Mapa.heroMap[13][13] = "X";
        Mapa.heroPos[0] = 13;
        Mapa.heroPos[1] = 13;
        // Vypis do konzole
        mapa.mapVision();
        utilities.clearConsole();
        System.out.println("Zmackni enter a najdes si soupere");
        System.in.read();
        while (true) {
            mapa.rozcesti();
            
            vstup.vstup();
            switch (Integer.valueOf(Vstup.vstup)){
                case 1:
                    System.out.println("Neni hotovo");
                    break;
                case 2:
                    souboj.Boj();
                    break;
                case 3:
                    System.out.println("Odchazim ...");
                    break;
            }
            Thread.sleep(1000);
            utilities.clearConsole();
        }
//        while (zdravi > 0) {
//            enemy.getEnemy();
//            souboj.Boj();
//            zobrazeni.Hrdina();
//
//            System.out.println("Dalsi souboj? Zmackni enter");
//            System.in.read();
//        }

    }

}
