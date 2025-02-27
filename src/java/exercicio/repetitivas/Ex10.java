package src.java.exercicio.repetitivas;
import java.util.Scanner;

public class Ex10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double resultados[] = new double[n];
        
        for (int i = 1; i <= n; i++) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();
            
            double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
            resultados[i - 1] = media;
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f\n", resultados[i]);
        }

        sc.close();
    }
}
