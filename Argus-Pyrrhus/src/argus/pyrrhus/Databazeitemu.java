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
public class Databazeitemu {

    public static String name;
//kupovatelne

    void HP() {
        name = "lektvar zdravi";
        if (Shop.payment == true) {
            ArgusPyrrhus.zdravi = (5 * ArgusPyrrhus.VIT);
            Shop.payment = false;

        }
    }

    void ID1() {
        name = "Zelezna dyka, dex+1,dmg+1";
        if (Shop.payment == true) {
            ArgusPyrrhus.itemstr = 0;
            ArgusPyrrhus.itemdex = 1;
            ArgusPyrrhus.itemvit = 0;
            ArgusPyrrhus.itemdmg = 1;
            Shop.payment = false;

        }

    }

    void ID2() {
        name = "Zelezne kladivo, str+2,dmg+1";
        if (Shop.payment == true) {
            ArgusPyrrhus.itemstr = 2;
            ArgusPyrrhus.itemdex = 0;
            ArgusPyrrhus.itemvit = 0;
            ArgusPyrrhus.itemdmg = 1;
            Shop.payment = false;
        }
    }

    void ID3() {
        name = "Dvojrucni mec, str+2,dex+1,dmg+2";
        if (Shop.payment == true) {
            ArgusPyrrhus.itemstr = 2;
            ArgusPyrrhus.itemdex = 1;
            ArgusPyrrhus.itemvit = 0;
            ArgusPyrrhus.itemdmg = 2;
            Shop.payment = false;
        }
    }

    void ID4() {
        name = "Cerne kopi, dex+7,dmg+4";
        if (Shop.payment == true) {
            ArgusPyrrhus.itemstr = 2;
            ArgusPyrrhus.itemdex = 0;
            ArgusPyrrhus.itemvit = 0;
            ArgusPyrrhus.itemdmg = 1;
            Shop.payment = false;

        }
    }

    void ID5() {
        name = "Obchodnikuv stary mec, str+3,dex+2,vit+3,dmg+5";
        if (Shop.payment == true) {
            ArgusPyrrhus.itemstr = 2;
            ArgusPyrrhus.itemdex = 0;
            ArgusPyrrhus.itemvit = 0;
            ArgusPyrrhus.itemdmg = 1;
            Shop.payment = false;
        }
    }

    void ID6() {
        name = "Slavna skryta cepel, dex+20,dmg+8";
        if (Shop.payment == true) {
            ArgusPyrrhus.itemstr = 2;
            ArgusPyrrhus.itemdex = 0;
            ArgusPyrrhus.itemvit = 0;
            ArgusPyrrhus.itemdmg = 1;
            Shop.payment = false;
        }
    }
//dropnutelne 
}
