import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        double valorA, valorB, valorC;

        Scanner s = new Scanner(System.in);

        System.out.print("Digite um valor: "); valorA = s.nextDouble();


        //A
        System.out.println("\nValor arredondado para cima: " + Math.ceil(valorA));

        //B
        System.out.println("Valor arredondado para baixo: " + Math.floor(valorA));

        //C
        System.out.println("Um valor gerado aleatoriamente: " + Math.random());

        //D
        System.out.println("Valor absoluto do número fornecido pelo usuário: " + Math.abs(valorA));

        System.out.print("\nDigite um valor: "); valorB = s.nextDouble();

        //E
        System.out.println("\nO maior valor entre valor 1 e valor 2 é: " + Math.max(valorA, valorB));

        //F
        System.out.println("O menor valor entre valor 1 e valor 2 é: " + Math.min(valorA , valorB));

        System.out.print("\nDigite um valor entre -1 e 1: "); valorC = s.nextDouble();

        //G
        System.out.println("\nO seno do ângulo em radianos é: " + Math.asin(valorC));

        //H
        System.out.println("O cosseno do ângulo em radianos é: " + Math.acos(valorC));
    }
}
