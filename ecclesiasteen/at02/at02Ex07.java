package ecclesiasteen.at02;

import java.util.Scanner;

public class at02Ex07 {
    static void probleme7(){
        Scanner scanner = new Scanner(System.in);

        //Saisi de phrase
        System.out.print("Veuillez saisir une phrase : ");
        String sphrase = scanner.nextLine().toLowerCase();

        //Declaration des variables
        int ivoyelles = 0;
        int icosonnes = 0;

        //Pour
        for(int i = 0; i < sphrase.length(); i++ )
        {
            char c = sphrase.charAt(i);

            //Si le caractere est une lettre de la phrase
            if (Character.isLetter(c)) {
                //Si c'est une consome le compte augmente de 1
                if ("aeiouy".indexOf(c) != -1) {
                   ivoyelles++ ;
                }
                //sinon le compte des cosonnes augmente de 1
                else
                {
                    icosonnes++;
                }
                
            }
        }

        //Reponse du total de consonnes et de voyelles
        System.out.println("Consonnes : " + icosonnes);
        System.out.println("Voyelles : " + ivoyelles);

        scanner.close();

     }

     public static void main(String[] args) {
        probleme7();
        
     }

}
