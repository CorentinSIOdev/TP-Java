package com.tp1.Exercices;

import java.util.Scanner;

public class exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer un numéro entre 75 & 94: ");
        int departement = scanner.nextInt();

        if(departement == 75) {
            System.out.println("Vous êtes à Paris ");
        } else if (departement == 77){
            System.out.println("Vous êtes en Seine-et-Marne");
        } else if (departement == 78) {
            System.out.println("Vous êtes dans les Yvelines");
        } else if (departement == 91) {
            System.out.println("Vous êtes dans l'Essonne");
        } else if (departement == 92) {
            System.out.println("Vous êtes en Hauts-de-Seine");
        } else if (departement == 93) {
            System.out.println("Vous êtes en Seine-Saint-Denis");
        } else if (departement == 94) {
            System.out.println("Vous êtes en Val-de-Marne");
        } else if ((departement >= 1) || (departement < 75)|| (departement == 76) || (departement > 79) || (departement < 91) || (departement > 94)) {
            System.out.println("Vous n'êtes dans aucun département, veuillez saisir un autre numéro");
        }
    }
}
