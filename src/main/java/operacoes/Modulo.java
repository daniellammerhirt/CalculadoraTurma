package operacoes;

import java.util.Scanner;

public class Modulo {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double x;
        System.out.print("Digite o valor: ");
        x = scanner.nextDouble();

        System.out.println("o resultado é: " + calcular(x));
    }

    public static double calcular(double x){
        if(x < 0){
            x = Multiplicacao.calcular(x, -1);
        }
        return x;
    }
}
