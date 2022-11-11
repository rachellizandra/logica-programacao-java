import java.util.Scanner;

public class Aula04MatrizInversa {

    public static void main(String[] args) {
        /*
        [][][]
        [][][]
        [][][]

        [][][][]
        [][][][]
        [][][][]


         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, informe o tamanho da matriz que deseja: ");
        int tamanho = scan.nextInt();
        int[][] matriz = new int [tamanho][tamanho];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if(coluna == matriz.length - linha - 1) {
                    matriz[linha][coluna] = 1;
                }
                System.out.print("[" + matriz[linha][coluna] + "]");
            }
            System.out.println();
        }
    }
}
