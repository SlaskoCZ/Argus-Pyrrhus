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
    public static String[][] heroMap= new String [25][25];
    void rozcesti(){
        int x = Integer.valueOf(Vstup.vstup);
        switch (x){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
                
        }
    }
    void mapgen(){
        
        for (int i=0;i<mapa.length;i++) {
            for (int j=0;j<mapa[i].length;j++) {
                mapa[i][j][0] = (int)(Math.random()*5+1);
                mapa[i][j][1] = (int)(Math.random()*5+1);
                heroMap[i][j]="0";
            }
        }
        
    }
    void mapVision(){
        for (int i=0;i<25;i++) {
            System.out.println("test");
            for (int j=0;j<25;j++) {
                System.out.print("[" + heroMap[i][j] + "]");

                
            }
        }
        
    }
}
