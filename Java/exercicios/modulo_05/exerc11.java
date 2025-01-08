import java.util.Scanner;

public class exerc11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        String negativo = (x < 0) ? "NEGATIVO" : "NÃO NEGATIVO";
        System.out.println(negativo);
    }
}
