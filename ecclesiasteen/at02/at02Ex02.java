package ecclesiasteen.at02;

import java.util.Scanner;

public class at02Ex02 {
    static void probleme2(){
        Scanner scanner = new Scanner(System.in);

        //Lecture d'une phrase par l'utilisateur
        System.out.print("Veuillez saisir un mot ou une phrase : ");
        String phrase = scanner.nextLine();

        //Donne le nombre de caractère
        System.out.println("Le nombre de caractère est de : " + phrase.length());

        

        scanner.close();

     }

     public static void main(String[] args) {
        probleme2();
        
     }
}


