package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação (+, -, /, *): ");
        char operador = scanner.next().charAt(0);

        double result = 0;

        switch (operador) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Erro divisão por zero");
                }
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }

        System.out.println("O resultado da operação é: " + result);
    }

}
