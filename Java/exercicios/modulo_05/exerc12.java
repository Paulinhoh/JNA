import java.util.Scanner;

public class exerc12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();

        String parImpar = (x % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println(parImpar);
    }
}