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
        int[][][] mapa = new int[25][25][2];
        for (int i=0; i<mapa.length; i++){
            for (int j=0;j<mapa[i].length; j++){
                for (int h=0;h<mapa[i][j].length; h++){
                  mapa[i][j][0]=(int)Math.random()+1;
                  
                    
                    
                    
                    
                }
            }
        }
        
    }
}
