/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasMethod;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class penghitung {
    public static void main(String [] args ){
        
        Scanner userInput = new Scanner(System.in);
        
        int Penjumlahan;
        double Pengurangan;
        int Perkalian;
        double Pembagian;
        
        calculator kalkulator = new calculator();
        
        System.out.println("=== Penjumlahan ===");
        System.out.println("masukkan nilai : ");
        Penjumlahan = kalkulator.getPenjumlahan(userInput.nextInt(), userInput.nextInt());
        System.out.println("hasil penjumlahan adalah "+ Penjumlahan);
        
        System.out.println("=== Pengurangan ===");
        System.out.println("masukkan nilai : ");
        Pengurangan = kalkulator.getPengurangan(userInput.nextInt(), userInput.nextInt());
        System.out.println("hasil pengurangan adalah "+ Pengurangan);
        
        System.out.println("=== Perkalian ===");
        System.out.println("masukkan nilai : ");
        Perkalian = kalkulator.getPerkalian(userInput.nextInt(), userInput.nextInt());
        System.out.println("hasil perkalian adalah "+ Perkalian);
        
        System.out.println("=== Pembagian ===");
        System.out.println("masukkan nilai : ");
        Pembagian = kalkulator.getPembagian(userInput.nextInt(), userInput.nextInt());
        System.out.println("hasil pembagian adalah "+ Pembagian);
    }
}
