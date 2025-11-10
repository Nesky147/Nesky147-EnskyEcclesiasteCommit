package ecclesiasteen.at02;

import java.util.Scanner;

public class at02Ex10 {
    static void probleme9(){
        Scanner scanner = new Scanner(System.in);

         System.out.print("Entrez un premier nombre entier : ");
        int iNombre1 = scanner.nextInt();

        System.out.print("Entrez un deuxieme nombre entier : ");
        int iNombre2 = scanner.nextInt();

        int iResultat = plusGrand(iNombre1,iNombre2);

        System.out.print("Le plus grand nombre est : " + iResultat);

        scanner.close();

     }

     //Methode plus grand
     public static int plusGrand(int a,int b){
        if(a > b){
            return a; 
        }else{
            return b;
        }
    }

     public static void main(String[] args) {
        probleme9();
        
     }

}
