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
public class TestPrvocisla {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int cislo = 0;
        System.out.println("Vlož nějaké kladné celé číslo popřípadě 0 ukonči");
        while ((cislo = sc.nextInt()) > 0) {
            boolean prvocislo = true;
            for (int i = 2; i < cislo; i++) {
                if ((cislo % i) == 0) {
                    prvocislo = false;
                }
            }
            if (prvocislo == true) {
                System.out.println("Jedná se o prvočíslo.");
            } else {
                System.out.println("Nejedná se o prvočíslo");
            }

        }

    }
}

