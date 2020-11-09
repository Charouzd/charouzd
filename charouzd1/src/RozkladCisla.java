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
public class RozkladCisla {

    /**
     * @param args the command line arguments
     */
     private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    System.out.print("0 ukončí program jinak zadávej kladná celá čísla: ");
    long Cislo;
    while((Cislo = sc.nextLong()) > 0){
        System.out.print(Cislo + " = ");
            for(int i = 2; i< Cislo; i++) {
                
              while(Cislo % i == 0) {
                System.out.print(i+" * ");
                Cislo = Cislo / i;
         }
      }
        if(Cislo >= 2) {
         System.out.print(Cislo);
         System.out.println("");
        System.out.println("Zadejte další  číslo ");
}
    }
}

}