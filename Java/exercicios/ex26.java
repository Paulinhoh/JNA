import java.util.Scanner;

public class ex26 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fatorial = 1;
        
        for (int i = 0; i < n; i++) {
            fatorial *= (n - i);
        }

        System.out.println(fatorial);
        
        sc.close();
    }
}
