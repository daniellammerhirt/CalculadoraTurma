package operacoes;
import java.util.Scanner;
public class Raiz {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o numero que deseja a raiz");
        double x = scanner.nextDouble();
        System.out.println("o resultado é " + calcularRaiz(x));

    }
    public static double calcularRaiz (double x){
        return Math.sqrt(x);
    }
}