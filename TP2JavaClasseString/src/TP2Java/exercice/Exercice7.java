package TP2Java.exercice;

import java.util.Scanner;

public class Exercice7 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]) {
        System.out.print("Entrez un mot palindrome : ");
        String original = scanner.nextLine();

        // On convertit l'original en minuscules pour éviter
        // les problèmes de casse:
        String mot = original.toLowerCase();

        // On ne garde que les caractères alphabétiques
        String allowedList = "abcdefghijklmnopqrstuvwxyz";
        String temp = "";
        for (int i = 0; i < mot.length(); i++) {
            char c = mot.charAt(i);
            if (allowedList.indexOf(c) != -1) {
                temp += c;
            }
        }
        mot = temp;

        // On teste si mot2 est un palindrôme
        int leftPos = 0;
        int rightPos = mot.length() - 1;
        boolean palindrome=true;
        while ((leftPos < rightPos) && palindrome) {
            if (mot.charAt(leftPos) != mot.charAt(rightPos)) {
                palindrome=false;
            }
            leftPos++;
            rightPos--;
        }

        if (palindrome) {
            System.out.println("Ce mot est un palindrôme !");
        } else {
            System.out.println("Non, ce mot n'est pas un palindrôme.");
        }
    }
}