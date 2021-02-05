package com.tp1.Exercices;

import java.util.Scanner;

public class exercice2
    {
        public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer votre age: ");
        int age = scanner.nextInt();

        {
            if(age <= 26)
            {
                System.out.println("Vous avez le droit au tarif réduit");
            }
            else
            {
                System.out.println("Vous n'avez pas le droit au tarif réduit");
            }
        }
    }
}
