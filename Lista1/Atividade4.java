package Lista1;

import java.util.Scanner;

public class Atividade4 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do código do produto e da quantidade comprada
        System.out.print("Digite o código do produto (1 a 40): ");
        int codigoProduto = scanner.nextInt();
        
        System.out.print("Digite a quantidade comprada: ");
        int quantidadeComprada = scanner.nextInt();

        // Determinação do preço unitário com base na Tabela I
        double precoUnitario;
        if (codigoProduto >= 1 && codigoProduto <= 10) {
            precoUnitario = 10.00;
        } else if (codigoProduto >= 11 && codigoProduto <= 20) {
            precoUnitario = 15.00;
        } else if (codigoProduto >= 21 && codigoProduto <= 30) {
            precoUnitario = 20.00;
        } else if (codigoProduto >= 31 && codigoProduto <= 40) {
            precoUnitario = 40.00;
        } else {
            System.out.println("Código do produto inválido.");
            return;
        }

        // Cálculo do preço total da nota
        double precoTotalNota = precoUnitario * quantidadeComprada;

        // Determinação do desconto com base na Tabela II
        double desconto;
        if (precoTotalNota <= 250) {
            desconto = precoTotalNota * 0.05;  // 5% de desconto
        } else if (precoTotalNota > 250 && precoTotalNota <= 500) {
            desconto = precoTotalNota * 0.10;  // 10% de desconto
        } else {
            desconto = precoTotalNota * 0.15;  // 15% de desconto
        }

        // Cálculo do preço final após o desconto
        double precoFinalNota = precoTotalNota - desconto;

        // Exibição dos resultados
        System.out.println("Preço unitário do produto: R$ " + precoUnitario);
        System.out.println("Preço total da nota: R$ " + precoTotalNota);
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Preço final da nota após desconto: R$ " + precoFinalNota);

        scanner.close();
    }
}