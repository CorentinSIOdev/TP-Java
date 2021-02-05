package com.tp1.Exercices;

import java.util.Scanner;

public class exercice8b {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer un premier multiple");
        int multiple1 = scanner.nextInt();
        System.out.println("Entrer un deuxième multiple");
        int multiple2 = scanner.nextInt();

        for (int i=multiple1; i<=multiple2; i+=multiple1) {
            System.out.println(i);
        }
    }
}
