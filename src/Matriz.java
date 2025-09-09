import java.util.Random;
import java.util.Scanner;

public class Matriz {
    private int linhas;
    private int colunas;
    private int dados [][];

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.dados = new int[linhas][colunas];
    }

    public void preencherManual(Scanner sc) {
        System.out.println("Digite os valores da matriz (" + linhas + "x" + colunas +"):");
        for (int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                dados[i][j] = sc.nextInt();

            }
        }
    }

    public void preencherAutomatico() {
        Random rand = new Random();
        for (int i =0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                dados [i][j] = rand.nextInt(100);
            }
        }
    }

    public void removerElemento(int linha, int coluna) {
        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
            dados[linha][coluna] = 0;
        } else {
            System.out.println("Posição inválida");
        }
    }

    public void exibir() {
        System.out.println("Matriz: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(dados [i][j] + " ");
            }
            System.out.println();
        }
    }

    public void ordenarLinhas(Sorting.Algoritmo alg) {
        for (int i = 0; i < linhas; i++) {
            int[] linha = new int [colunas];
            for (int j = 0; j < colunas; j++) {
                linha[j] = dados [i][j];
            }

            aplicarOrdenacao(linha, alg);

            for (int j = 0; j < colunas; j++) {
                dados[i][j] = linha[j];
            }

        }
    }

    public void ordenarColunas(Sorting.Algoritmo alg) {
        for (int j = 0; j < colunas; j++) {
            int[] coluna = new int[linhas];
            for (int i = 0; i < linhas; i++) coluna [i] = dados [i][j];

            aplicarOrdenacao(coluna, alg);

            for (int i = 0; i < linhas; i++) dados [i][j] = coluna[i];
        }
    }

    public void ordenarMatrizCompleta(Sorting.Algoritmo alg) {
        int n = linhas * colunas;
        int[] vetor = new int[n];
        int idx = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                vetor[idx++] = dados [i][j];
            }
        }

        aplicarOrdenacao(vetor,alg);

        idx = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                dados[i][j] = vetor[idx++];

            }
        }
    }

    private void aplicarOrdenacao(int[] vetor, Sorting.Algoritmo alg) {
        if (alg == Sorting.Algoritmo.BUBBLE) {
            Sorting.bubbleSort(vetor);
        } else if (alg == Sorting.Algoritmo.MERGE) {
            Sorting.mergeSort(vetor, 0, vetor.length - 1);
        }
    }
}

