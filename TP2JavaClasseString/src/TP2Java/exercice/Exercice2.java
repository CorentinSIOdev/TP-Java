package TP2Java.exercice;

import java.util.Scanner;

public class Exercice2 {
        public static void main(String[] arg){

            Scanner sc = new Scanner(System.in);

            System.out.println("Saisissez une chaine de caractères");
            String chaine = sc.nextLine();

            System.out.println(
                    "Il y a " + chaine.length() + " caractères dans la chaîne " + chaine );

            if (chaine.length()<20) {
                System.out.println("Ceci est une petite chaîne de caractères");
            } else if (chaine.length()>20 && chaine.length()<50) {
                System.out.println("Ceci est une moyenne chaîne de caractères");
            } else if (chaine.length()>50) {
                System.out.println("Ceci est une longue chaîne de caractères");
            }
    }
}
