package operacoes;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite um numero ");
        int numero = leitor.nextInt();

        int resultado =(int) Raiz.calcular(Multiplicacao.calcular(numero,numero));

        System.out.println("O modulo é " + resultado);

        leitor.close();
    }
}
