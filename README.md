Relatório de Estrutura de Dados - AP1
Nomes: Anderson Bauer & Suelen Daitx

1 - Descrição da classe Matriz:
  Atributos:
    * Linhas e Colunas: dimensão da matriz.
    * Dados: Matriz dimensional que armazena valores inteiros.
  Métodos principais:
    * preencherManual ( Scanner sc ): preenche a matriz com valores digitados pelo usuário.
    * preencherAutomatico(): preenche automaticamente com valores aleatórios.
    * removerElementos( int linha, int colunas ): remove um elemento, substitui por 0. 
    * ordenarMatrizCompleta(alg): ordenam os dados com o algoritmo escolhido (BubbleSort ou MergeSort).
    * aplicarOrdenacao(valor, alg): aplica o algoritmo de ordenção sobre o vetor auxiliar.
    * Responsabilidade da Classe: gerenciar os dados da matriz ( armazenamento, exibição, manipulação e ordenação).
2 - Explicação da Lógica Utilizada:
  Preenchimento:
    * Manual: usuário digita cada elemento.
    * Automático: uso da classe Random para gerar valores entre 0 e 99.
    * Remoção: valida posição e substitui por zero.
    * Exibição: percorre linha por linha, exibindo todos os elementos.
    * Ordenação por linhas: transforma cada linha em valor, ordena e retorna para a matriz.
    * Ordenação por colunas: semelhante, mas feito em cada coluna.
    Ordenação completa: converte a matriz em um unico vetor, ordena e distribui novamente.
3 - Comparação dos Algoritmos de Ordenação:
  BubbleSort:
    * Abordagem: iterativo, compara pares e faz trocas sucessivas.
    * Complexidade: O(n²) no pior caso.
    * Mais eficiente: em matrizes pequenas ou quase ordenadas ( porque pode para antes quando não há trocas ).
  MergeSort:
    * Abordagem: recursivo, divide e conquista ( divide o vetor ao meio e depois mescla).
    * Complexidade: O( n log n ) em todos os casos.
    * Mais eficiente: em matrizes grandes, pois mantém o desempenho estável.
4 - Conclusão:
  Dificuldades enfrentadas:
    * Manipulação da matriz em vetores auxiliares para ordenação.
    * Integração da lógica de ordenação resursiva ( MergeSort ).
    * Garantir que o código seja flexível para escolher entre algoritmos.
  Aprendizados obtidos:
    * Diferença entre algoritmos iterativos e recursivos.
    * Importância de escolher o algoritmo conforme o tamanho da entrada.
    * Aplicação da prática da Programação Orientada a Objetos, encapsulando responsabilidades na classe Matriz.
    *reforço do uso da UML emntal ( matriz -> vetor -> matriz).
