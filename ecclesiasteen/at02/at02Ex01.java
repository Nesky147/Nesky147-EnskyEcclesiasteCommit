package ecclesiasteen.at02;

import java.util.Scanner;

public class at02Ex01 {
    static void probleme1(){
        Scanner scanner = new Scanner(System.in);

        //Lecture d'un mot de passe ou d'une phrase
        System.out.print("entrer le mot de passe ou le mot que vous désirez : ");
        String sreponse = scanner.nextLine();
        String uppercaseString = sreponse.toUpperCase();

        //Réponse en majuscule
        System.out.println(uppercaseString);

        scanner.close();

     }

     public static void main(String[] args) {
        probleme1();
        
     }
}


