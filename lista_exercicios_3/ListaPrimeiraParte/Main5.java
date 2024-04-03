package ListaPrimeiraParte;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número para geração da tabuada:");
        numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":\n");
        System.out.println("Soma:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " + " + i + " = " + (numero + i));
        }

        System.out.println("\nMultiplicação:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
