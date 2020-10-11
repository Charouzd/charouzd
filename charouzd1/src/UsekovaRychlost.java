
import java.util.Scanner;

/**
 *
 * @author Filip Charouzd
 */
public class UsekovaRychlost {

    /**
     * @param args the command line arguments
     */
 

    public static void main(String[] args) {
        Scanner MaxRychlost = new Scanner(System.in);
        Scanner Cas = new Scanner(System.in);
        Scanner Delka = new Scanner(System.in);
        
        /*Získávání dat od uživatele*/
        System.out.println("zadej maximalní rychlost:");
        int Maxrychlost = MaxRychlost.nextInt();
        
        System.out.println("zadej délku výseče v kilometrech:");        
        float d ;
        d = (float) Delka.nextDouble();
        
        System.out.println("zadej čas, který auto strávilo v úseku: (HH:MM:SS)");
        int hodiny = Cas.nextInt();        
        int minuty = Cas.nextInt();      
        int sekundy = Cas.nextInt();
        
        /* přepočet na hodiny*/
        int mint;
            mint = 60;  
            
        float minutes;
             minutes = (float) minuty / mint;  
             
        float sec;
                sec = (float) sekundy / 3600;
                
        double cas;
                cas = hodiny + minutes + sec;   
        /*výpočet rychlosti a rozdílu od limitu*/
        float v;
        System.out.println("Jel to " + cas + "hodin");
         
        v = (float) (d/cas);
        float rozdil;
        rozdil = (float) v - Maxrychlost;
        /*výsledek*/
         System.out.println("výsledná rychlost je " + v);
         System.out.println("rychlost překročil o " + rozdil);
         
         if (rozdil <= 0){
             System.out.println("rychlost je v pořádku");
         }  else if (rozdil <= 5 ){
             System.out.println("pokuta od 1000Kč do 2500kč");
         } else if(rozdil < 20) {
             System.out.println("pokuta od 1000Kč do 2500kč a ztráta 2 bodů" );
        } else if(rozdil < 40){
        System.out.println("pokuta od 2500Kč do 5000kč a ztráta 3 bodů");
        } else {
        System.out.println("pokuta od 5000Kč do 10 000kč a zákaz řízení až na 12 měsíců");
        }
       
        
         
    }
    
}
