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
import java.io.BufferedInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
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

    public String[] shopItemy() throws IOException {
        String path = ("D:\\skola\\Java\\ja\\Argus-Pyrrhus\\Argus-Pyrrhus\\Test_Files\\Test_File.txt");
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int numberOfLines = countLines(path);
        String[] polozky = new String[numberOfLines];
        String line = null;
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
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        int lines = 0;
        while (bufferedReader.readLine().contains("\\")!=true){
            lines++;
        }
        return lines;

    }
}
