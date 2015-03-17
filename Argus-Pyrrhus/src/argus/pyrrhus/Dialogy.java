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
public class Dialogy {
    Vstup vstup = new Vstup();
    
    void dg1od1 (){
        vstup.vstup();
                switch (Vstup.vstup) {
                    case "Blazen":
                        System.out.println("No kazdy je tak trochu blazen ne? Ale ty se vymykas normalu.");
                        System.out.println("Popreju ti alespon hodne stesti a rychle se vzdalim nez me tu neco sezere.");
                            break;   
                    case "Sebevrah":
                        System.out.println("Na sebevrazdu jsou lepsi mista. Tady zemres hroznou smrti kterou si ani nedovedu predstavit.");
                        System.out.println("Ale aspon te nikdo nenajde. Radsi se rychle se vzdalim nez me tu neco sezere.");
                            break; 
                    case "Zvedavy clovek":
                        System.out.println("Mozna zvedavej ale uplne blbej. Tady tak akorat chcipnes.");
                        System.out.println("Doufam ze mas vic stesti nez rozumu. Radsi se rychle se vzdalim nez me tu neco sezere.");
                            break;
                    case "Neotravuj!":
                        System.out.println("Ty asi nemas moc kamaradu co?");
                        System.out.println("Popral bych ti hodne stesti ale to bych lhal. Radsi se rychle se vzdalim nez me tu neco sezere.");
                            break; 
                    default:System.out.println("Coze jsi rikal?");
                    dg1od1();
                        break;
    }
}





}
