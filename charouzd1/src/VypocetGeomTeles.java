
import java.util.Scanner;

        
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip Charouzd
 */
public class VypocetGeomTeles {
    public static void main(String[] args) {

        Scanner Kvadr = new Scanner(System.in);
        Scanner Krychle = new Scanner(System.in);
        Scanner Koule = new Scanner(System.in);
        
        /*Získávání dat od uživatele*/
      System.out.println("zadej strany:");
        
        float Kvadrstrana;
        Kvadrstrana = Kvadr.nextFloat();
        float Kvadry = Kvadr.nextFloat();
        float Kvadrz = Kvadr.nextFloat();
        System.out.println("Strana a je " + Kvadrstrana);
        System.out.println("Strana b je " + Kvadry);
        System.out.println("Strana c je " + Kvadrz);
        
        /*výpočty a výsledky*/
        /*Kvádr*/
        float VKvadru;
            VKvadru = Kvadrstrana * Kvadrz * Kvadry;
        float SKvadru;
            SKvadru = 2 * ((Kvadrz * Kvadry) + (Kvadrstrana * Kvadry) + (Kvadrz * Kvadrstrana));
        System.out.println("objem je: " + VKvadru);  
        System.out.println("povrch je: " + SKvadru);
       
        /*Krychle*/
        double VKrychle;
            VKrychle = Math.cbrt(VKvadru);
        System.out.println("Aby byl stejný objem Krychle jako Kvádru Strana krychle by musela být " + VKrychle);  
        double SKrychle;
            SKrychle = Math.sqrt(SKvadru / 6 );
        System.out.println("Pokud mají být stejné povrchy tak strana krychle by byla: " + SKrychle);
        
        /*Koule*/
        double VKoule;
            VKoule = Math.cbrt((VKvadru * Math.PI *3)/4);
        System.out.println("Aby byl stejný objem poloměr koule by musel být " + VKoule); 
        float SKoule;
            SKoule = (float) Math.sqrt((SKvadru) /( Math.PI * 4));
        System.out.println("Pokud mají být stejné povrchy tak poloměr koule by byla:: " + SKoule);
        
        /*Čtyřstěn*/
        double Objem;
            Objem = Math.cbrt((VKvadru * 12) / Math.sqrt(2));
        System.out.println("Aby byl stejný objem strana čtyřstěnu by musela být " + Objem);
        double Povrch;
            Povrch = Math.sqrt(SKvadru / Math.sqrt(3));
        System.out.println("Pokud mají být stejné povrchy tak strana čtyřstěnu by byla:: " + Povrch);
           
        
}
}