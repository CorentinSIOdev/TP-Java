package TP2Java.exercice;

import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dessin de figure géométrique");
        System.out.println();
        System.out.println(+1+" Carré");
        System.out.println(+2+" Triangle");
        System.out.println(+3+" Pyramide");
        System.out.println(+4+" Quitter");
        System.out.println();
        System.out.println("Tapez le numéro de votre choix :");
        int numero = scanner.nextInt();

        if (numero == 1) {
            System.out.println("Vous avez choisis le Carré");
            System.out.println("Définissez la taille de votre Carré :");
            int carré = scanner.nextInt();

            System.out.println("Voici votre Carré");
            for (int i=0; i <carré ; i++)
            {
                System.out.print("  ");
                for(int j=0; j<= carré ; j++)
                    System.out.print("*");
                {
                    System.out.println("*");
                }

            }

        } else if (numero == 2) {
            System.out.println("Vous avez choisis le Triangle");
            System.out.println("Définissez la taille de votre Triangle :");
            int triangle = scanner.nextInt();

            System.out.println("Voici votre Triangle");
            for (int i = 0; i < triangle; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println(" ");
            }

        } else if (numero == 3) {
            System.out.println("Vous avez choisis la pyramide");
            System.out.println("Définissez la taille de votre Pyramide :");
            int pyramide = scanner.nextInt();

            System.out.println("Voici votre Pyramide");
            for (int i = 0; i < pyramide; i++) {
                for (int j = 0; j < pyramide - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        } else if (numero == 4) {
            System.out.println("Vous avez choisis de quitter");
            System.out.println("A Bientôt !");
            System.exit(0);
        }
    }
}
