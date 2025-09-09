import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = sc.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int colunas = sc.nextInt();

        Matriz matriz = new Matriz(linhas,colunas);

        System.out.println("Somo deseja preecher a matriz?");
        System.out.println("1 - Manual");
        System.out.println("2- Automático");

        int escolha = sc.nextInt();

        if (escolha == 1) {
            matriz.preencherManual(sc);
        } else {
            matriz.preencherAutomatico();
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Exibir matriz");
            System.out.println("2 - Remover elemento");
            System.out.println("3 - Ordenar por linhas");
            System.out.println("4 - Ordenar por colunas");
            System.out.println("5 - Ordenar matriz por completa");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    matriz.exibir();
                    break;

                case 2:
                    System.out.print("Linha: ");
                    int linhaRemover = sc.nextInt();
                    System.out.println("Coluna: ");
                    int colunaRemover = sc.nextInt();
                    matriz.removerElemento(linhaRemover, colunaRemover);
                    break;

                case 3:
                    matriz.ordenarLinhas(Sorting.Algoritmo.BUBBLE);
                    System.out.println("Linhas ordenadas com BubbleSort!");
                    break;

                case 4: matriz.ordenarColunas(Sorting.Algoritmo.MERGE);
                    System.out.println("Colunas ordenadas com MergeSort!");
                    break;

                case 5: matriz.ordenarMatrizCompleta(Sorting.Algoritmo.MERGE);
                    System.out.println("Matriz inteira ordenada com MergeSort!");
                    break;

                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }

        }

        sc.close();
    }
}