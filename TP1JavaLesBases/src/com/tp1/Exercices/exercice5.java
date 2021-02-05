package com.tp1.Exercices;

import java.util.Scanner;

public class exercice5 {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez une quantité : ");
        int quantite = scanner.nextInt();
        int somme = 10;
        int somme2 = 135;
        int somme3 = 110;

        if (quantite <= 10) {
            System.out.println("Un article coûte 10€");
        } else if ((quantite >= 10) && (quantite <= 49)) {
            System.out.println("Un article coûte 135€");
        } else if (quantite > 49) {
            System.out.println("Un article coûte 110€");
        }
        if (quantite <= 10) {
            System.out.println("Le tout vous feras " +quantite*+somme+ "€");
        } else if ((quantite >= 10) && (quantite <= 49)) {
            System.out.println("Le tout vous feras " +quantite*+somme2+ "€");
        } else if (quantite > 49) {
            System.out.println("Le tout vous feras " +quantite*+somme3+ "€");
        }
    }
}
