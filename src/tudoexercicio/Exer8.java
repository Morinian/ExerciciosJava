package tudoexercicio;

import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int segundoNumero = scanner.nextInt();

        int temp = primeiroNumero;
        primeiroNumero = segundoNumero;
        segundoNumero = temp;

        System.out.println("Valores trocados:");
        System.out.println("Primeiro número: " + primeiroNumero);
        System.out.println("Segundo número: " + segundoNumero);

        scanner.close();
    }
}
