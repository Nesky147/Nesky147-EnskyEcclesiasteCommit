package ecclesiasteen.at01;

import java.util.Scanner;

public class at01Ex06 {
    static void probleme6(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1- Chêne");
        System.out.println("2- Érable");
        System.out.println("3- Pin");
        System.out.print("Quel est le type de bois que vous désirez : ");
        double dboischoisi = scanner.nextDouble();
        System.out.print("Entrer votre nom : ");
        String sclient = scanner.next();
        
        

        if (dboischoisi == 1) {

            System.out.print("Entrer la longeur de bois que vous désirez : ");
            double dlongeur = scanner.nextDouble();
            System.out.print("Entrer la largeur de bois que vous désirez : ");
            double dlargeur = scanner.nextDouble();

            double dsurfaceplancher = dlargeur * dlongeur;
            double dprix = 12 * dsurfaceplancher;
            System.out.println(sclient + "La surface du plancher est de " + dsurfaceplancher + "le prix du plancher est donc de " + dprix);
        }
        else if (dboischoisi == 2) {

            System.out.print("Entrer la longeur de bois que vous désirez : ");
            double dlongeur = scanner.nextDouble();
            System.out.print("Entrer la largeur de bois que vous désirez : ");
            double dlargeur = scanner.nextDouble();

            double dsurfaceplancher = dlargeur * dlongeur;
            double dprix = 12 * dsurfaceplancher;
            System.out.println(sclient + " La surface du plancher est de " + dsurfaceplancher + " le prix du plancher est donc de " + dprix);
        }
        else if(dboischoisi == 3) {

            System.out.print("Entrer la longeur de bois que vous désirez : ");
            double dlongeur = scanner.nextDouble();
            System.out.print("Entrer la largeur de bois que vous désirez : ");
            double dlargeur = scanner.nextDouble();

            double dsurfaceplancher = dlargeur * dlongeur;
            double dprix = 5 * dsurfaceplancher;
            System.out.println(sclient + "La surface du plancher est de " + dsurfaceplancher + "le prix du plancher est donc de " + dprix);
        }
        else{

            System.out.print("Vous n'avez pas choisi le bon type de placher");

        }


        


        scanner.close();

     }

     public static void main(String[] args) {
        probleme6();
        
     }

}
