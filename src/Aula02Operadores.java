public class Aula02Operadores {
    public static void main(String[] args) {

        //byte, short, int, long, float, double, char, boolean
        byte b1 = 127;
        short s1 = 5000;
        int i1 = 10000;
        long l1 = 50000;
        float f1 = 1000;
        double d1 = 100.0D;
        char c1 = 'A';
        boolean verdadeiro = true;
        boolean falso = false;

        // + - * / %
        double d2 = 2.5;
        double d3 = 2.5;
//        System.out.println(d2 + d3);

        // > < <= >= == !=
        int numero1 = 10;
        int numero2 = 11;
        boolean isNumero1MaiorQueNumero2 = numero1 > numero2;
        boolean isNumero2MaiorQueNumero1 = numero1 < numero2;

        //        System.out.println(numero1 <= numero2);
        //        System.out.println(numero1 == numero2); // comparação
        //        System.out.println(numero1 != numero2);

        // && (and) || (ou) ! (negação)
        int tempoEmpresa = 1;
        double salario = 1000;
        boolean isPossivelAumento = tempoEmpresa > 2 && salario >= 4000;

        isPossivelAumento = tempoEmpresa >2 || salario >= 4000;

        boolean b3 = true;

        System.out.println(!isPossivelAumento);

        // = += *= -= /= %=
        int i5 = 10;
        i5 = i5 + 5;
        i5 += 5;
        i5 =  i5 * 2;
        i5 *= 2;
        i5 = i5 - 5;
        i5 -= 5;
        i5 = i5 / 2;
        i5 /= 2;
        i5 = i5 % 2;
        i5 %= 2;
//        System.out.println(i5);

        // ++ --
        int inteiro = 0;

        System.out.println(inteiro++);
        System.out.println(inteiro);

        int decremento = 10;
        System.out.println(--decremento);
    }
}
