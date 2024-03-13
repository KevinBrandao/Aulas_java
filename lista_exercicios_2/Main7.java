import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main7 {
    public static void main(String... strings) {
        int[] x = { 1, 2, 3, 4, 5 };
        int[] y = { 3, 4, 5, 6, 7 };

        // a. Soma entre x e y
        int[] soma = somaEntreVetores(x, y);
        System.out.println("Soma entre x e y: " + Arrays.toString(soma));

        // b. Produto entre x e y
        int[] produto = produtoEntreVetores(x, y);
        System.out.println("Produto entre x e y: " + Arrays.toString(produto));

        // c. Diferença entre x e y
        int[] diferenca = diferencaEntreVetores(x, y);
        System.out.println("Diferença entre x e y: " + Arrays.toString(diferenca));

        // d. Intersecção entre x e y
        int[] interseccao = interseccaoEntreVetores(x, y);
        System.out.println("Intersecção entre x e y: " + Arrays.toString(interseccao));

        // e. União entre x e y
        int[] uniao = uniaoEntreVetores(x, y);
        System.out.println("União entre x e y: " + Arrays.toString(uniao));
    }

    // Soma entre x e y
    public static int[] somaEntreVetores(int[] x, int[] y) {
        int[] resultado = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            resultado[i] = x[i] + y[i];
        }
        return resultado;
    }

    // Produto entre x e y
    public static int[] produtoEntreVetores(int[] x, int[] y) {
        int[] resultado = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            resultado[i] = x[i] * y[i];
        }
        return resultado;
    }

    // Diferença entre x e y
    public static int[] diferencaEntreVetores(int[] x, int[] y) {
        Set<Integer> setY = new HashSet<>();
        for (int num : y) {
            setY.add(num);
        }

        int[] diferenca = Arrays.stream(x)
                .filter(num -> !setY.contains(num))
                .toArray();
        return diferenca;
    }

    // Intersecção entre x e y
    public static int[] interseccaoEntreVetores(int[] x, int[] y) {
        Set<Integer> setX = new HashSet<>();
        for (int num : x) {
            setX.add(num);
        }

        int[] interseccao = Arrays.stream(y)
                .filter(num -> setX.contains(num))
                .toArray();
        return interseccao;
    }

    // União entre x e y
    public static int[] uniaoEntreVetores(int[] x, int[] y) {
        Set<Integer> setX = new HashSet<>();
        for (int num : x) {
            setX.add(num);
        }

        Set<Integer> uniaoSet = new HashSet<>(setX);
        for (int num : y) {
            uniaoSet.add(num);
        }

        int[] uniao = uniaoSet.stream().mapToInt(Integer::intValue).toArray();
        return uniao;
    }
}
