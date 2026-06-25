package operacoes;
import java.util.Scanner;

public class Porcentagem {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        System.out.println("Digite o primeiro valor: ");
        x = scanner.nextDouble();
        System.out.println("Digite a porcentagem do valor: ");
         y = scanner.nextDouble();
        System.out.println("o resultado é: " + calcular(x,y));
    }

    public static double calcular(double x, double y){
        return Divisao.calcular(Multiplicacao.calcular(x, y), 100);
    }
}
