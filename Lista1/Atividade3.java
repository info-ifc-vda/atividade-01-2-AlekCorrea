package Lista1;

import java.util.Scanner;

/*3. Leia os 03 ângulos e os 03 lados de um triângulo, e classifique-o como: retângulo,
obtusângulo ou acutângulo; e equilátero, escaleno ou isósceles.
 */
public class Atividade3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Leitura dos ângulos
        System.out.print("Digite o primeiro ângulo: ");
        int angulo1 = teclado.nextInt();

        System.out.print("Digite o segundo ângulo: ");
        int angulo2 = teclado.nextInt();

        System.out.print("Digite o terceiro ângulo: ");
        int angulo3 = teclado.nextInt();

        // Leitura dos lados
        System.out.print("Digite o primeiro lado: ");
        int lado1 = teclado.nextInt();

        System.out.print("Digite o segundo lado: ");
        int lado2 = teclado.nextInt();

        System.out.print("Digite o terceiro lado: ");
        int lado3 = teclado.nextInt();

        // Verificar tipo de triângulo com base nos ângulos
        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            System.out.println("O triângulo é Retângulo.");
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            System.out.println("O triângulo é Obtusângulo.");
        } else {
            System.out.println("O triângulo é Acutângulo.");
        }

        // Verificar tipo de triângulo com base nos lados
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é Equilátero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("O triângulo é Isósceles.");
        } else {
            System.out.println("O triângulo é Escaleno.");
        }

        teclado.close();
    }
}