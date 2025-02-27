package src.java.exercicio.sequencial;

import java.util.Scanner;

public class Ex05 {
     public static void main(String[] args) {
        int a, b, c, d;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de A: ");
        a = sc.nextInt();
        System.out.print("Valor de B: ");
        b = sc.nextInt();
        System.out.print("Valor de C: ");
        c = sc.nextInt();
        System.out.print("Valor de D: ");
        d = sc.nextInt();
        sc.close();
        
        int diferenca = (a * b - c * d);
        System.out.println("Diferença: " + diferenca);
    }
}
