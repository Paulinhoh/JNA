import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Minutos gastos: ");
        int minutos = sc.nextInt();
        sc.close();

        if (minutos <= 100) {
            System.out.println("Valor a pagar: R$ 50,00");
        } else {
            int excedente = minutos - 100;
            int taxa = excedente * 2;
            System.out.println("Valor a pagar: R$ " + (50 + taxa) + ",00");
        }
    }
}