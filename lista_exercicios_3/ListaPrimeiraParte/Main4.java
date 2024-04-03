package ListaPrimeiraParte;

public class Main4 {
    public static void main(String[] args) {
        int tamanho = 20;
        int[] A = new int[tamanho];
        int[] B = new int[tamanho];
        int[] C = new int[tamanho * 2]; // Pode conter até o dobro do tamanho inicialmente
        int indexC = 0;

        // Preencher A e B com números aleatórios de 0 a 50
        for (int i = 0; i < tamanho; i++) {
            A[i] = (int) (Math.random() * 51);
            B[i] = (int) (Math.random() * 51);
        }

        // Fusão dos arrays A e B em C (com duplicatas, a princípio)
        for (int i = 0; i < tamanho; i++) {
            if (!contains(C, indexC, A[i])) {
                C[indexC++] = A[i];
            }
            if (!contains(C, indexC, B[i])) {
                C[indexC++] = B[i];
            }
        }

        // Ordenar o vetor C
        insertionSort(C, indexC);

        // Imprimir o vetor A
        System.out.println("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println(" ");

        // Imprimir o vetor B
        System.out.println("Vetor B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println(" ");
        System.out.println("--------------------------------- ");

        // Imprimir o vetor C (elementos únicos ordenados)
        System.out.println("Vetor C (A+B ordenado e sem repetição): ");
        for (int i = 0; i < indexC; i++) {
            System.out.print(C[i] + " ");
        }

        System.out.println(" ");

    }

    // verifica se um num está presente no vetor
    public static boolean contains(int[] array, int length, int key) {
        for (int i = 0; i < length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    // ordenação Insertion Sort
    public static void insertionSort(int[] array, int length) {
        for (int i = 1; i < length; i++) {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}
