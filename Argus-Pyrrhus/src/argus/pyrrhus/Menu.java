/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;

import static argus.pyrrhus.ArgusPyrrhus.obtiznost;
import static argus.pyrrhus.Mapa.heroPos;
import java.io.IOException;

/**
 *
 * @author Slasko
 */
public class Menu {

    Mapa mapa;
    Vstup vstup;
    Utilities utilities;
    Lokace lokace;
    Shop shop;
    Souboj souboj;
    Enemy enemy;
    Zobrazeni zobrazeni;

    public Menu() {
        this.zobrazeni = new Zobrazeni();
        this.enemy = new Enemy();
        this.souboj = new Souboj();
        this.shop = new Shop();
        this.lokace = new Lokace();
        this.utilities = new Utilities();
        this.vstup = new Vstup();
        this.mapa = new Mapa();
    }

    //Hlavni menu
    void hlavniMenu() throws IOException {
        System.out.println("0. Testovaci Rezim ");
        System.out.println("1. Mapa ");
        System.out.println("2. Shop ");
        System.out.println("3. Rychly Souboj");
        System.out.println("4. Charakter");
        System.out.println("5.Ukoncit");
        System.out.print("Tvoje volba: ");
        vstup.vstup();
        utilities.clearConsole();
        switch (Integer.valueOf(Vstup.vstup)) {
            case 0:
                System.out.println("Testovaci rezim");
                ArgusPyrrhus.STR = 100;
                ArgusPyrrhus.DEX = 100;
                ArgusPyrrhus.INT = 100;
                ArgusPyrrhus.VIT = 100;
                ArgusPyrrhus.money = 2000000;
                ArgusPyrrhus.zdravi = 5*ArgusPyrrhus.VIT;
                break;
            case 1:
                rozcesti();
                break;
            case 2:
                shop.nakup();
                break;
            case 3:
                enemy.getEnemy((int) (Math.round(Math.random() * 4 + 1)));
                souboj.Boj();
                break;
            case 4:
                zobrazeni.Hrdina();
                break;
            case 5:
                System.exit(1);
                break;
            default:
                hlavniMenu();
                break;
        }
        System.in.read();
        utilities.clearConsole();
        hlavniMenu();
    }

    //Rozcesti od 1. Mapa
    void rozcesti() throws IOException {
        System.out.println("");
        System.out.println("Rozcesti(pouzivejte pouze cisla):");
        System.out.println("1.Nahoru");
        System.out.println("2.Dolu");
        System.out.println("3.Doprava");
        System.out.println("4.Doleva");
        System.out.println("5.Zpet do menu");
        System.out.println("6.Vypis mapya");
        System.out.println("7.Shop");
        System.out.print("Tvoje volba: ");
        vstup.vstup();
        int x = Integer.valueOf(Vstup.vstup);
        boolean newPosition = false;
        switch (x) {
            case 1:
                heroPos[0]--;
                newPosition = true;
                break;
            case 2:
                heroPos[0]++;
                newPosition = true;
                break;
            case 3:
                heroPos[1]++;
                newPosition = true;
                break;
            case 4:
                heroPos[1]--;
                newPosition = true;
                break;
            case 5:
                hlavniMenu();
                break;
            case 6:
                mapa.mapVision();
                break;
            case 7:
                shop.nakup();
                break;
            default:
                System.out.println("Nezpravne udaje");
                shop.nakup();
                break;

        }
        if (newPosition == true) {
            Mapa.heroMap[heroPos[0]][heroPos[1]] = "X";
        }
    }

    void obtiznost() {
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
    }
}
