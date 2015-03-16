/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;

import static argus.pyrrhus.ArgusPyrrhus.money;

/**
 *
 * @author Karel
 */
public class Shop {

    Vstup vstup = new Vstup();
    Databazeitemu databazeitemu = new Databazeitemu();
    int vyber;
    int cena;

    public static Boolean payment;

    void nakup() {
        System.out.println("Obchod");
        System.out.println("1. HP lektvar");
        System.out.println("2. zelezna dyka");
        System.out.println("3. Zelezne kladivo");
        System.out.println("4. Dvojrucni mec");
        System.out.println("5. Cerne kopi");
        System.out.println("6. Obchodnikuv stary mec");
        System.out.println("7. Slavna skryta cepel");
        vstup.vstup();
        switch (Integer.valueOf(Vstup.vstup)) {
            case 1:
                databazeitemu.HP();
                cena = 25;
                System.out.println("Opravdu chcete koupit "+Databazeitemu.name+" za " + cena + " ?[ano/ne]");
                vstup.vstup();
                switch (Vstup.vstup) {
                    case "ano":
                        if (money - cena > 0) {
                            payment = true;
                            money -= cena;
                            databazeitemu.HP();
                            System.out.println("Predmet zakoupen");
                            break;

                        }

                    default :
                        nakup();
                        break;
                }
            case 2:
                databazeitemu.ID1();
                cena = 200;
               System.out.println("Opravdu chcete koupit "+Databazeitemu.name+" za " + cena + " ?[ano/ne]");
                vstup.vstup();
                switch (Vstup.vstup) {
                    case "ano":
                        if (money - cena > 0) {
                            payment = true;
                            money -= cena;
                            databazeitemu.ID1();
                            System.out.println("Predmet zakoupen");
                            break;

                        }

                    default :
                        nakup();
                        break;

                }
            case 3:
                databazeitemu.ID2();
                cena = 300;
               System.out.println("Opravdu chcete koupit "+Databazeitemu.name+" za " + cena + " ?[ano/ne]");
                vstup.vstup();
                switch (Vstup.vstup) {
                    case "ano":
                        if (money - cena > 0) {
                            payment = true;
                            money -= cena;
                            databazeitemu.ID1();
                            System.out.println("Predmet zakoupen");
                            break;

                        }

                    default :
                        nakup();
                        break;

                }
            case 4:
                databazeitemu.ID3();
                cena = 500;
               System.out.println("Opravdu chcete koupit "+Databazeitemu.name+" za " + cena + " ?[ano/ne]");
                vstup.vstup();
                switch (Vstup.vstup) {
                    case "ano":
                        if (money - cena > 0) {
                            payment = true;
                            money -= cena;
                            databazeitemu.ID1();
                            System.out.println("Predmet zakoupen");
                            break;

                        }

                    default :
                        nakup();
                        break;

                }
            case 5:
                databazeitemu.ID4();
                cena = 750;
               System.out.println("Opravdu chcete koupit "+Databazeitemu.name+" za " + cena + " ?[ano/ne]");
                vstup.vstup();
                switch (Vstup.vstup) {
                    case "ano":
                        if (money - cena > 0) {
                            payment = true;
                            money -= cena;
                            databazeitemu.ID1();
                            System.out.println("Predmet zakoupen");
                            break;

                        }

                    default :
                        nakup();
                        break;

                }
            case 6:
                databazeitemu.ID5();
                cena = 1500;
               System.out.println("Opravdu chcete koupit "+Databazeitemu.name+" za " + cena + " ?[ano/ne]");
                vstup.vstup();
                switch (Vstup.vstup) {
                    case "ano":
                        if (money - cena > 0) {
                            payment = true;
                            money -= cena;
                            databazeitemu.ID1();
                            System.out.println("Predmet zakoupen");
                            break;

                        }

                    default :
                        nakup();
                        break;

                }
            case 7:
                databazeitemu.ID6();
                cena = 5000;
              System.out.println("Opravdu chcete koupit "+Databazeitemu.name+" za " + cena + " ?[ano/ne]");
                vstup.vstup();
                switch (Vstup.vstup) {
                    case "ano":
                        if (money - cena > 0) {
                            payment = true;
                            money -= cena;
                            databazeitemu.ID1();
                            System.out.println("Predmet zakoupen");
                            break;

                        }

                    default :
                        nakup();
                        break;

                }
        }
    }
}

