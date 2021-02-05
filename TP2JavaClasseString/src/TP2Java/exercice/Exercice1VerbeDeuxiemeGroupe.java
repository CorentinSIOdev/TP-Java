package TP2Java.exercice;

import java.util.Scanner;

public class Exercice1VerbeDeuxiemeGroupe {
    public static String lecture ( ) {
        Scanner sc = new Scanner (System.in);
        String str;
        String terminaisonIR;
        do {
            System.out.println ("Donner un verbe du deuxième groupe");
            str= sc.nextLine ();
            terminaisonIR = str.substring (str.length()-2);

        }

        while (! terminaisonIR.equals("ir"));

        str = str.substring (0, str.length()-2);
        return str;
    }


    public static void conjugaison (String str){
        String [] termin = {"is","is","it","issons","issez","issent"};
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
