package ecclesiasteen.at02;

import java.util.Scanner;

public class at02Ex07 {
    static void probleme7(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir un mot ou une phrase : ");
        String sphrase = scanner.nextLine().toLowerCase();

        int ivoyelles = 0;
        int icosonnes = 0;

        for(int i = 0; i < sphrase.length(); i++ )
        {
            char c = sphrase.charAt(i);

            if (Character.isLetter(c)) {
                if ("aeiouy".indexOf(c) != -1) {
                   ivoyelles++ ;
                }
                else
                {
                    icosonnes++;
                }
                
            }
        }

        System.out.println("Consonnes : " + icosonnes);
        System.out.println("Voyelles : " + ivoyelles);

        scanner.close();

     }

     public static void main(String[] args) {
        probleme7();
        
     }

}
