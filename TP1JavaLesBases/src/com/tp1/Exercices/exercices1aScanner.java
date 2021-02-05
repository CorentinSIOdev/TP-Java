package com.tp1.Exercices;

import java.util.Scanner;

public class exercices1aScanner {
    public static void  main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Entrer votre nom");
        String nom = scanner.next();

        System.out.println("Bonjour " + nom) ;

    }
}
