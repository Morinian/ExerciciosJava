package tudoexercicio;

import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do depósito mensal: ");
        double depositoMensal = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em decimal): ");
        double taxaJurosMensal = scanner.nextDouble();

        int meses = 12;

        double montante = calcularMontante(depositoMensal, taxaJurosMensal, meses);

        System.out.println("O montante após 12 meses é: R$" + montante);

        scanner.close();
    }
    public static double calcularMontante(double depositoMensal, double taxaJurosMensal, int meses) {
        double montante = 0;
        for (int i = 0; i < meses; i++) {
            montante += depositoMensal;
            montante *= (1 + taxaJurosMensal);
        }
        return montante;
    }
}
