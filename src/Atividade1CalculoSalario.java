import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade1CalculoSalario {

    public static void main(String[] args) {
        /*
        Um funcionário deseja saber qual o valor líquido anual que recebe da sua empresa.
        Para tal cálculo é necessário considerar que o funcionário recebe o salário + décimo terceiro + férias
        e não esqueça de considerar o desconto do inss, não vamos trabalhar com imposto de renda nesse momento.
        O inss tem desconto com base no valor mensal que o funcionário recebe e para isso vamos utilizar a regra a seguir:
        de 0 até 1212.00 -> 7,5%.
        de 1212.01 até 2427,35 -> 9%.
        de 2427,36 até 3641,03 -> 12%.
        de 3641,04 até 7087,22 -> 14%.
        acima de 7087,22 deve ser descontado o teto de 900 reais.

        O resultado final apresentado ao funcionário deve ter o salário anual bruto, total anual de inss descontado e o salário anual líquido final.
         */
        double salarioBrutoAnual = 0;
        double salarioBrutoMensal = 0;
        double descontoINSSAnual = 0;
        double salarioLiquidoAnual = 0;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Por favor, informe seu salário bruto mensal: ");
        salarioBrutoMensal = scan.nextDouble();

        salarioBrutoAnual = (salarioBrutoMensal * 13) + (salarioBrutoMensal * 1/3); //(12 parcelas + 13º salário) + 1/3 de férias

        if (salarioBrutoMensal <= 1212.00) {
            descontoINSSAnual = salarioBrutoAnual * 0.075; //considerando 12 meses trabalhados
            salarioLiquidoAnual = salarioBrutoAnual - descontoINSSAnual;
        } else if (salarioBrutoMensal >= 1212.01 && salarioBrutoMensal <= 2427.35) {
            descontoINSSAnual = salarioBrutoAnual * 0.09;
            salarioLiquidoAnual = salarioBrutoAnual - descontoINSSAnual;
        } else if (salarioBrutoMensal >= 2427.36 && salarioBrutoMensal <= 3641.03) {
            descontoINSSAnual = salarioBrutoAnual * 0.12;
            salarioLiquidoAnual = salarioBrutoAnual - descontoINSSAnual;
        } else if (salarioBrutoMensal >= 3641.03 && salarioBrutoMensal <= 7087.22) {
            descontoINSSAnual = salarioBrutoAnual * 0.14;
            salarioLiquidoAnual = salarioBrutoAnual - descontoINSSAnual;
        } else {
            descontoINSSAnual = 900.00 * 12; // considerando o teto de 900 reais/mes
            salarioLiquidoAnual = salarioBrutoAnual - descontoINSSAnual;
        }

        System.out.println("Seu salário bruto anual é: " + df.format(salarioBrutoAnual) + " reais.");
        System.out.println("O desconto anual do INSS é: " + df.format(descontoINSSAnual) + " reais.");
        System.out.println("Seu salário líquido anual com desconto é: " + df.format(salarioLiquidoAnual) + " reais.");

    }
}
