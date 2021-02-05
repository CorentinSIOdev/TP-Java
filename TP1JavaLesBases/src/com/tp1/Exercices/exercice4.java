package com.tp1.Exercices;

import java.util.Scanner;

public class exercice4 {
    public static void  main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer votre premier nombre");
        int a = scanner.nextInt();
        System.out.println("Entrer votre deuxième nombre");
        int b = scanner.nextInt();

        if((a>0 && b>0) || (a<0 && b<0)) {
            System.out.println("chiffre 1 --> " +a);
            System.out.println("chiffre 2 --> " +b);
            System.out.println("Positif");
        } else if((a>0 && b<0) || (a<0 && b>0)) {
            System.out.println("chiffre 1 --> " +a);
            System.out.println("chiffre 2 --> " +b);
            System.out.println("Negatif");
        }

    }
}
