package Atividade_2;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        String nome, cidade, rua, estado, cep, cpf, telefone;
        int[] number_int = new int[99];
        int idade, numero_casa;
        double[] number_double = new double[99];



        System.out.println("\n**************Atividade 1***************\n");

        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu nome: "); nome = s.nextLine();

        System.out.print("Digite sua cidade: "); cidade = s.nextLine();

        System.out.println("Olá " + nome + ", você mora na cidade de " + cidade);



        System.out.println("\n**************Atividade 2***************\n");

        System.out.print("Digite seu nome: "); nome = s.nextLine();

        System.out.print("Boas-vindas " + nome);



        System.out.println("\n**************Atividade 3***************\n");

        System.out.print("Digite sua idade: "); idade = s.nextInt();

        System.out.println("Sua idade é " + idade);



        System.out.println("\n**************Atividade 4***************\n");

        System.out.print("Digite um número inteiro: "); number_int[0] = s.nextInt();

        System.out.println("O número digitado foi " + number_int[0]);



        System.out.println("\n**************Atividade 5***************\n");

        System.out.print("Digite um número decimal: "); number_double[0] = s.nextDouble();

        System.out.println("O número digitado foi " + number_double[0]);



        System.out.println("\n**************Atividade 6***************\n");

        System.out.print("Digite um número inteiro: "); number_int[0] = s.nextInt();
        System.out.print("Digite um número inteiro: "); number_int[1] = s.nextInt();

        System.out.print("Números fornecidos: " + number_int[0] + " " + number_int[1]);



        System.out.println("\n**************Atividade 7***************\n");

        System.out.print("Digite seu nome: "); nome = s.nextLine();
        nome = s.nextLine();

        System.out.print("Digite sua cidade: "); cidade = s.nextLine();

        System.out.print("Digite sua idade: "); idade = s.nextInt();

        System.out.println("Olá " + nome + ", sua idade é " + idade + ", você mora em " + cidade);



        System.out.println("\n**************Atividade 8***************\n");

        System.out.print("Digite um número inteiro: "); number_int[0] = s.nextInt();

        System.out.print("Digite um número decimal: "); number_double[0] = s.nextDouble();

        System.out.print("Números fornecidos: " + number_int[0] + " " + number_double[0]);



        System.out.println("\n**************Atividade 9***************\n");

        System.out.print("Digite seu nome: "); nome = s.nextLine();
        nome = s.nextLine();

        System.out.print("Digite sua rua: "); rua = s.nextLine();

        System.out.print("Número da casa: "); numero_casa = s.nextInt();

        System.out.print("Digite seu CEP: "); cep = s.nextLine();
        cep = s.nextLine();

        System.out.print("Digite sua cidade: "); cidade = s.nextLine();

        System.out.print("Digite seu Estado: "); estado = s.nextLine();

        System.out.print("Digite seu CPF: "); cpf = s.nextLine();

        System.out.print("Digite seu telefone: "); telefone = s.nextLine();

        System.out.println("Nome........: " + nome);
        System.out.println("Endereço....: " + rua + ", " + numero_casa + ", " + cep);
        System.out.println("Cidade......: " + cidade);
        System.out.println("Estado......: " + estado);
        System.out.println("CPF.........: " + estado);
        System.out.println("Tel. Celular:" + telefone);

        System.out.println("\n**************Atividade 10***************\n");

        System.out.print("Digite um número: "); number_double[0] = s.nextDouble();
        System.out.print("Digite um número: "); number_double[1] = s.nextDouble();

        number_double[1] = number_double[2];
        number_double[2] = number_double[3];
        number_double[3] = number_double[1];
    }
}
