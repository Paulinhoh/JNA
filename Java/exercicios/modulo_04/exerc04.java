import java.util.Scanner;

public class exerc04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Raio: ");
        double raio = sc.nextDouble();
        sc.close();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("Area: %.4f%n", area);
    }
}
