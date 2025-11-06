package ecclesiasteen.at02;

import java.util.Scanner;

public class at02Ex04 {
    static void probleme4(){
        Scanner scanner = new Scanner(System.in);
        int ivaleur;
        
        //Fait
        do{
            //Saisi d'une valeur entre 0 a 100
            System.out.print("Entrer une valeur entre 1 et 100 : ");
            ivaleur = scanner.nextInt();
            // Pendant que
        } while(ivaleur > 100 || ivaleur < 0);{
              
        }

        //Donne la valeur donner par l'utilisateur
        System.out.print("La valeur que vous avez rentrer est : " + ivaleur);

        scanner.close();

    }

     public static void main(String[] args) {
        probleme4();
        
     }
}


