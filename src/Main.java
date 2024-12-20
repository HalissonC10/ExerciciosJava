package app;

import exercicios.Exercicio1;
import exercicios.Exercicio2;
import exercicios.Exercicio3;
import exercicios.Exercicio4;
import exercicios.Exercicio5;
import exercicios.Exercicio6;
import exercicios.Exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um exercício (1-10): ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                new Exercicio1().executar();
                break;
            case 2:
                new Exercicio2().executar();
                break;
            case 3:
                new Exercicio3().executar();
                break;
            case 4:
                new Exercicio4().executar();
                break;
            case 5:
                new Exercicio5().executar();
                break;
            case 6:
                new Exercicio6().executar();
                break;
            case 7:
                new Exercicio7().executar();
                break;
            default:
                System.out.println("Escolha inválida. Por favor, escolha entre 1 e 7.");
        }

        scanner.close();
    }
}
