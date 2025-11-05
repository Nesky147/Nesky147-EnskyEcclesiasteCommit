package ecclesiasteen.at01;

import java.util.Scanner;

public class at01Ex04 {
static void probleme4(){
        Scanner scanner = new Scanner(System.in);

        //Lecture de la note de l'èleve en math
        System.out.print("entrer la note de l'élève en math : ");
        double dnote = scanner.nextDouble();

        if (dnote >=60) {
            System.out.println("Vous avez réussi votre cours de mathématique");
        }
        else if (dnote < 60) {
            System.out.println("Vous avez échouez votre cours de mathématique");
                
        }

        scanner.close();

     }

     public static void main(String[] args) {
        probleme4();
        
     }
}
