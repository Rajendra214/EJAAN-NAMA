/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author NITRO V 15
 */
public class tugas9 {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String nama = scanner.nextLine();

        System.out.println("\nEjaan untuk \"" + nama + "\" adalah :");

        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
    }
}


