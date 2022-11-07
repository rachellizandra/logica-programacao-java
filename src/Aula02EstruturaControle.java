import java.util.Scanner;

public class Aula02EstruturaControle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, informe o seu nome: ");
        String nome = scan.next();

        System.out.println("Por favor, informe sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println(nome + ", você é maior de idade");
        } else {
            System.out.println(nome + ", você é menor de idade");
        }

        // //       [condição] ? [bloco caso seja true] : [bloco caso seja false]
        ////        String mensagem = idade >= 18 ? nome + " você é maior de idade" : nome + " você é menor de idade";

        // System.out.println(mensagem);

        System.out.println("Informe o dia da semana: ");
        Scanner scan = new Scanner(System.in);

        int diaDasSemana = scan.nextInt();
        //byte, short, char, int, Enum, String
        switch (diaDasSemana) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia inválido");
                break;
    }
}
