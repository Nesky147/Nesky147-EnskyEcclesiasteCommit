package ecclesiasteen.at01;

import java.util.Scanner;

public class at01Ex03 {
     static void probleme3(){
        Scanner scanner = new Scanner(System.in);

        //Lecture des deux âges
        System.out.println("entrer le premier age : ");
        double dage1 = scanner.nextDouble();

        System.out.println("entrer le deuxième age : ");
        double dage2 = scanner.nextDouble();

        //Moyenne des deux âges
        double dmoyenne = (dage1 + dage2) /2;

        System.out.println("La moyenne des deux âges est de :" + dmoyenne);

        if (dage1 > dage2) {
            System.out.println("La personne la plus vielle est : " + dage1);
        }
        else if (dage2 > dage1) {
            System.out.println("La personne la plus vielle est : " + dage2);
                
        }
        else{
            System.out.println(" Les deux personnes ont le même âge" + dage1);
        }

        scanner.close();

     }

     public static void main(String[] args) {
        probleme3();
        
     }


}
