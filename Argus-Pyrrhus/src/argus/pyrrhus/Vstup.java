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
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
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
        STR = 10 + ArgusPyrrhus.itemstr;
        DEX = 10 + ArgusPyrrhus.itemdex;
        INT = 10;
        VIT = 10 + ArgusPyrrhus.itemvit;
        LVL = 1;
        EXP = 0;
        zdravi = VIT * 5;
        money = 100;
    }

    void vstup() {
        Scanner user_input;
        user_input = new Scanner(System.in);
        vstup = user_input.next();

    }
    private final static Charset ENCODING = StandardCharsets.UTF_8;

    public String[] shopItemy() throws IOException, URISyntaxException {
        String fileName ="ShopItems.ap";
        //Path rootPath = Paths.get("\\Argus-Pyrrhus\\Argus-Pyrrhus");
        String dir = System.getProperty("user.dir");
        String path = (dir+"\\src\\argus\\pyrrhus\\FileHolder\\"+fileName);
        System.out.println(path);
        System.in.read();
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int numberOfLines = countLines(path);
        String[] polozky = new String[numberOfLines];
        int j = 0;
        int nOfIt = 0;
        for (int i = 0; i < numberOfLines; i++) {
            polozky[j] = bufferedReader.readLine();

            if (polozky[j].contains("##")) {
                j--;
            } else {
                nOfIt++;
            }
            j++;

        }
        for (int i = 0; i < nOfIt; i++) {
            System.out.println(polozky[i]);
        }
        return null;
    }

    private static int countLines(String path) throws IOException {
        int lines;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            lines = 0;
            while (bufferedReader.readLine() != null) {
                lines++;
                System.out.println(lines);
            }
        }
        return lines;

    }
}
