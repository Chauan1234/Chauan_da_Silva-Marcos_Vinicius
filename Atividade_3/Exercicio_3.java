package Atividade_3;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("\n**************Atividade 1***************\n");

        int[] num_int = new int[99];
        double resul;

        System.out.print("Digite um número inteiro: "); num_int[0] = s.nextInt();
        
        System.out.print("Digite um número inteiro: "); num_int[1] = s.nextInt();

        resul = num_int[0] + num_int[1];

        System.out.println("A soma entre os números é: " + resul);


        System.out.println("\n**************Atividade 2***************\n");

        double raio, area, pi = Math.PI;

        System.out.print("Digite o raio de um circulo: "); raio = s.nextDouble();

        area = pi * (raio * raio);

        System.out.println("A área do circulo é: " + area);


        System.out.println("\n**************Atividade 3***************\n");

        double base, altura;

        System.out.print("Digite o valor de base do triângulo: "); base = s.nextDouble();
        
        System.out.print("Digite o valor da altura do triângulo: "); altura = s.nextDouble();

        area = (base * altura) / 2;

        System.out.println("A área do triânngulo é: " + area);


        System.out.println("\n**************Atividade 4***************\n");

        double celsius, fahren;

        System.out.print("Digite uma temperatura em graus Celsius: "); celsius = s.nextDouble();

        fahren = (celsius * 1.8) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahren);


        System.out.println("\n**************Atividade 5***************\n");

        double salarioDia, salariopHora, tempoTrabalhado;

        System.out.print("Digite horas trabalhadas: "); tempoTrabalhado = s.nextDouble();

        System.out.print("Valor da hora de trabalho: R$"); salariopHora = s.nextDouble();

        salarioDia = salariopHora * tempoTrabalhado;

        System.out.println("Salário diário: R$" + salarioDia);


        System.out.println("\n**************Atividade 6***************\n");

        int dias, hr, mn, seg, totalseg;

        System.out.print("Quantidade de dias: "); dias = s.nextInt();

        System.out.print("Quantidade de horas: "); hr = s.nextInt();

        System.out.print("Quantidade de minutos: "); mn = s.nextInt();

        System.out.print("Quantidade de segundos: "); seg = s.nextInt();

        dias *= 86400;

        hr *= 3600;

        mn *= 60;

        totalseg = (dias + (hr + mn) + seg);

        System.out.println(totalseg + " Segundos");


        System.out.println("\n**************Atividade 7***************\n");

        System.out.print("Digite número inteiro: "); num_int[0] = s.nextInt();

        System.out.print("Digite número inteiro: "); num_int[1] = s.nextInt();

        System.out.println("Valor da multiplação: " + (num_int[0] * num_int[1]));


        System.out.println("\n**************Atividade 8***************\n");

        double valorProd, descon;

        System.out.print("Digite valor do produto: R$"); valorProd = s.nextDouble();

        descon = valorProd - (valorProd * 0.10);

        System.out.println("Valor com desconto: R$" + descon);


        System.out.println("\n**************Atividade 9***************\n");

        double valorL, quantL;

        System.out.print("Quantidade de litros de combustível: "); quantL = s.nextDouble();

        System.out.print("Valor do litro: R$"); valorL = s.nextDouble();

        System.out.println("Valor total: R$" + (valorL * quantL));


        System.out.println("\n**************Atividade 10***************\n");

        double diasAluga, valorDiaria;

        System.out.print("Quantidade de dias alugados: "); diasAluga = s.nextDouble();

        System.out.print("Valor da diária: R$"); valorDiaria = s.nextDouble();

        System.out.println("O valor total do aluguel é: R$" + (diasAluga * valorDiaria));


        System.out.println("\n**************Atividade 11***************\n");

        int quadNum;

        System.out.print("Digite um número inteiro: "); quadNum = s.nextInt();

        System.out.println("O quadrado do número é: " + (quadNum * quadNum));


        System.out.println("\n**************Atividade 12***************\n");

        double acrescimo;

        System.out.print("Digite o valor do produto: R$"); valorProd = s.nextDouble();

        acrescimo = valorProd + (valorProd * 0.15);

        System.out.println("Valor com acréscimo: R$" + acrescimo);


        System.out.println("\n**************Atividade 13***************\n");

        int quantComprada;

        System.out.print("Valor do produto: R$"); valorProd = s.nextDouble();

        System.out.print("Quantidade comprada: "); quantComprada = s.nextInt();

        System.out.println("Valor total: R$" + (quantComprada * valorProd));


        System.out.println("\n**************Atividade 14***************\n");

        int cubo;

        System.out.print("Digite um número inteiro: "); cubo = s.nextInt();

        System.out.println("O valor do cubo do número é: " + ((cubo * cubo) * cubo));


        System.out.println("\n**************Atividade 15***************\n");

        double peso, imc;

        System.out.print("Digite sua altura em metros: "); altura = s.nextDouble();

        System.out.print("Digite seu peso em quilogramas: "); peso = s.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu índice de massa corporal (IMC) é: " + imc);


        System.out.println("\n**************Atividade 16***************\n");

        System.out.print("Valor do produto: R$"); valorProd = s.nextDouble();

        System.out.print("Porcentagem do desconto: "); descon = s.nextDouble();

        descon = valorProd - (valorProd * descon) / 100;

        System.out.println("Valor total com desconto: R$" + descon);


        System.out.println("\n**************Atividade 17***************\n");

        int parcelas;

        System.out.print("Digite o valor do produto: ");
        valorProd = s.nextDouble();

        System.out.print("Digite o valor das parcelas: ");
        parcelas = s.nextInt();

        System.out.println("Valor de cada parcela: R$" + (valorProd / parcelas));


        System.out.println("\n**************Atividade 18***************\n");

        int idade, ano;

        System.out.print("Digite sua idade: "); idade = s.nextInt();

        System.out.print("Digite em que ano estamos: "); ano = s.nextInt();

        System.out.print("Seu ano de nascimento: " + (ano - idade));


        System.out.println("\n**************Atividade 19***************\n");

        int meses;

        System.out.print("Digite sua idade: "); idade = s.nextInt();

        System.out.print("Digite quantos meses você viveu:"); meses = s.nextInt();

        dias = meses * 30;

        System.out.println("Você viveu: " + dias + " dias");


        System.out.println("\n**************Atividade 20***************\n");

        System.out.print("Digite valor de um lado do quadrado"); area = s.nextDouble();

        System.out.println("Área do quadrado: " + (area * 4));


        System.out.println("\n**************Atividade 21***************\n");

        System.out.print("Digite sua altura em metros: "); altura = s.nextDouble();

        System.out.print("Digite seu peso em quilogramas: "); peso = s.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu índice de massa corporal (IMC) é: " + imc);



        System.out.println("\n**************Atividade 23***************\n");

        double[] num_double = new double[99];

        System.out.print("Digite um numero: "); num_double[0] = s.nextDouble();

        System.out.print("Digite um numero: "); num_double[1] = s.nextDouble();

        System.out.println(Math.sqrt(num_double[0]));

        System.out.println(Math.pow(num_double[0] , num_double[1]));



        System.out.println("\n**************Atividade 24***************\n");

        System.out.print("Digite um número: "); num_double[0] = s.nextDouble();

        System.out.print("Digite um número para até qual o número anterior irá multiplicar: "); num_double[1] = s.nextInt();

        for (double i = 1; i <= num_double[1]; i++) {
            resul = num_double[0] * i;
            System.out.print(num_double[0] + " x " + i + " = " + resul + "\n");
        }



        System.out.println("\n**************Atividade 25***************\n");

        double real, dolar;

        System.out.print("Digite um valor em dolar: "); dolar = s.nextDouble(); real = dolar * 4.79;

        System.out.println("O valor na conversão é: " + real);


        System.out.println("\n**************Atividade 22***************\n");

        int num1 = 0, num2 = 0;
        MaiorNumero(num1, num2);
    }
    static void MaiorNumero(int num1, int num2) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número inteiro: "); num1 = s.nextInt();

        System.out.print("Digite um número inteiro: "); num2 = s.nextInt();

        System.out.println("O maior número é: " + Math.max(num1, num2));
    }
}
