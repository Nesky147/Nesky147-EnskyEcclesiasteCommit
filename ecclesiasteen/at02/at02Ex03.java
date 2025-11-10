package ecclesiasteen.at02;

import java.util.Scanner;

public class at02Ex03 {
    static void probleme3(){
        Scanner scanner = new Scanner(System.in);

        //Saisi de la phrase
        System.out.print("Veuillez saisir un mot de passe ou une phrase : ");
        String sphrase = scanner.nextLine();
        String suppercaseString = sphrase.toUpperCase();
        int nombreA = 0;

        // Pour 
         for(int i = 0; i < sphrase.length(); i++){
            if(sphrase.charAt(i) == 'A') nombreA++;
        }
        
        //Remplacement des a en $
        suppercaseString = suppercaseString.replace('A', '$');

        //Nombre de A
        System.out.println(nombreA);

        //Réponse en majuscule
        System.out.println(suppercaseString);

        scanner.close();

     }

     public static void main(String[] args) {
        probleme3();
        
     }

}
