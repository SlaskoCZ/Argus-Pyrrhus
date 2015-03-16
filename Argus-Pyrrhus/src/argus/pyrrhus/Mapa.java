/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;

/**
 *
 * @author Slasko
 */
public class Mapa {

    public static int[][][] mapa = new int[25][25][3];
    public static String[][] heroMap = new String[25][25];
    public static int[] heroPos = new int[2];

    

    void mapgen() {

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j][0] = (int) (Math.random() * 5);   //Enemy
                mapa[i][j][1] = (int) (Math.random() * 5);   //Lokace
                heroMap[i][j] = "0";
                
            }
        }
        heroMap[13][13] = "X";
        heroPos[0] = 13;
        heroPos[1] = 13;
    }

    void mapVision() {
        for (int i = 0; i < 25; i++) {
            System.out.println("");
            for (int j = 0; j < 25; j++) {
                System.out.print("[" + heroMap[i][j] + "]");

            }
        }

    }
}
