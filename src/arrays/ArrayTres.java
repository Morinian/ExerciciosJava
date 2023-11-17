package arrays;

import java.util.Arrays;

public class ArrayTres {
        public static void main (String[] args){
            String ListaQuadrinhos[]= {"Demolidor", "Homem Aranha", "X-man", "wolverine", "Akira", "One Piece",};
            System.out.println("Na minha coleção de quadrinhos eu tenho " + ListaQuadrinhos.length + " quadrinhos");

            Arrays.sort(ListaQuadrinhos);

            for (String Quadrinhos: ListaQuadrinhos){
                System.out.println("Lista: " + Quadrinhos );
            }
        }

}
