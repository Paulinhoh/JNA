package Java.exercicios.modulo_06;

import java.util.Scanner;

public class exerc25 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            if (n2 == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(n1 / n2);
            }
        }

        sc.close();
    }
}
