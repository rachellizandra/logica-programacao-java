import java.util.Scanner;

public class Atividade2Losango {
    public static void main(String[] args) {
/*
        Nesse exercício deve ser desenhado um losangulo no console. Para isso teremos as seguintes regras:
        O usuário deve informar o tamanho do losangulo, esse tamanho trata da quantidade de colunas a serem utilizadas.
        O tamanho mínimo para o desenho é de 5 colunas. Não existe limitação para o tamanho máximo.
*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite quantas linhas a serem impressas");
        int entrada = scan.nextInt();
        int r = 2;

        int linhas;

        if(entrada % 2 != 0) {
            r = 1;
            linhas = (entrada - 1) / 2;
        } else {
            linhas = entrada / 2;
        }

        if(entrada >= 5) {
            if(r == 1) {
                for (int z = 1; z <= entrada; z++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            // parte superior
            for (int i=1; i < linhas; i++)
            {
                for (int j = i; j <= linhas; j++)
                {
                    System.out.print("*");
                }
                for (int k = 1; k <= i*2-r; k++)
                {
                    System.out.print(" ");
                }
                for (int l = i; l <= linhas; l++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            // parte inferior

            for (int i = 1; i <= linhas; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print("*");
                }
                for (int k = i*2-2; k < linhas*2-r; k++)
                {
                    System.out.print(" ");
                }
                for (int l = 1; l <= i; l++)
                {
                    System.out.print("*");
                }

                System.out.println();
            }
            if(r == 1) {
                for (int z = 1; z <= entrada; z++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }

        } else {
            System.out.println("Você deve escolher um tamanho maior ou igual que 5");
        }
        scan.close();
    }
}





