package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(50) + 1;
        int palpite;

        System.out.println("Tente adivinhar o número que estou pensando (entre 1 e 50)!");

        while (true) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número: " + numeroSecreto);
                break;
            } else {
                System.out.println("Errado! Tente novamente.");
            }
        }

        scanner.close();
    }
}
