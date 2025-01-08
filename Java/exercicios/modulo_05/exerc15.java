import java.util.Scanner;

public class exerc15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        double total;
        switch (x) {
            case 1:
                total = y * 4.00; // cachorro quente
                break;
            case 2:
                total = y * 4.50; // x-salada
                break;
            case 3:
                total = y * 5.00; // x-bacon
                break;
            case 4:
                total = y * 2.00; // torrada simples
                break;
            case 5:
                total = y * 1.50; // refrigerante
                break;
            default:
                total = y * 0;
                break;
        }

        if (total == 0) {
            System.out.println("Valor Invalido");
        } else {
            System.out.printf("Total: R$ %.2f\n", total);
        }
    }
}
