package ecclesiasteen.at02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class at02Ex08 {
    static void problem8() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> mots = new ArrayList<>();

        //Saisi de mot
        System.out.println("Entrez des mots un par un (tapez 'stop' pour terminer) :");

        //Tant que ceci est vrai
        while (true) {

            //Saisi des mots
            System.out.print("Mot : ");
            String mot = scanner.nextLine().toLowerCase();

            //Si le mot est egale au mot stop casser la boucle
            if (mot.equals("stop")) {
                break;
            }

            //Ajout des mots
            mots.add(mot);
        }

        //Si rien n'est ecris a la saisi
        if (mots.isEmpty()) {

            //Affiche message d'erreur
            System.out.println("Aucun mot saisi.");

          //Sinon
        } else {

            //Trie par les mots ecrits
            Collections.sort(mots);

            //Reponse du premier mot ecrit
            System.out.println("Premier mot : " + mots.get(0));
            
            //Reponse du deuxieme mot ecrit
            System.out.println("Dernier mot : " + mots.get(mots.size() - 1));
            
        }

        scanner.close();
    }

    public static void main(String[] args) {
        problem8();
    }
}
