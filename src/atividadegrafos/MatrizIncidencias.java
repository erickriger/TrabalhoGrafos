package atividadegrafos;

import java.util.Scanner;

/**
 *
 * @author eric
 */
public class MatrizIncidencias {

    private int n; // ordem da matriz, numero de vertices do grafo
    private int[][] matriz;

    public MatrizIncidencias(int n) {
        this.n = n;
        this.matriz = new int[n][n];
    }

    public void preencherMatriz() {
        int i; // linha da matriz
        int j; // coluna da matriz

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("Entre com o valor da matriz na posicao M["
                        + i + "][" + j + "] : ");
                matriz[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        espelharMatrizTriangular();
    }

    private void espelharMatrizTriangular() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 0;
                } else if (i < j) {
                    matriz[i][j] = matriz[j][i];
                }
            }
        }
    }

    public void exibirMatriz() {
        System.out.println(" MATRIZ DE INCIDENCIA ");
        System.out.println("===========================\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int somarLinhaMatriz(int linha) {
        int soma = 0;
        if ((linha < 0) || (linha >= n)) {
            return -1;
        } else {
            for (int j = 0; j < n; j++) {
                soma = soma + matriz[linha][j];
            }
        }
        return soma;
    }
}
