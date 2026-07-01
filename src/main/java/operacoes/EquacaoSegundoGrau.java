package operacoes;

import model.RetornoComposto;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Digite o valor de a: ");
        a = scanner.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = scanner.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = scanner.nextDouble();
        RetornoComposto retorno = calcular(a,b,c);
        System.out.println("os resultados são: " + retorno.getX1() + retorno.getX2());
    }

    public static RetornoComposto calcular(double a, double b, double c){
        double delta = Subtracao.calcular(Potencia.calcular(b,2), Multiplicacao.calcular(Multiplicacao.calcular(Subtracao.calcular(0,-4), a),c));
        double x1 = Divisao.calcular(Soma.calcular(Multiplicacao.calcular(b,-1), Raiz.calcular(delta)), Multiplicacao.calcular(2,a));
        double x2 = Divisao.calcular(Subtracao.calcular(Multiplicacao.calcular(b,-1), Raiz.calcular(delta)), Multiplicacao.calcular(2,a));
        return new RetornoComposto(x1, x2);
    }
}
