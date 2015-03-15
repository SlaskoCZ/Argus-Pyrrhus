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
    public static int[][][] mapa = new int[25][25][2];
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
        
        for (int i=0; i<mapa.length; i++){
            for (int j=0;j<mapa[i].length; j++){
                  mapa[i][j][0]=(int)Math.random()+1;
                  
                    
                    
                    
                    
                  
            }
        }
        
    }
    void mapVision(){
        
        for (int i=0; i<mapa.length; i++){
            System.out.println("");
            for (int j=0;j<mapa[i].length; j++){
                    System.out.print("["+mapa[i][j][0]+"]");
                  
                    
                    
                    
                    
                }
            
        }
        
    }
}
