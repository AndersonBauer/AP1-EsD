// Classe Sorting.java
public class Sorting {
    public enum Algoritmo { BUBBLE , MERGE }

    public static void bubbleSort(int[] vetor ){
        int n = vetor.length;
        boolean trocou;
        for (int i = 0; i < n -1; i++){
            trocou = false;
            for (int j = 0; j < n -1 - i; j++){
                if (vetor[j] > vetor[ j + 1]){
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j +1] = temp;
                    trocou = true;
                }
            }
            if (!trocou){
                break;
            }
        }
    }

    public static void mergeSort(int[] vetor, int comeco, int fim){
        if(comeco < fim){
            int meio = comeco + (fim - comeco) / 2;
            mergeSort(vetor, comeco, meio );
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, comeco, meio, fim);
        }
    }
    private static void merge(int[] vetor, int comeco, int meio, int fim){
        int n1 = meio - comeco + 1;
        int n2 = fim - meio;
        int[] C = new int[n1];
        int[] F = new int[n2];
        for(int i = 0; i < n1; i++) C[i] = vetor[comeco + i];
        for(int j = 0; j < n2; j++) F[j] = vetor[meio + 1 + j];

        int i = 0;
        int j = 0;
        int k = comeco;
        while (i < n1 && j < n2){
            if(C[i] <= F[j]) vetor[k++] = C[i++];
            else vetor[k++] = F[j++];
        }
        while (i < n1 ) vetor[k++] = C[i++];
        while (j < n2 ) vetor[k++] = F[j++];
    }
}
