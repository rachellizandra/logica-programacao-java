import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Atividade3ArrayCrescente {

    public static void main(String[] args) {

        /*
        Dado um array de n posições, todas preenchidas com números inteiros,
        crie um algoritmo capaz de ordenar o array e colocar os números em ordem crescente.
        Regras:

        O array deve ser criado com o tamanho informado pelo usuário.
        O preenchimento deve ser feito com números gerados aleatoriamente.
        A ordenação deve ocorrer de forma crescente, conforme mostrado no exemplo.
        Deve ser impresso o array antes da ordenação e após, assim possibilitando a comparação visual.
         */
        Scanner scan = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Por favor, informe o tamanho da array que deseja: ");
        int tamanho = scan.nextInt();

        int arrayCrescente[] = new int[tamanho];

        for (int i = 0; i < arrayCrescente.length; i++) {
            arrayCrescente[i] = new Random().nextInt(60) + 1;
        }
        Arrays.sort(arrayCrescente);
        System.out.println(Arrays.toString(arrayCrescente));
    }
}
