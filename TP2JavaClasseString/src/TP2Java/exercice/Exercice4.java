package TP2Java.exercice;

import javax.swing.*;
import java.util.Locale;

public class Exercice4 {
    public static void main(String[] args) {
        String nom = JOptionPane.showInputDialog(null, "Entrer votre nom : ");
        String prenom = JOptionPane.showInputDialog(null, "Entrer votre prénom");

        System.out.println("Votre Nom de famille est "+nom.toUpperCase(Locale.ROOT)+". Votre Nom comporte " +nom.length()+" caractères ");
        System.out.println("Votre Prénom est "+prenom.replaceFirst(".",(prenom.charAt(0)+"").toUpperCase())+". Votre Prénom comporte " +prenom.length()+" caractères");

    }
}
