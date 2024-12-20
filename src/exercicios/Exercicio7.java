package exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int numeroDePalavras = contarPalavras(frase);

        System.out.println("A frase contém " + numeroDePalavras + " palavra(s).");
    }

    private int contarPalavras(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            return 0;
        }

        String[] palavras = frase.trim().split("\\s+");
        return palavras.length;
    }
}
