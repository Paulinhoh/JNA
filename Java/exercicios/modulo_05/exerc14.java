import java.util.Scanner;

public class exerc14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int duracao;
        if (x < y) {
            duracao = y - x;
        } else if (x == y) {
            duracao = 24;
        } else {
            duracao = 24 - x + y;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
