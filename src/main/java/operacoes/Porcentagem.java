package operacoes;
import java.util.Scanner;

public class Porcentagem {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor");
        double x = scanner.nextDouble();
        System.out.println("Digite a porcentagem do valor");
        double y = scanner.nextDouble();
        System.out.println("O resultado eh: " + calcular(x,y));
    }

    public static double calcular(double x, double y){
        return (x*y)/100;
    }
}
