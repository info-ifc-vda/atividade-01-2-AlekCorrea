package Lista1;

import java.util.Scanner;

/*Faça um programa que leia um número inteiro e diga se ele é primosss */
public class Atividade10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePrimos = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();

            if (ehPrimo(numero)) {
                quantidadePrimos++;
            }
        }

        System.out.println("Quantidade de números primos digitados: " + quantidadePrimos);
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
        
    }
}
