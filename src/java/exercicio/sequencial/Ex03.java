package src.java.exercicio.sequencial;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int n1, n2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro Numero: ");
        n1 = sc.nextInt();
        System.out.print("Segundo Numero: ");
        n2 = sc.nextInt();
        sc.close();

        int soma = n1 + n2;
        System.out.println("Soma: " + soma);

    }
}
