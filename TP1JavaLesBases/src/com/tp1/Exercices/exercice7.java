package com.tp1.Exercices;

import java.util.Scanner;

public class exercice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer un chiffre : ");
        int chiffre = scanner.nextInt();

        if ( chiffre % 2 == 0) {
            System.out.println("Le nombre est pair");
        } else {
            System.out.println("Le nombre est impair");
        }

    }
}
