package Lista1;

import java.util.Scanner;

/*Faça um programa que recebe o número de horas trabalhadas, e o valor da hora trabalhada. Calcule e mostre o salário a receber seguindo estas regras:
• o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da
hora trabalhada;
• o imposto equivale a 30% do salário bruto;
• o salário a receber equivale ao salário bruto menos o imposto.*/

public class Atividade1 {

    public static void main(String[] args){
        int horas =0;
        float valorH=0;
        float SalBruto;
        float imposto;


        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual o valor da hora ");
            valorH = teclado.nextFloat();

        System.out.print("Quantas horas foram trabalhadas ");
            horas = teclado.nextInt();



        SalBruto = (horas*valorH);
        imposto = SalBruto*30/100;
        
        System.out.println("O salario bruto é "+SalBruto);
        System.out.println("O salario com o imposto fica "+(SalBruto-imposto));
        


        teclado.close();

    }
}
