package Atividade_5_Math;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        double[] potencia = new double[3], parte = new double[3]; double raiz;

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor de potência: "); potencia[0] = s.nextDouble();
        System.out.print("Digite o valor de potência: "); potencia[1] = s.nextDouble();

        parte[0] = Math.pow(potencia[0], 2);

        parte[1] = Math.pow(potencia[1], 2);

        raiz = Math.sqrt(parte[0] + parte[1]);

        System.out.println("A distância entre os pontos é: " + raiz);
    }
}
