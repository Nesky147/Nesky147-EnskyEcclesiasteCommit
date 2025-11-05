package ecclesiasteen.at01;

import java.util.Scanner;

public class at01Ex02 {
    static void probleme2(){
        Scanner scanner = new Scanner(System.in);

        // Lecture du salaire et des heures hebdomadaires
        System.out.print("entrer le nombre d'heure hebdomadaire : ");
        double horaire = scanner.nextDouble();

        System.out.print("entrer le salaire horaire : ");
        double salaire = scanner.nextDouble();

        // Calcul du salaire sur deux semaines
        double salairefinal = horaire * salaire * 2;

        System.out.print("Votre salaire au deux semaines est de :" + salairefinal);
        
        scanner.close();
        
    }

     public static void main(String[] args) {
        probleme2();
        
     }

}
