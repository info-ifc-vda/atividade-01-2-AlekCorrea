package Lista1;
/*Sabe-se que o quilowatt de energia custa 1% do salário mínimo. Faça um programa
que recebe o valor do salário mínimo e a quantidade de quilowatts consumida por uma
residência, calcule e mostre:
• o valor de cada quilowatt;
• o valor a ser pago por essa residência;*/

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args){
        float valorQ=0;
        float SalMinimo=0;
        float energia;
        float residencia;


        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos quilowatt foram consumidos? ");
            energia = teclado.nextFloat();

        System.out.print("Qual o salario minimo atual? ");
           SalMinimo = teclado.nextInt();



        valorQ = SalMinimo/100;
        residencia = (energia*SalMinimo)/100;
        
        
        System.out.println("o valor de cada quilowatt é "+valorQ);
        System.out.println("o valor a ser pago por essa residência "+residencia);
        


        teclado.close();

    }
}
