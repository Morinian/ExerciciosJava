package exercicios;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        float peso;
        float altura;
        float imc;

        Scanner valor = new Scanner(System.in);
        System.out.println("Entre com o seu peso: ");
        peso = valor.nextFloat();
        System.out.println("Entre com a sua altura: ");
        altura = valor.nextFloat();
        imc = peso / (altura * altura);
        System.out.println("O resultado do seu imc é " + imc);


        if (imc <= 18.5) {
            System.out.println("Sua Classificação é de Magreza");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Sua Classificação Está Dentro do Normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sua Classificação é de Sobrepeso I");
        } else if (imc >= 30.0 && imc <= 39.9) {
            System.out.println("Sua Classificação é Obesidade II");
        } else if (imc >= 40.0) {
            System.out.println("Sua Classificação é Obesidade Grave III");
        }
    }
}
