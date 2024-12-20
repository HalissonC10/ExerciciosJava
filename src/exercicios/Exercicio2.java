package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra para verificar se é um palíndromo: ");
        String palavra = scanner.nextLine();

        palavra = palavra.toLowerCase().replaceAll("\\s+", "");

        if (ehPalindromo(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo!");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
        }
    }

    private boolean ehPalindromo(String palavra) {
        int esquerda = 0;
        int direita = palavra.length() - 1;

        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }
}
