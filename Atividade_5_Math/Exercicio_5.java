package Atividade_5_Math;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        double hipotenusa, oposto, adjacente;

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor da hipotenusa: "); hipotenusa = s.nextDouble();

        System.out.print("Digite o valor oposto: "); oposto = s.nextDouble();

        adjacente = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(oposto, 2));

        System.out.println("O lado adjacente do triângulo retângulo é: " + adjacente);
    }
}
