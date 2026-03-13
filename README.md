# Comparação de Algoritmos de Ordenação

Implementação e benchmark de 7 algoritmos de ordenação em Java, com medição de desempenho em diferentes tipos e tamanhos de arrays.

## Sobre

O projeto executa cada algoritmo 10 vezes por cenário e calcula média e desvio padrão do tempo de execução (em nanossegundos), permitindo comparar o comportamento de cada algoritmo em condições variadas.

## Algoritmos implementados

- Bubble Sort
- Insertion Sort
- Selection Sort
- Heap Sort
- Shell Sort
- Merge Sort
- Quick Sort

## Tipos de array testados

- Crescente
- Decrescente
- Aleatório sem repetidos
- Aleatório com repetidos

## Tamanhos testados

128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768 e 65536 elementos.

## Tecnologias

- Java (Arrays, Collections, Streams)

## Como executar

```bash
javac GeradorDeArrays.java
java GeradorDeArrays
```

A saída exibe, para cada combinação de tamanho e tipo de array, os tempos de cada execução, a média e o desvio padrão de cada algoritmo.

## Estrutura do projeto

```
└── GeradorDeArrays.java   # Geração dos arrays, implementação dos algoritmos e benchmark
```

## Conceitos praticados

- Algoritmos de ordenação clássicos
- Análise de complexidade na prática
- Medição e comparação de desempenho
- Estatística básica (média e desvio padrão)
