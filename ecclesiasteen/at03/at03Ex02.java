package ecclesiasteen.at03;

import java.util.Scanner;

public class at03Ex02 {
    static void probleme2() {
         Scanner scanner = new Scanner(System.in);

         //tableau de réels de 10 chiffres
        double[] iNombre = new double [10]; 
        Scanner scanner = new Scanner(System.in);

        //demande a l'utilisateur de saisir 10 nombre réels
        for(int i = 0; i < iNombre.length; i++){
            System.out.print("entrez le nombre réel #" + (i + 1) + " : ");
            iNombre[i] = scanner.nextDouble();
        }
        //affiche le tableau avec les 10 chiffres
        System.out.println("\n-- Contenu du tableau --");
        for (int i = 0; i < iNombre.length; i++) {
            System.out.println(i +" : " + iNombre[i]);
        }
        
        scanner.close();
    }
     public static void main(String[] args) {
        probleme2();
        
     }

}
