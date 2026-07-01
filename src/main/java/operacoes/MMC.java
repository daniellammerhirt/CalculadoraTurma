package operacoes;

import java.util.Scanner;

public class MMC {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;

        System.out.println("Digite o primeiro valor: ");
        x = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        y = scanner.nextDouble();
        System.out.println("o resultao é: " + calcular(x,y));
    }

    public static double calcular(double x, double y) {
        if (x <= 0 || y <= 0)
            return 0;

        double mmc = 1;
        double divisor = 2;

        while (x > 1 || y > 1) {

            if (x % divisor == 0 || y % divisor == 0) {
                if (x % divisor == 0) {
                    x = Divisao.calcular(x, divisor);
                }
                if (y % divisor == 0) {
                    y = Divisao.calcular(y, divisor);
                }
                mmc = Multiplicacao.calcular(mmc, divisor);
            } else {
                divisor = Soma.calcular(divisor, 1);
            }
        }
        return mmc;
    }
}





