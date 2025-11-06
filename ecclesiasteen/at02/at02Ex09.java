package ecclesiasteen.at02;

import java.util.Scanner;

public class at02Ex09 {
    static void probleme9(){
        Scanner scanner = new Scanner(System.in);

        //Saisi du rayon du cercle
        System.out.print("Entrez le rayon du cerle : ");
        double dRayon = scanner.nextDouble();

        //Calcul de la circonference
        double dCirconference = 2 * Math.PI * dRayon;
        
        //Resultat du calcul
        System.out.print("La circonference du cercle est :  " + dCirconference);

        scanner.close();

     }

     public static void main(String[] args) {
        probleme9();
        
     }
}
