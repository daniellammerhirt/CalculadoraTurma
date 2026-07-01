package operacoes;

import java.util.Scanner;

public class Fibonacci {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double n = scanner.nextDouble();
        calcular(n);
    }

    public static double calcular(double n) {
        double n1 = 0;
        double n2 = 1;

        for (int i = 0; i < n; ++i) {
            double proximo = Soma.calcular(n1, n2);
            System.out.print(" "+ n1 +" ");
            n1 = n2;
            n2 = proximo;
        }
        return n1;
    }
}
