package ecclesiasteen.at02;

import java.util.Scanner;

public class at02Ex03 {
    static void probleme3(){
        Scanner scanner = new Scanner(System.in);

        //Saisi de la phrase
        System.out.print("Veuillez saisir un mot ou une phrase : ");
        String sphrase = scanner.nextLine().toUpperCase();
        String uppercaseString = sphrase.toUpperCase();
        

        scanner.close();

     }

     public static void main(String[] args) {
        probleme3();
        
     }

}
