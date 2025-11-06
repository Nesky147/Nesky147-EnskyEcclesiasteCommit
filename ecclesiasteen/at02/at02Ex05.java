package ecclesiasteen.at02;

import java.util.Scanner;

public class at02Ex05 {
    static void probleme5(){
        Scanner scanner = new Scanner(System.in);

        // Alphabet normal
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++)
        {
            System.out.print(alphabet);
        }
        System.out.println();

        // Alphabet a l'envers
        for(char alphabet = 'z'; alphabet >='a'; alphabet--)
        {
            System.out.print(alphabet);
        }
        
        scanner.close();

     }

     public static void main(String[] args) {
        probleme5();
        
     }
}


