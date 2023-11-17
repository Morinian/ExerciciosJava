package condicionais;

import java.util.Scanner;

public class ExerUm {
    public static void main(String[]args){

        int Num;

        Scanner numero = new Scanner(System.in);

        System.out.println("Digite o numero");
        Num = numero.nextInt();

        if(Num % 10 == 0){
            System.out.println( Num + " e divisivel por 10");
        } else if (Num % 5 == 0) {
            System.out.println( Num + " e divisivel por 5");
        } else if (Num % 2 == 0) {
            System.out.println( Num + " e divisivel por 2");
        } else {
            System.out.println(Num + " não e divisivel por 10" + Num);
        }

    }

}
