package ecclesiasteen.at01;

import java.util.Scanner;

public class at01Ex01 {
    static void probleme1() {
         Scanner scanner = new Scanner(System.in);

         // Lecture des deux nombres
         System.out.print("Entrez le premier nombre : ");
         double nombre1 = scanner.nextDouble();

         System.out.print("Entrez le deuxième nombre : ");
         double nombre2 = scanner.nextDouble();

         // Comparaison avec la structure conditionnelle
         if (nombre1 > nombre2) {
             System.out.println("Le plus grand nombre est : " + nombre1);
         } else if (nombre2 > nombre1) {
             System.out.println("Le plus grand nombre est : " + nombre2);
         } else {
             System.out.println("Les deux nombres sont égaux.");
         }

        scanner.close();
    }
     public static void main(String[] args) {
        probleme1();
        
     }



}
