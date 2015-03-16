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

    void rozcesti() {
        Utilities utilities = new Utilities();
        Lokace lokace = new Lokace();
        Vstup vstup = new Vstup();
        System.out.println("");
        System.out.println("Rozcesti:");
        System.out.println("1.Nahoru");
        System.out.println("2.Dolu");
        System.out.println("3.Doprava");
        System.out.println("4.Doleva");
        System.out.println("5.Zustat");
        System.out.println("6.Mapa");
        System.out.print("Tvoje volba: ");
        vstup.vstup();
        int x = Integer.valueOf(Vstup.vstup);
        boolean newPosition = false;
        switch (x) {
            case 1:
                heroPos[0]--;
                newPosition=true;
                break;
            case 2:
                heroPos[0]++;
                newPosition=true;
                break;
            case 3:
                heroPos[1]++;
                newPosition=true;
                break;
            case 4:
                heroPos[1]--;
                newPosition=true;
                break;
            case 5:
                
                break;
            case 6:
                mapVision();
                break;
            default:
                System.exit(1);
                break;

        }
        utilities.clearConsole();
        if (newPosition == true){
            lokace.getLocation(Mapa.mapa[Mapa.heroPos[0]][Mapa.heroPos[1]][1]);
        }
                
        
        heroMap[heroPos[0]][heroPos[1]] = "X";
    }

    void mapgen() {

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j][0] = (int) (Math.random() * 5);   //Enemy
                mapa[i][j][1] = (int) (Math.random() * 5);   //Lokace
                heroMap[i][j] = "0";
            }
        }

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
