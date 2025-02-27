package src.java.exercicio.sequencial;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        double largura, comprimento, valorMetro;

        Scanner sc = new Scanner(System.in);
        System.out.println("\nLargura: ");
        largura = sc.nextDouble();
        System.out.println("Comprimento: ");
        comprimento = sc.nextDouble();
        System.out.println("valor do metro quadrado: ");
        valorMetro = sc.nextDouble();
        sc.close();

        double area = largura * comprimento;
        double preco = area * valorMetro;
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Preço: %.2f%n%n", preco);

    }
}
