import java.util.Scanner;
import java.util.Random;

public class Aula04Arrays {

    public static void main(String[] args) {

        /* Caso tamanho de matriz = 2
        [0][0]
        [0][0]
         */

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Por favor, informe o tamanho da matriz que deseja: ");
        int tamanho = scan.nextInt();
        int linhas;
        int colunas;

        int matriz[][] = new int [tamanho][tamanho];

        for (linhas = 0; linhas < matriz.length; linhas++) {
            for (colunas = 0; colunas < matriz[linhas].length; colunas++){
                matriz[linhas][colunas] = random.nextInt(9);
                System.out.print(matriz[linhas][colunas] + " ");
            }
            System.out.println("\n");
        }
    }
}
