/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charouzd;

import java.util.Scanner;

/**
 *
 * @author Filip Charouzd
 */
public class TestDokonalehoCisla {

    /**
     * @param args the command line arguments
     */
       private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("Vlož celé kladné číslo o kterém se domníváš že je dokonalé:  ");
              System.out.println("Popřípadě ukonči 0");

        long cislo;

        while ((cislo = sc.nextLong()) > 0) {

            long Delitel = 1;
            long Delitele = 0;

            while (Delitel <= cislo / 2) {
                if ((cislo % Delitel) == 0) {
                    Delitele += Delitel;
                }
                Delitel =Delitel + 1;
            }

            boolean Dokonalost = (Delitele == cislo);
            if (Dokonalost == true){
                System.out.println("Čislo je dokonale");
            }else{
            System.out.println("Čislo není dokonale");
            }
        
        }
    
}
}
