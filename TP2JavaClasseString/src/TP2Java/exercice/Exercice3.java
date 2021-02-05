package TP2Java.exercice;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez un mot");
        String mots = sc.nextLine();
        char lettre = mots.charAt(0);
        System.out.println("La première lettre de votre mot est : " +lettre);
        char lettre2 = mots.charAt(mots.length()-1);
        System.out.println("La dernière lettre de votre mot est : " +lettre2);
        System.out.println(
                "Il y a " + mots.length() + " lettres dans le mot " + mots );
    }
}
