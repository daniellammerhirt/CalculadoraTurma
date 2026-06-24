package operacoes;
import java.util.Scanner;
public class Raiz {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double x;
        System.out.println("Digite o primeiro valor: ");
        x = scanner.nextDouble();
        System.out.println("o resultado é " + calcular(x));

    }
    public static double calcular(double x){
        return Math.sqrt(x);
    }
}