package operacoes;
import java.util.Scanner;

public class MDC {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        System.out.println("Digite o primeiro valor: ");
        x = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        y = scanner.nextDouble();
        System.out.println("O resultado é: " + calcularMDC(x, y));

    }

    public static double calcularMDC(double x, double y){
        while (y != 0) {
            double temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

}
