package ecclesiasteen.at03;

import java.util.Scanner;

public class at03Ex02 {
    static void probleme1() {
         Scanner scanner = new Scanner(System.in);
         
         //Declaration de la variable
         String [] smot = new String[5];

         //Contenu du tableau
         smot[0] = "Jona";
         smot[1] = "Saad";
         smot[2] = "David";
         smot[3] = "Momo";
         smot[4] = "Joyce";

         //Affichage des mots seulement
         System.out.println("Mot seulement :");

        //Pour
        for (String mot : smot) {
            System.out.println(mot);
        }

         //Affichage du tableau complet
         System.out.println("\nContenu du tableau :");

         //Pour
        for (int i = 0; i < smot.length; i++) {
            System.out.println(i + " : " + smot[i]);
        }


        scanner.close();
    }
     public static void main(String[] args) {
        probleme1();
        
     }

}
