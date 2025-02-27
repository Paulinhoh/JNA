package src.java.exercicio.condicional;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        sc.close();

        String multiplos = (x % y == 0 || y % x == 0) ? "São múltiplos" : "Não são múltiplos";
        System.out.println(multiplos);
    }
}
