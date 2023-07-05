package Atividade_5_Math;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        double valorA;

        Scanner s = new Scanner(System.in);

        System.out.print("Digite um valor: "); valorA = s.nextDouble();

        //A
        System.out.println("A tangente do ângulo é: " + Math.tan(valorA));

        //B
        System.out.println("O arco seno do valor é: " + Math.asin(valorA));

        //C
        System.out.println("O arco cosseno do valor é: " + Math.acos(valorA));

        //D
        System.out.println("O arco tangente do valor é: " + Math.atan(valorA));

        //E
        System.out.println("O logaritmo natural do valor é: " + Math.log(valorA));
    }
}
