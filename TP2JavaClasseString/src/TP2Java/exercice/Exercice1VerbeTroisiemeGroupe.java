package TP2Java.exercice;

import java.util.Scanner;

public class Exercice1VerbeTroisiemeGroupe {
    public static String lecture ( ) {
        Scanner sc = new Scanner (System.in);
        String str;
        String terminaisonOIR;
        do {
            System.out.println ("Donner un verbe du troisième groupe");
            str= sc.nextLine ();
            terminaisonOIR = str.substring (str.length()-3);

        }

        while (! terminaisonOIR.equals("oir"));

        str = str.substring (0, str.length()-3);
        return str;
    }


    public static void conjugaison (String str){
        String [] termin = {"ois","ois","oit","oyons","oyez","oient"};
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

