package exercicios;
import java.util.Scanner;

public class Media {

    public static void main(String[]args){
        float num1,num2,num3,num4,result ;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero 1: ");
        num1 = entrada.nextFloat();

        System.out.println("Digite o numero 2: ");
        num2 = entrada.nextFloat();

        System.out.println("Digite o numero 3: ");
        num3 = entrada.nextFloat();

        System.out.println("Digite o numero 4: ");
        num4 = entrada.nextFloat();

        result = (num1+num2+num3+num4)/4;
        System.out.println("Resultado da Média: " + result);

        if (result >= 6){
            System.out.println("Aprovado");
        } else if (result == 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

}
