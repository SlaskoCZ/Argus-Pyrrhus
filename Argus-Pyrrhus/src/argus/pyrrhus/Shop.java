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
        vstup.vstup();
        switch (Integer.valueOf(Vstup.vstup)) {
            case 1:
                cena = 25;
                System.out.println("Opravdu chcete koupit tento item za" + cena + " ?[ano/ne]");
                vstup.vstup();
                switch (Vstup.vstup) {
                    case "ano":
                        if (money - cena > 0) {
                            payment = true;
                            money -= cena;
                            databazeitemu.HP();
                            break;

                        }

                    case "ne":
                        nakup();
                        break;
                }
            case 2:
                cena = 25;
                System.out.println("Opravdu chcete koupit tento item za" + cena + " ?[ano/ne]");
                vstup.vstup();
                switch (Vstup.vstup) {
                    case "ano":
                        if (money - cena > 0) {
                            payment = true;
                            money -= cena;
                            databazeitemu.ID1();
                            break;

                        }

                    case "ne":
                        nakup();
                        break;

                }
        }
    }
}

