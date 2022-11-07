import java.util.Scanner;

public class Aula03Loop {
    public static void main(String[] args) {

        // EXEMPLO 1

    // while, do while, for
//        int contador = 0;
//        while (contador < 10) {
//            System.out.println(contador);
//            contador++;
//
//        for(int i =0; i < 10; i++) {
//            System.out.println("O valor de i é: " + i);
//        }

        // EXEMPLO 2
//        double valorTotal = 2000.00;
//        double valorParcela;
//        for(int parcela = 1; parcela <= valorTotal; parcela++) {
//            valorParcela = valorTotal / parcela;
//
//            if(valorParcela >= 1000) {
//                System.out.println("Parcela " + parcela + " valor R$" + valorParcela);
//            } else {
//                break;
//            }
//        }
//        System.out.println(parcela);

        // EXEMPLO 3

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite quantas linhas a serem impressas");
        int linhas = scan.nextInt();

        for (int i = linhas; i >= 0 ; i--){
           for(int k = 1; k <= i; k++) {
               System.out.print("*");
           }
            System.out.print("\n");
        }
    }
}
