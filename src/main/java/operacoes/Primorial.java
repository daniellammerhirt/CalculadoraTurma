package operacoes;

import java.util.Scanner;

public class Primorial {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.println("Digite a quantidade de números primos para o primorial: ");
        x = scanner.nextInt();

        System.out.println("o resultado é: " + calcular(x));
    }

    public static int calcular(int x) {
        int primorial = 1;
        int count = 0;
        int num = 2;

        while (count < x) {
            if (isPrime(num)) {
                primorial = (int) Multiplicacao.calcular(primorial,num);
            }
            count = (int) Soma.calcular(count, 1);
            num = (int) Soma.calcular(num, 1);
        }
        return primorial;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Raiz.calcular(n); i = (int) Soma.calcular(i, 1)) {
            if (n % i == 0) return false;
        }
        return true;
    }
}



