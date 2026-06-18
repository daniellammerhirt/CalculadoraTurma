package operacoes;
import java.util.Scanner;

public class Subtracao {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double x = scanner.nextDouble();
        System.out.println("Digite o segundo numero");
        double y = scanner.nextDouble();
        System.out.println("O resultado eh: " + calcular(x,y));
    }

    public static double calcular(double x, double y){
        return x - y;
    }

}
