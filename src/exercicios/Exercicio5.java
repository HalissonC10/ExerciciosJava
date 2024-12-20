package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        if (saoAnagramas(palavra1, palavra2)) {
            System.out.println("As palavras \"" + palavra1 + "\" e \"" + palavra2 + "\" são anagramas.");
        } else {
            System.out.println("As palavras \"" + palavra1 + "\" e \"" + palavra2 + "\" não são anagramas.");
        }
    }

    private boolean saoAnagramas(String palavra1, String palavra2) {
        palavra1 = palavra1.toLowerCase().replaceAll("\\s+", "");
        palavra2 = palavra2.toLowerCase().replaceAll("\\s+", "");

        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        char[] array1 = palavra1.toCharArray();
        char[] array2 = palavra2.toCharArray();

        // Ordena os arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
