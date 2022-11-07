public class HelloWorld {
    public static void main(String[] args) {

        // [Tipo] [nomeVariavel]

        String primeiraVariavel = "Hello World";

        // long, float, double, int, short, byte, char, boolean

        byte b1 = 100;
        short s1 = 30000;
        char c = 78;
        char c1 = 'N';
        System.out.println(c == c1);

        int idade = 25;

        int numero1 = 10;
        int numero2 = 20;
        int resultadoSoma = numero1 + numero2;
        int resultadoSubtracao = numero2 - numero1;
        int resultadoMultiplicao = numero1 * numero2;
        int resultadoDivisao = numero2 / numero1;
        int restoDivisao = numero2 % 2;

        String resultado = "O resultado da divisão é " + restoDivisao;


        System.out.println(resultado);
    }
}