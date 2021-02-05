package com.tp1.Exercices;

import java.util.Scanner;

public class exercice9 {
    public static void  main(String[] args) {
        Label:
        do {
            Scanner scanner = new Scanner(System.in);
            int nbAleatoire = (int) (Math.random() * 10 + 1);
            System.out.println("Trouver le nombre aléatoire tirer entre 1 & 10 : ");
            int aleatoire = scanner.nextInt();
            int i;
            int essai;
            essai=0;
            for (i = 1; i <= 1; i++) {
                essai = essai + 1;
                System.out.println("Le nombre aléatoire valide est : " + nbAleatoire);
                if ((nbAleatoire == aleatoire)) {
                        System.out.println("Felicitations, c'était bien " + nbAleatoire + " qu'il fallait trouver !");
                        System.out.println("Tu as trouvé " + aleatoire + " en " + essai + " essais");
                    } else {
                        System.out.println("Vous n'avez pas trouvé le bon nombre.");
                    }
                }
                if ((nbAleatoire > aleatoire) || (nbAleatoire < aleatoire)) continue Label;
                else if ((nbAleatoire == aleatoire)) break Label;
            }
            while (true) ;
        }
    }


