package Lista1;

import java.util.Scanner;

/*. Em um campeonato de futebol existem cinco times e cada um possui 11 jogadores.
Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores,
calcule e mostre:*/

public class Atividade5 {

    public static void main(String[] args){
        int Idade =0;
        float peso=0;
        float altura=0;
        float jogador;
        int nomeC;


        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual o codigo do dojogador?? ");
            nomeC = teclado.nextInt();

        System.out.print("Qual a idade do jogador?? ");
            Idade = teclado.nextInt();

        System.out.print("Qual o peso do jogador?? ");
            peso = teclado.nextFloat();

            System.out.print("Qual a altura do jogador?? ");
            altura = teclado.nextFloat();

        jogador = (altura*peso);

        for(int i=0;i<=10;i++){
 
    }

        teclado.close();

    }
}
