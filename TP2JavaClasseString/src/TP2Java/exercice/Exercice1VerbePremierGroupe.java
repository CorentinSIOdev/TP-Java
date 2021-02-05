package TP2Java.exercice;

import java.util.Scanner;

public class Exercice1VerbePremierGroupe {
    public static String lecture ( ) {
        Scanner sc = new Scanner (System.in);
        String str;
        String terminaisonER;
        do {
            System.out.println ("Donner un verbe du premier groupe");
            str= sc.nextLine ();
            terminaisonER = str.substring (str.length()-2);

        }

        while (! terminaisonER.equals("er"));

        str = str.substring (0, str.length()-2);
        return str;
    }


    public static void conjugaison (String str){
        String [] termin = {"e","es","e","ons","ez","ent"};
        String [] sujet = {"Je","Tu","Il/Elle/On","Nous","Vous","Ils/Elles"};
        int i;
        for (i=0;i<6;i++){
            System.out.println (sujet[i]+" "+str+termin[i]);
        }
    }

    public static void main (String args[]) {
        String verbe = lecture ();
        conjugaison (verbe);

    }
}