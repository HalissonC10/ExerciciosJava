package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números da sequência de Fibonacci que deseja exibir: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número maior que zero.");
            return;
        }

        System.out.println("Sequência de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    private int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
