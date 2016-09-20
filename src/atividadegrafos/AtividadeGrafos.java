package atividadegrafos;

import java.util.Scanner;

/**
 *
 * @author eric
 */
public class AtividadeGrafos {

    static Grafo grafo;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("########## ATIVIDADE - GRAFOS ##########");
        System.out.println(" O programa executará operações sobre um grafo, "
                + "fornecido pelo usuario na forma de matriz de incidências.");
        System.out.print(" Digite o número de vértices do grafo: ");
        Scanner sc = new Scanner(System.in);
        grafo = new Grafo(Integer.parseInt(sc.nextLine()));
        grafo.getMatriz().preencherMatriz();
        grafo.getMatriz().exibirMatriz();

        menu();
    }

    public static void menu() {
        int opcao;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n ========== MENU ==========\n");
            System.out.println("1. Determinar o grau de um vértice, d(v)");
            System.out.println("2. Determinar o grau máximo e o grau mínimo do grafo");
            System.out.println("3. Determinar a vizinhança de um vértice, N(v)");
            System.out.println("4. Determinar a sequência de graus do grafo, do maior para o menor");
            System.out.println("5. Determinar se o grafo é conexo");
            System.out.println("0. Sair");
            System.out.print("\n Digite a opção desejada: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    grafo.determinarGrauVertice();
                    break;
                case 2:
                    grafo.determinarGrausMaximoMinimo();
                    break;
                case 3:
                    grafo.determinarVizinhancaVertice();
                    break;
                case 4:
                    grafo.determinarSequenciaGrausDecrescente();
                    break;
                case 5:
                    grafo.determinarGrafoConexo();
                    break;
                case 0:
                    return;
                default:
                    System.out.println(" Opcao invalida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}
