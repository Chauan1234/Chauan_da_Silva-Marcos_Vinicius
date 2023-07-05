package Atividade_5_Math;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("\n**********ATIVIDADE A**********\n");

        //A

        double raio, area;

        System.out.print("Digite o raio: "); raio = s.nextDouble();

        area = Math.PI * (Math.pow(raio, 2));

        System.out.println("A área do circulo é:" + area);



        System.out.println("\n**********ATIVIDADE B**********\n");

        //B

        double circunferencia;

        circunferencia = 2 * Math.PI * raio;

        System.out.println("A circunferência do círculo é:" + circunferencia);



        System.out.println("\n**********ATIVIDADE C**********\n");

        //C

        double[] cateto = new double[3]; double hipotenusa;

        System.out.print("Digite valor de cateto 1: "); cateto[0] = s.nextDouble();

        System.out.print("Digite valor de cateto 2: "); cateto[1] = s.nextDouble();

        cateto[0] = Math.pow(cateto[0], 2);

        cateto[1] = Math.pow(cateto[1], 2);

        hipotenusa = cateto[0] + cateto[1];

        hipotenusa = Math.sqrt(hipotenusa);

        System.out.println("A hipotenusa do triângulo retangulo é: " + hipotenusa);



        System.out.println("\n**********ATIVIDADE D**********\n");

        //D

        double[] periRetanLado = new double[3]; double perimetro;

        System.out.print("Digite o primeiro lado do retângulo: "); periRetanLado[0] = s.nextDouble();

        System.out.print("Digite o segundo lado do retângulo: "); periRetanLado[1] = s.nextDouble();

        perimetro = 2 * (periRetanLado[0] + periRetanLado[1]);

        System.out.println("Perímetro do retangulo: " + perimetro);



        System.out.println("\n**********ATIVIDADE E**********\n");

        //E

        double altura, base;

        System.out.print("Digite altura do triângulo: "); altura = s.nextDouble();

        System.out.print("Digite base do triângulo: "); base = s.nextDouble();

        area = (altura * base) / 2;

        System.out.println("Área do triângulo: " + area);
    }
}
