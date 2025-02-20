# Gerador de Arrays e Testes de Algoritmos de Ordenação

Este projeto implementa um gerador de arrays de diferentes tipos e tamanhos para testar diversos algoritmos de ordenação. Ele mede o tempo de execução de cada algoritmo em diferentes cenários e calcula métricas estatísticas como média e desvio padrão.

## Funcionalidades
- Gera arrays em diferentes formatos:
  - Crescente
  - Decrescente
  - Aleatório sem repetição
  - Aleatório com repetição
- Executa e mede o tempo de execução de vários algoritmos de ordenação:
  - Bubble Sort
  - Insertion Sort
  - Selection Sort
  - Heap Sort
  - Shell Sort
  - Merge Sort
  - Quick Sort
- Calcula estatísticas dos tempos de execução:
  - Média
  - Desvio padrão

## Como executar
1. Compile o programa usando o seguinte comando:
   ```bash
   javac GeradorDeArrays.java
   ```
2. Execute o programa:
   ```bash
   java GeradorDeArrays
   ```

O programa gerará e testará os arrays para diferentes algoritmos de ordenação e tamanhos predefinidos.

## Estrutura do Código
- **`gerarArrayCrescente(int tamanho)`**: Gera um array ordenado em ordem crescente.
- **`gerarArrayDecrescente(int tamanho)`**: Gera um array ordenado em ordem decrescente.
- **`gerarArrayAleatorioSemRepetidos(int tamanho)`**: Gera um array aleatório sem valores repetidos.
- **`gerarArrayAleatorioComRepetidos(int tamanho)`**: Gera um array aleatório com valores repetidos.
- **`testarAlgoritmos(String tipo, int[] arrayOriginal)`**: Mede o tempo de execução de cada algoritmo de ordenação e calcula estatísticas.
- **`calcularMedia(long[] tempos)`**: Calcula a média dos tempos de execução.
- **`calcularVariancia(long[] tempos, double media)`**: Calcula a variância dos tempos de execução.
- **Algoritmos de ordenação implementados**:
  - `bubbleSort(int[] array)`
  - `insertionSort(int[] array)`
  - `selectionSort(int[] array)`
  - `heapSort(int[] array)`
  - `shellSort(int[] array)`
  - `mergeSort(int[] array, int esquerda, int direita)`
  - `quickSort(int[] array, int esquerda, int direita)`

## Exemplo de Saída
```bash
Tamanho do array: 128
Tipo de array: Crescente
Algoritmo: bubbleSort
Tempos das 10 execuções (em nanossegundos): [12345, 13456, 12567, ...]
Média: 12900.5 ns
Desvio Padrão: 450.3 ns

Tipo de array: Decrescente
Algoritmo: quickSort
Tempos das 10 execuções (em nanossegundos): [5678, 5987, 5600, ...]
Média: 5788.2 ns
Desvio Padrão: 150.7 ns
...
```

## Requisitos
- Java 8 ou superior instalado

## Possíveis Melhorias
- Adicionar mais algoritmos de ordenação.
- Melhorar a visualização dos resultados.
- Implementar paralelização para testes mais rápidos.
- Permitir a personalização dos tamanhos de array via entrada do usuário.

## Autor
Criado por [Pedro Thomas](www.linkedin.com/in/pedro-gustavo-thomas-5935392b7).
