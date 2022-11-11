public class QuadradoPerfeito {

    public static void main(String[] args) {
        int[][] matriz = montarEPreencheQuadradoPerfeito();

        // Montando a lógica da matriz chamada
        int linha1 = 0;
        int coluna1 = 0;
        boolean QuadradoPerfeito = true;

        // Somando cada linha, coluna, diagonal principal e segundária
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            int linhaTotal = 0;
            int colunaTotal = 0;
            for (int colunas = 0; colunas < matriz.length; colunas++) {
                if (linhas == 0) {
                    linha1 += matriz[linhas][colunas];
                    coluna1 += matriz[colunas][linhas];
                }
                linhaTotal += matriz[linhas][colunas];
                colunaTotal += matriz[colunas][linhas];
            }

            // Inserindo a lógica de condição para quando o quadrado não é perfeito
             if (linhaTotal != linha1 || linhaTotal != colunaTotal || colunaTotal != coluna1 || coluna1 != linha1) {
                QuadradoPerfeito = false;
            }
        }
        // Para verificar se a matriz é perfeita ou não
        if (QuadradoPerfeito) {
            System.out.println("É um quadrado perfeito");
        } else {
            System.out.println("Não é um quadrado perfeito");
        }
    }

    public static int[][] montarEPreencheQuadradoPerfeito() {
        int[][] matriz = {
                {20,6,7,17},
                {9,15,14,12},
                {13,11,10,16},
                {8,18,19,5}
        };
        return matriz;
    }

}







