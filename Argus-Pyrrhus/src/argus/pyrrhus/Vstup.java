/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;

import static argus.pyrrhus.ArgusPyrrhus.money;
import static argus.pyrrhus.ArgusPyrrhus.zdravi;
import static argus.pyrrhus.ArgusPyrrhus.DEX;
import static argus.pyrrhus.ArgusPyrrhus.INT;
import static argus.pyrrhus.ArgusPyrrhus.STR;
import static argus.pyrrhus.ArgusPyrrhus.VIT;
import static argus.pyrrhus.ArgusPyrrhus.LVL;
import static argus.pyrrhus.ArgusPyrrhus.EXP;
import static argus.pyrrhus.ArgusPyrrhus.name;
import java.util.Scanner;

/**
 *
 * @author Slasko
 */
public class Vstup {

    public static String vstup;
    

    void name() {
        Scanner user_input;
        user_input = new Scanner(System.in);
        //Jmeno
        System.out.println("Zadej jmmeno hrdiny!");
        name = user_input.next();

    }

    void stats() {
        STR = 10+ArgusPyrrhus.itemstr;
        DEX = 10+ArgusPyrrhus.itemdex;
        INT = 10;
        VIT = 10+ArgusPyrrhus.itemvit;
        LVL = 1;
        EXP = 0;
        zdravi = VIT * 5;
        money = 100;
    }

    void vstup() {
        Scanner user_input;
        user_input = new Scanner(System.in);
        vstup = user_input.next();

   
}}
