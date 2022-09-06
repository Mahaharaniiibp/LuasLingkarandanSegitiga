
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class luaslingkarandansegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, L;
        final double phi = 3.14;
       
        System.out.println("Menghitung luas lingkaran");
        System.out.print("Masukan jarijari = "); 
        r = input.nextDouble();
        
        L = phi * r * r;
        
        System.out.println("luas lingkaran :"+L);
    }
}
