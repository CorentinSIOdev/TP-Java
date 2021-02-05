package com.tp1.Exercices;

import java.util.Scanner;

public class exercice6b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer un chiffre maximum pour votre compteur : ");
        int max = scanner.nextInt();

        for (int i=1; i<= max; i++) {
            System.out.println(i);
        }
    }
}

