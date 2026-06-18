package operacoes;

import java.util.Scanner;

public class Divisao {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double x = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double y = scanner.nextDouble();
        System.out.println("o resultado é: " + calcular(x, y));
    }

    public static double calcular(double x, double y){
        return x / y;
    }
}
