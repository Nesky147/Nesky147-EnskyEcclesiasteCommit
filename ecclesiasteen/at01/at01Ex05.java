package ecclesiasteen.at01;

import java.util.Scanner;

public class at01Ex05 {
    static void probleme5(){
        Scanner scanner = new Scanner(System.in);

        //Lecture de la note de l'èleve en math
        System.out.print("entre le montant que vous désirez avoir un rabais dessus : ");
        double dmontant = scanner.nextDouble();

        //Calcul du rabais sur le montant donner
        double drabais = dmontant * 0.25;
        double dprixfinal = dmontant - drabais;

        System.out.println("Le prix final après le rabais est : " + dprixfinal);

        scanner.close();

     }

     public static void main(String[] args) {
        probleme5();
        
     }
}

