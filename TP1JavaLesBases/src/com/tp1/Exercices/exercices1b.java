package com.tp1.Exercices;

import javax.swing.*;
import java.util.Scanner;

public class exercices1b {
    public static void main(String[] arg) {
        int somme = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer votre nombre entier premier");
        int nb1 = scanner.nextInt();

        System.out.println("Entrer votre nombre entier dernier");
        int nb2 = scanner.nextInt();

        somme=nb1+nb2;

        System.out.println("La somme des deux valeurs est : " +somme);

        int difference, produit, quotient;

        difference= nb1 - nb2;

        System.out.println("La différence des deux valeurs est : " +difference);

        produit= nb1 * nb2;

        System.out.println("Le produit des deux valeurs est : " +produit);

        quotient= nb1 / nb2;

        System.out.println("Le quotient des deux valeurs est : " +quotient);


    }

}
