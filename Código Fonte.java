import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class GeradorDeArrays {

    public static void main(String[] args) {
        int[] tamanhos = {128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536};
        
        for (int tamanho : tamanhos) {
            System.out.println("Tamanho do array: " + tamanho);
            
            int[] arrayCrescente = gerarArrayCrescente(tamanho);
            int[] arrayDecrescente = gerarArrayDecrescente(tamanho);
            int[] arrayAleatorioSemRepetidos = gerarArrayAleatorioSemRepetidos(tamanho);
            int[] arrayAleatorioComRepetidos = gerarArrayAleatorioComRepetidos(tamanho);
            
            testarAlgoritmos("Crescente", arrayCrescente);
            testarAlgoritmos("Decrescente", arrayDecrescente);
            testarAlgoritmos("Aleatório Sem Repetidos", arrayAleatorioSemRepetidos);
            testarAlgoritmos("Aleatório Com Repetidos", arrayAleatorioComRepetidos);
            
            System.out.println();
        }
    }

    public static void testarAlgoritmos(String tipo, int[] arrayOriginal) {
        System.out.println("Tipo de array: " + tipo);
        String[] algoritmos = {"bubbleSort", "insertionSort", "selectionSort", "heapSort", "shellSort", "mergeSort", "quickSort"};

        for (String algoritmo : algoritmos) {
            long[] tempos = new long[10];

            for (int i = 0; i < 10; i++) {
                int[] array = Arrays.copyOf(arrayOriginal, arrayOriginal.length);
                long inicio = System.nanoTime();
                
                switch (algoritmo) {
                    case "bubbleSort":
                        bubbleSort(array);
                        break;
                    case "insertionSort":
                        insertionSort(array);
                        break;
                    case "selectionSort":
                        selectionSort(array);
                        break;
                    case "heapSort":
                        heapSort(array);
                        break;
                    case "shellSort":
                        shellSort(array);
                        break;
                    case "mergeSort":
                        mergeSort(array, 0, array.length - 1);
                        break;
                    case "quickSort":
                        quickSort(array, 0, array.length - 1);
                        break;
                    default:
                        System.out.println("Algoritmo não reconhecido");
                        break;
                }
                
                long fim = System.nanoTime();
                tempos[i] = fim - inicio;
            }
            
            System.out.println("Algoritmo: " + algoritmo);
            System.out.println("Tempos das 10 execuções (em nanossegundos): " + Arrays.toString(tempos));

            double media = calcularMedia(tempos);
            double variancia = calcularVariancia(tempos, media);
            double desvioPadrao = Math.sqrt(variancia);

            System.out.println("Média: " + media + " ns");
            System.out.println("Desvio Padrão: " + desvioPadrao + " ns");
            System.out.println();
        }
    }

    public static double calcularMedia(long[] tempos) {
        return Arrays.stream(tempos).average().orElse(0.0);
    }

    public static double calcularVariancia(long[] tempos, double media) {
        return Arrays.stream(tempos).mapToDouble(t -> Math.pow(t - media, 2)).average().orElse(0.0);
    }

    public static void mergeSort(int[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;
            mergeSort(array, esquerda, meio);
            mergeSort(array, meio + 1, direita);
            merge(array, esquerda, meio, direita);
        }
    }

    private static void merge(int[] array, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        int[] esquerdaArray = new int[n1];
        int[] direitaArray = new int[n2];

        System.arraycopy(array, esquerda, esquerdaArray, 0, n1);
        System.arraycopy(array, meio + 1, direitaArray, 0, n2);

        int i = 0, j = 0, k = esquerda;
        while (i < n1 && j < n2) {
            if (esquerdaArray[i] <= direitaArray[j]) {
                array[k++] = esquerdaArray[i++];
            } else {
                array[k++] = direitaArray[j++];
            }
        }

        while (i < n1) {
            array[k++] = esquerdaArray[i++];
        }
        while (j < n2) {
            array[k++] = direitaArray[j++];
        }
    }

    public static int[] gerarArrayCrescente(int tamanho) {
        return Arrays.stream(new int[tamanho]).map(i -> i + 1).toArray();
    }

    public static int[] gerarArrayDecrescente(int tamanho) {
        return Arrays.stream(new int[tamanho]).map(i -> tamanho - i).toArray();
    }

    public static int[] gerarArrayAleatorioSemRepetidos(int tamanho) {
        Integer[] array = new Integer[tamanho];
        for (int i = 0; i < tamanho; i++) array[i] = i + 1;
        Collections.shuffle(Arrays.asList(array));
        return Arrays.stream(array).mapToInt(Integer::intValue).toArray();
    }

    public static int[] gerarArrayAleatorioComRepetidos(int tamanho) {
        Random random = new Random();
        return random.ints(tamanho, 1, tamanho + 1).toArray();
    }
}
