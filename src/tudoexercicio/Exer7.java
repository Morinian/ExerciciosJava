package tudoexercicio;

import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = scanner.nextDouble();
        double comissao = 0.05 * salarioBase;

        double salarioLiquido = salarioBase + comissao;

        System.out.println("Salário base: R$" + salarioBase);
        System.out.println("Comissão (5%): R$" + comissao);
        System.out.println("Salário líquido: R$" + salarioLiquido);

        scanner.close();
    }
}
