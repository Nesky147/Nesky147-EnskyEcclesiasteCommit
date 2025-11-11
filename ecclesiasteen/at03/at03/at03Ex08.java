package ecclesiasteen.at03;

import java.util.Scanner;

public class at03Ex08 {
   static void probleme8() {
        Scanner scanner = new Scanner(System.in);

        //Déclaration de la variable
        String[] noms = new String[8];
        int[] tp1 = new int[8];
        int[] tp2 = new int[8];
        int[] examen1 = new int[8];

        // --- Saisie des données ---
        for (int i = 0; i < 8; i++) {
            System.out.print("Entrez le nom de l'étudiant #" + (i + 1) + " : ");
            noms[i] = scanner.nextLine();

            System.out.print("  Note TP1 : ");
            tp1[i] = scanner.nextInt();

            System.out.print("  Note TP2 : ");
            tp2[i] = scanner.nextInt();

            System.out.print("  Note Examen1 : ");
            examen1[i] = scanner.nextInt();
            scanner.nextLine(); // vider le buffer
        }

        // --- Calcul et affichage des moyennes par évaluation ---
        System.out.printf("%nMoyenne TP1 : %.2f%n", moyEval(tp1));
        System.out.printf("Moyenne TP2 : %.2f%n", moyEval(tp2));
        System.out.printf("Moyenne Examen1 : %.2f%n", moyEval(examen1));

        // --- Calcul et affichage des moyennes par étudiant ---
        System.out.println("\n--- Moyenne de chaque étudiant ---");
        for (int i = 0; i < 8; i++) {
            double moyenne = moyEtu(tp1[i], tp2[i], examen1[i]);
            System.out.printf("%s : %.2f%n", noms[i], moyenne);
        }

        scanner.close();
    }

    // Méthode pour moyenne d'une évaluation
    public static double moyEval(int[] tab) {
        int somme = 0;
        for (int note : tab) {
            somme += note;
        }
        return (double) somme / tab.length;
    }

    // Méthode pour moyenne d’un étudiant
    public static double moyEtu(int tp1, int tp2, int examen1) {
        return (tp1 + tp2 + examen1) / 3.0;
    }

    // Main
    public static void main(String[] args) {
        probleme8();
    }

}
