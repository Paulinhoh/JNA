package src.java.exercicio.condicional;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        double a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Valores de A,B e C: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        sc.close();

        double areaTriangulo = a * c / 2;
        double areaCirculo = 3.14159 * Math.pow(c, 2);
        double areaTrapezio = (a + b) * c / 2;
        double areaQuadrado = Math.pow(b, 2);
        double areaRetangulo = a * b;

        System.out.printf("Triângulo: %.3f%n", areaTriangulo);
        System.out.printf("Círculo: %.3f%n", areaCirculo);
        System.out.printf("Trapézio: %.3f%n", areaTrapezio);
        System.out.printf("Quadrado: %.3f%n", areaQuadrado);
        System.out.printf("Retângulo: %.3f%n", areaRetangulo);
    }
}
