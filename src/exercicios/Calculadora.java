package exercicios;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        float num1;
        float num2;

        float result;

        int opera;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero 1: ");
        num1 = entrada.nextFloat();

        System.out.println("Digite o numero 2: ");
        num2 = entrada.nextFloat();

        System.out.println("Escolha: ");
        System.out.println("1 = Soma");
        System.out.println("2 = Subtração");
        System.out.println("3 = Divisão");
        System.out.println("4 = Multiplicacao");

        opera = entrada.nextInt();

        if (opera == 1) {
            result = num1 + num2;
            System.out.println("O resultado da sua operação: " + result);
        } else if (opera == 2) {
            result = num1 - num2;
            System.out.println("O resultado da sua operação: " + result);
        }else if (opera == 3){
            result = num1 / num2;
            System.out.println("O resultado da sua operação: " + result);
        }else if (opera == 4){
            result = num1 * num2;
            System.out.println("O resultado da sua operação: " + result);
        }else {
            System.out.println("Você digitiou a opração inexistente ou errada");
        }

    }

}
