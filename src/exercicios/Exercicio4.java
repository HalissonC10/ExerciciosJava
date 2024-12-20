package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int numeroInvertido = inverterNumero(numero);

        System.out.println("O número invertido é: " + numeroInvertido);
    }

    private int inverterNumero(int numero) {
        int invertido = 0;
        while (numero != 0) {
            int digito = numero % 10; // Obtém o último dígito
            invertido = invertido * 10 + digito; // Adiciona o dígito ao invertido
            numero /= 10; // Remove o último dígito do número original
        }
        return invertido;
    }
}
