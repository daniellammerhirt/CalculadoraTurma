package operacoes;
import java.util.Scanner;
public class JurosCompostos {
    static void main(){
        Scanner scanner = new Scanner(System.in);

        double c;
        double i;
        double t;
        System.out.println("Digite o valor do capital inicial ");
        c = scanner.nextDouble();
        System.out.println("Digite o valor dos juros");
        i = scanner.nextDouble();
        System.out.println("Digite o tempo");
        t = scanner.nextDouble();
        System.out.println("o resultado é " + calcular(c,i,t));
    }
    public static double calcular(double c, double i, double t){
        return Multiplicacao.calcular(c,Potencia.calcular(Soma.calcular(1,i),t));
    }
}
