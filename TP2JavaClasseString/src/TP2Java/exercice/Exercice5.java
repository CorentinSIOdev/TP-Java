package TP2Java.exercice;

import javax.swing.*;
import java.util.Scanner;

public class Exercice5 {
    public static void  main(String[] args) {
        String phrase = JOptionPane.showInputDialog(null,"Entrer votre phrase");
        int TailleMax;
        TailleMax = 10;
        phrase = phrase.substring(0, TailleMax);

        System.out.println(phrase+"... OUPS !! Votre Phrase à été couper car elle comporte plus de 10 caractères");
    }
}
