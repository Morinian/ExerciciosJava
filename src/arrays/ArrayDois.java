package arrays;

public class ArrayDois {

    public static void main(String[]args){

        String DiaSemana [] = {"Domingo","Segunda","terça","Quarta", "Quinta" , "Sexta", "Sabado"};
        int NumDia[] = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Minha semana tem " + NumDia.length + " dias");

        for (int n=0; n<=DiaSemana.length; n++){
            System.out.println("o " + DiaSemana[n] + " corresponde a " + NumDia[n] ); ;
        }
    }

}
