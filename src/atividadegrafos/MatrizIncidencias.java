package atividadegrafos;

import java.util.Scanner;

/**
 *
 * @author eric
 */
public class MatrizIncidencias {

    private int n; // ordem da matriz, numero de vertices do grafo
    private int[] vetor; // vetor no qual sera armazenada a matriz triangular

    public MatrizIncidencias(int n) {
        this.n = n;
        this.vetor = new int[(n * n - n) / 2 + n];
//        this.vetor = new int[(n * n - n) / 2];
    }

    public void preencherMatriz() {
        int i; // linha da matriz
        int j; // coluna da matriz
        int k = 0; // posicao de armazenamento no vetor

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("Entre com o valor da matriz na posicao M["
                        + i + "][" + j + "] : ");
                vetor[k] = Integer.parseInt(sc.nextLine());
                k++;
            }
        }
    }

    /*
     * Metodo usado para mapear os elementos da matriz (vetor bidimensional) em
     * um vetor unidimensional.
     */
    private int mapearMatrizTriangularInferior(int i, int j) {
        if (i < j) // Inverter o sinal para conseguir uma matriz triangular superior
        {
            return (-1); //valor não existe no vetor
        } else {
            return (((i * i + i) / 2) + j);
        }
    }

    public void exibirMatriz() {
        int i, j, k, nulo = 0;
        System.out.println(" MATRIZ DE INCIDENCIA ");
        System.out.println("===========================\n");
        
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                k = mapearMatrizTriangularInferior(i, j);
                if (k != -1) {
                    System.out.print(vetor[k] + "\t");
                } else {
                    System.out.print(nulo + "\t");
                }
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
                int posicao = mapearMatrizTriangularInferior(linha, j);
                if (posicao != -1) {
                    soma = soma + vetor[posicao];
                }
            }
            return soma;
        }
    }

    public void consultarElemento(int posicao) {
//        int i, j, k;
//    if (((i>0)&&(i<N+1)) && ((j>0)&&(j<N+1)))
//    {
//        k = Map_Mat_tri_inf(i,j);
//        if (k==-1)
//        printf("O Valor procurado é 0");
//        else printf("O Valor procurado é %5d",X[k]);
//    }
//    else printf(" Os valores da linha ou coluna estão fora da Matriz de dimensão %d x %d\n",N,N);;
    }
}
