package atividadegrafos;

import java.util.Scanner;

/**
 *
 * @author eric
 */
public class Grafo {
    private int numeroVertices;
    private int[] sequenciaGraus;
    private MatrizIncidencias matriz;
    private boolean convexo;

    public Grafo() {
    }

    public Grafo(int numeroVertices) {
        this.numeroVertices = numeroVertices;
        this.matriz = new MatrizIncidencias(numeroVertices);
    }

    public void determinarGrauVertice() {
        System.out.print(" Digite o vértice (v): ");
        Scanner sc = new Scanner(System.in);
        int v = Integer.parseInt(sc.nextLine());
        int grau = matriz.somarLinhaMatriz(v);
        if (grau != -1) {
            System.out.println(" O grau do vértice '" + v + "' é " + grau + ".");
        } else {
            System.out.println(" O vértice '" + v + "' não existe no grafo.");
        }
    }
    
    public void determinarGrausMaximoMinimo() {
        int grauMaximo = 0;
        int grauMinimo = numeroVertices * numeroVertices;
        
        for (int i = 0; i < numeroVertices; i++) {
            int grau = matriz.somarLinhaMatriz(i);
            if ((grau != -1) && (grauMaximo < grau)) {
                grauMaximo = grau;
            }
            
            if ((grau != -1) && (grauMinimo > grau)) {
                grauMinimo = grau;
            }
        }
        
        System.out.println(" Grau Mínimo: " + grauMinimo);
        System.out.println(" Grau Máximo: " + grauMaximo);
    }
    
    public void determinarVizinhancaVertice() {
        // determinar
    }
    
    public void determinarSequenciaGrausDecrescente() {
        // determinar
    }
    
    public void determinarGrafoConexo() {
        // determinar
    }
    
    public int getNumeroVertices() {
        return numeroVertices;
    }

    public void setNumeroVertices(int numeroVertices) {
        this.numeroVertices = numeroVertices;
    }

    public int[] getSequenciaGraus() {
        return sequenciaGraus;
    }

    public void setSequenciaGraus(int[] sequenciaGraus) {
        this.sequenciaGraus = sequenciaGraus;
    }

    public MatrizIncidencias getMatriz() {
        return matriz;
    }

    public void setMatriz(MatrizIncidencias matriz) {
        this.matriz = matriz;
    }

    public boolean isConvexo() {
        return convexo;
    }

    public void setConvexo(boolean convexo) {
        this.convexo = convexo;
    }
    
    
}
